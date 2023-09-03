package com.readnet.readnetcrm.repository.entity.base;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Listener for entities pre persist to fill created_date
 */
@Lazy
@Component
public class CreatableBaseEntityListener {

    /**
     * Sets createdDate column pre persistent
     * @param creatableBaseEntity
     */
    public void prePersist(CreatableBaseEntity creatableBaseEntity) {
        creatableBaseEntity.setCreatedDate(LocalDateTime.now());
    }
}
