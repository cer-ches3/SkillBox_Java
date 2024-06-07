package searchengine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import searchengine.config.Site;
import searchengine.config.SitesList;
import searchengine.parsing.SiteIndexBuilder;
import searchengine.repo.SiteRepository;
import searchengine.responses.DefaultResponse;
import searchengine.responses.ErrorResponse;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class IndexingServiceImpl implements IndexingService{
    private final SiteRepository siteRepository;
    private ExecutorService executorService;
    private static final int THREAD = 4;
    private final SitesList sitesList;

    @Override
    public DefaultResponse startIndexing() {
        if(SiteIndexBuilder.isStarted()) {
            return ErrorResponse.getErrorResponse("Индексация уже запущена");
        }

        siteRepository.deleteAll();
        executorService = Executors.newFixedThreadPool(THREAD);
        SiteIndexBuilder.start();
        List<Site> siteList = sitesList.getSites();
        siteList.forEach(site -> {
            executorService.execute(new SiteIndexBuilder(site.getUrl(), site.getName()));
        });
        return new DefaultResponse(true);
    }

    @Override
    public DefaultResponse stopIndexing() {
        if (!SiteIndexBuilder.isStarted()) {
            return ErrorResponse.getErrorResponse("Индексация не запущена");
        }

        SiteIndexBuilder.stop();
        executorService.shutdown();
        try{
            executorService.awaitTermination(10000, TimeUnit.MILLISECONDS);
        }catch (InterruptedException e) {
            return ErrorResponse.getErrorResponse(e.getMessage());
        }
        return new DefaultResponse(true);
    }
}
