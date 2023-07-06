package guru.springframework.mongostockquoteservice.service;

import guru.springframework.mongostockquoteservice.domain.QuoteHistory;
import guru.springframework.mongostockquoteservice.model.Quote;
import guru.springframework.mongostockquoteservice.repositories.QuoteHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class QuoteHistoryServiceImpl implements QuoteHistoryService {

    private final QuoteHistoryRepository repository;

    @Override
    public Mono<QuoteHistory> saveQuoteToMongo(Quote quote) {
        return repository.save(QuoteHistory.builder()
                        .ticker(quote.getTicker())
                        .price(quote.getPrice())
                        .instant(quote.getInstant())
                        .build());
    }
}
