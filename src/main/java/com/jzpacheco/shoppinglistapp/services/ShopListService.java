package com.jzpacheco.shoppinglistapp.services;

import com.jzpacheco.shoppinglistapp.model.ShopList;
import com.jzpacheco.shoppinglistapp.repositories.ShopListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopListService {

    @Autowired
    ShopListRepository repository;

    public List<ShopList> findAll(){
        return repository.findAll();
    }

    public ShopList findById(String id){
        return repository.findById(id);
    }

    public ShopList create(ShopList shopList){
        return repository.save(shopList);
    }

    public ShopList update(ShopList shopList){
        ShopList entity = repository.findById(shopList.getId());

        entity.setName(shopList.getName());
        entity.setItens(shopList.getItens());

        return repository.save(entity);
    }

    public void delete(String id){
        repository.delete(repository.findById(id));
    }
}
