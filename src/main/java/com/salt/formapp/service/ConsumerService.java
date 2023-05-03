package com.salt.formapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salt.formapp.entity.Consumer;
import com.salt.formapp.repository.ConsumerRepository;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    public List<Consumer> getConsumers() {
        return consumerRepository.findAll();
    }

    public void addConsumer(Consumer consumer) {

        consumerRepository.save(consumer);
    }
}
