package searchengine.parsing;

import lombok.Getter;
import searchengine.repo.SiteRepository;
import searchengine.model.Site;
import searchengine.model.StatusType;

import java.time.LocalDateTime;

public class SiteIndexBuilder implements Runnable{

    private SiteRepository siteRepository;

    private String url;
    private String name;
    @Getter
    private static volatile boolean started;


    public SiteIndexBuilder(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        Site site = createSite();

    }

    public Site createSite() {
        Site site = new Site();
        site.setStatus(StatusType.INDEXING);
        site.setStatusTime(LocalDateTime.now());
        site.setLastError("null");
        site.setUrl(url);
        site.setName(name);
        siteRepository.save(site);
        return site;
    }

    public static void start() {
        SiteIndexBuilder.started = true;
    }

    public static void stop() {
        started = false;
    }
}
