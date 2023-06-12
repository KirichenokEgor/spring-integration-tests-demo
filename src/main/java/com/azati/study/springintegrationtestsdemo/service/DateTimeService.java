package com.azati.study.springintegrationtestsdemo.service;

import java.time.LocalDateTime;

public class DateTimeService {
    public LocalDateTime getCurrentLocalDateTime() {
        return LocalDateTime.now();
    }
}
