package guru.springframework.mongostockquoteservice.repositories;

import guru.springframework.mongostockquoteservice.domain.QuoteHistory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface QuoteHistoryRepository extends ReactiveMongoRepository<QuoteHistory, String> {
}
