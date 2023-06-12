package com.azati.study.springintegrationtestsdemo.service;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DateTimeService {
    public LocalDateTime getCurrentLocalDateTime() {
        return LocalDateTime.now();
    }
}
