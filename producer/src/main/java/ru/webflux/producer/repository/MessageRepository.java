package ru.webflux.producer.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ru.webflux.producer.entity.Message;

import java.util.UUID;

@Repository
public interface MessageRepository extends ReactiveCrudRepository<Message, UUID> {
}
