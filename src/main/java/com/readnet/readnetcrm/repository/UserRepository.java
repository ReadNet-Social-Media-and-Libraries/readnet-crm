package com.readnet.readnetcrm.repository;

import com.readnet.readnetcrm.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
