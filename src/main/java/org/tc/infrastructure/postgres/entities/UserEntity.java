package org.tc.infrastructure.postgres.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.tc.consts.DatabaseConsts;
import org.tc.infrastructure.postgres.enums.AccountStatus;
import org.tc.infrastructure.postgres.enums.AccountType;
import org.tc.infrastructure.postgres.enums.LanguageEnum;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name= DatabaseConsts.USER_TABLE)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    UUID userId;
    @Column(unique = true)
    String username;
    @Column(unique = true)
    String email;
    @Enumerated(EnumType.STRING)
    AccountType accountType;
    @Enumerated(EnumType.STRING)
    LanguageEnum preferredLanguage;
    @Enumerated(EnumType.STRING)
    AccountStatus accountStatus;
    String passwordHash;
    @CreatedDate
    LocalDateTime createdAt;
    @LastModifiedDate
    LocalDateTime updatedAt;
    LocalDateTime lastLogin;

}
