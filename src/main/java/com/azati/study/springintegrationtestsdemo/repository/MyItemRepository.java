package com.azati.study.springintegrationtestsdemo.repository;

import com.azati.study.springintegrationtestsdemo.entity.MyItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyItemRepository extends JpaRepository<MyItem, Integer> {
}
