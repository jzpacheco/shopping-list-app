package com.jzpacheco.shoppinglistapp.repositories;

import com.jzpacheco.shoppinglistapp.model.ShopList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopListRepository extends MongoRepository<ShopList,Long> {


     ShopList findById(String id);
}
