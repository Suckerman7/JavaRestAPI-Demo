package org.mertyuksel.restapidemo.model.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name = "MESSAGE")

public final class MessageEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String messageTR;

    @Column
    private String messageEN;
}
