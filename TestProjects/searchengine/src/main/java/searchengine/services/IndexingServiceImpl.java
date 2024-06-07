package searchengine.services;

import org.springframework.stereotype.Service;
import searchengine.responses.DefaultResponse;

@Service
public class IndexingServiceImpl implements IndexingService{
    @Override
    public DefaultResponse startIndexing() {
        return null;
    }

    @Override
    public DefaultResponse stopIndexing() {
        return null;
    }
}
