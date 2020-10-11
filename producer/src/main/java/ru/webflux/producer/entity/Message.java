package ru.webflux.producer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Message implements Serializable {
    private static final long serialVersionUID = 2879465906327947298L;

    private UUID id;
    private String text;

}
