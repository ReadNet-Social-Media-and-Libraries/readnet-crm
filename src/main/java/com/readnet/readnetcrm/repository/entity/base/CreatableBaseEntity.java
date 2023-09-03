package com.readnet.readnetcrm.repository.entity.base;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(CreatableBaseEntityListener.class)
public class CreatableBaseEntity {

    /**
     * Record created date and time
     */
    @Column(name = "CREATED_DATE")
    private LocalDateTime createdDate;
}
