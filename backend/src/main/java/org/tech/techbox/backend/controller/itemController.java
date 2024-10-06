package org.tech.techbox.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tech.techbox.backend.entity.Item;
import org.tech.techbox.backend.repository.ItemRepository;

import java.util.List;

@RestController
public class itemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/api/items")
    public List<Item> getItems() {
        List<Item> items = itemRepository.findAll();
        return items;
    }
}
