package com.azati.study.springintegrationtestsdemo.controller;

import com.azati.study.springintegrationtestsdemo.dto.request.MyItemCreateReqDto;
import com.azati.study.springintegrationtestsdemo.dto.request.MyItemUpdateReqDto;
import com.azati.study.springintegrationtestsdemo.dto.response.MyItemResDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/MyItem")
public class MyItemController {
    @ResponseStatus(CREATED)
    @PostMapping(produces = {APPLICATION_JSON_VALUE})
    public MyItemResDto create(@RequestBody MyItemCreateReqDto dto) {
        return null;
    }

    @PutMapping(value = "/{id}", produces = {APPLICATION_JSON_VALUE})
    public MyItemResDto update(@PathVariable Integer id, @RequestBody MyItemUpdateReqDto dto) {
        return null;
    }

    @GetMapping(value = "/{id}", produces = {APPLICATION_JSON_VALUE})
    public MyItemResDto get(@PathVariable Integer id) {
        return null;
    }

    @PostMapping(value = "/{id}/prepare-for-closing", produces = {APPLICATION_JSON_VALUE})
    public MyItemResDto prepareForClosing(@PathVariable Integer id) {
        return null;
    }

    @PostMapping(value = "/{id}/close", produces = {APPLICATION_JSON_VALUE})
    public MyItemResDto close(@PathVariable Integer id) {
        return null;
    }
}
