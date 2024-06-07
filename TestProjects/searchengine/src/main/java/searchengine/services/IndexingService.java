package searchengine.services;

import searchengine.responses.DefaultResponse;

public interface IndexingService {
    DefaultResponse startIndexing();
    DefaultResponse stopIndexing();
}
