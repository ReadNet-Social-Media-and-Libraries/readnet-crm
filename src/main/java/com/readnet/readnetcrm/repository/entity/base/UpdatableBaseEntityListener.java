package com.readnet.readnetcrm.repository.entity.base;

import java.time.LocalDateTime;

import jakarta.persistence.PreUpdate;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Listener for entities pre update to fill updated_date field
 */
@Lazy
@Component
public class UpdatableBaseEntityListener {

    @PreUpdate
    public void preUpdate(UpdatableBaseEntity updatableBaseEntity) {
        updatableBaseEntity.setUpdatedDate(LocalDateTime.now());
    }
}
