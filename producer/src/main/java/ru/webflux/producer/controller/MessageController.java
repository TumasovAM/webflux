package ru.webflux.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.webflux.producer.entity.Message;
import ru.webflux.producer.service.MessageService;

import java.util.UUID;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public Flux<Message> messages() {
        return messageService.messages();
    }

    @GetMapping("/{id}")
    public Mono<Message> message(@RequestParam("id") UUID uuid) {
        return messageService.message(uuid);
    }

    @PostMapping
    public Mono<Message> create(@RequestBody Message message) {
        return messageService.create(message);
    }

}
