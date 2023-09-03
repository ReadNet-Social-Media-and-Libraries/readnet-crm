package com.readnet.readnetcrm.repository.entity.base;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

/**
 * Updatable base entity for table which has updated_date column
 */
@Getter
@Setter
@MappedSuperclass
@EntityListeners(UpdatableBaseEntityListener.class)
public class UpdatableBaseEntity {

    @Version
    private Long version;

    @Column(name = "UPDATED_DATE")
    private LocalDateTime updatedDate;
}
