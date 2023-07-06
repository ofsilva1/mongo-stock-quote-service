package guru.springframework.mongostockquoteservice.service;

import guru.springframework.mongostockquoteservice.domain.QuoteHistory;
import guru.springframework.mongostockquoteservice.model.Quote;
import reactor.core.publisher.Mono;

public interface QuoteHistoryService {

    Mono<QuoteHistory> saveQuoteToMongo(Quote quote);
}
