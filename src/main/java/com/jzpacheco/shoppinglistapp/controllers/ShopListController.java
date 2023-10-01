package com.jzpacheco.shoppinglistapp.controllers;

import com.jzpacheco.shoppinglistapp.model.ShopList;
import com.jzpacheco.shoppinglistapp.services.ShopListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shopList/v1")
public class ShopListController {
    @Autowired
    ShopListService shopListService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ShopList> findAll(){
        System.out.println(shopListService.findAll());
        return shopListService.findAll();
    }

    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ShopList findById(@PathVariable(value = "id") String id) {
        return shopListService.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    public ShopList create(@RequestBody ShopList shopList){
        System.out.println(shopList.toString());
        return shopListService.create(shopList);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                consumes = MediaType.APPLICATION_JSON_VALUE)
    public ShopList update(@RequestBody ShopList shopList){
        return shopListService.update(shopList);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id")String id){
        shopListService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
