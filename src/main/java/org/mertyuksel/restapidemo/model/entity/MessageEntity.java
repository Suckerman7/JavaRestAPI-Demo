package org.mertyuksel.restapidemo.model.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
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
