package com.luftenberg.vevw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luftenberg.vevw.model.SomeEntity;

public interface SomeEntityRepository extends JpaRepository<SomeEntity, Long> {

}
