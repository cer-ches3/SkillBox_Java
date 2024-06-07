package searchengine.parsing;

import org.springframework.beans.factory.annotation.Autowired;
import searchengine.SiteRepository;
import searchengine.model.Site;
import searchengine.model.StatusType;

import java.time.LocalDateTime;

public class SiteIndexBuilder implements Runnable{

    private SiteRepository siteRepository;

    private String url;
    private String name;
    private boolean started;


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
}
