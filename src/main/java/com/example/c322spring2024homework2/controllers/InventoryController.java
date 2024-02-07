package com.example.c322spring2024homework2.controllers;
import com.example.c322spring2024homework2.model.Guitar;
import com.example.c322spring2024homework2.repository.InventoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private InventoryRepository inventoryRepository;

    @GetMapping("/search")
    public List<Guitar> searchGuitars
            (@RequestParam String serialNumber,
             @RequestParam double price,
             @RequestParam Guitar.Builder builder,
             @RequestParam String model,
             @RequestParam Guitar.Type type,
             @RequestParam Guitar.Wood backWood,
             @RequestParam Guitar.Wood topWood) {
        Guitar g = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        return inventoryRepository.search(g);
    }

    @PostMapping("/add")
    public void addGuitar(@RequestBody Guitar g) {
        inventoryRepository.addGuitar(g);
    }

    @GetMapping("/find/{serialNumber}")
    public Guitar findGuitar(@PathVariable String serialNumber) {
        return inventoryRepository.getGuitar(serialNumber);
    }
}
