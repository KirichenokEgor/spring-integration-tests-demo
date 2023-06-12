package com.azati.study.springintegrationtestsdemo.component;

import com.azati.study.springintegrationtestsdemo.dto.response.MyItemResDto;
import com.azati.study.springintegrationtestsdemo.entity.MyItem;

public class MyItemMappers {
    public static MyItemResDto toMyItemResDto(MyItem item) {
        return new MyItemResDto()
                .setId(item.getId())
                .setName(item.getName())
                .setNumber(item.getNumber())
                .setStatus(item.getStatus().name())
                .setLastChangedDateTime(item.getLastChangedDateTime());
    }
}
