package com.readnet.readnetcrm.repository.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.readnet.readnetcrm.repository.entity.base.UpdatableBaseEntity;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 * Base Person class for user, librarian, ...
 */
@Getter
@Setter
@MappedSuperclass
public class BasePerson extends UpdatableBaseEntity {
    private String firstName;
    private String lastName;
    private Long identityNumber;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;
}
