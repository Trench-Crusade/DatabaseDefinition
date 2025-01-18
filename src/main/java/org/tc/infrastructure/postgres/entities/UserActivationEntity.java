package org.tc.infrastructure.postgres.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tc.consts.DatabaseConsts;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name= DatabaseConsts.USER_ACTIVATION_TABLE)
public class UserActivationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    UUID userId;
    UUID activationToken;
    LocalDateTime generationTime;
    LocalDateTime invalidationTime;
}
