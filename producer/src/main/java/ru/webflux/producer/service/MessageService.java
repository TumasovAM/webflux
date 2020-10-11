package ru.webflux.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.webflux.producer.entity.Message;
import ru.webflux.producer.repository.MessageRepository;

import java.util.UUID;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Flux<Message> messages() {
        return messageRepository.findAll();
    }

    public Mono<Message> message(UUID id) {
        return messageRepository.findById(id);
    }

    public Mono<Message> create(Message message) {
        return messageRepository.save(message);
    }

}
