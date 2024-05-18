package com.bookmystay.repository;

import com.bookmystay.entity.PropertyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyUserRepository extends JpaRepository<PropertyUser, Long> {
}