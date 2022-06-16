package ru.zubov.storekeeper.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @GetMapping("/all")
    public ResponseEntity getGoods() {
        return ResponseEntity.ok("Запрос выполнен");
    }
}
