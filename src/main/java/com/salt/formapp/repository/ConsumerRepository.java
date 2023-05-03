package com.salt.formapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salt.formapp.entity.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

}
