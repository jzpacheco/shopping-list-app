package com.jzpacheco.shoppinglistapp.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Document
public class ShopList {

    @Id
    private String id;
    private String name;

    private List<ItemQuantity> itens;
    private Date createdIn;

    public ShopList() {
        this.createdIn = new Date();
    }

    public ShopList(String id, String name, List<ItemQuantity> itens) {
        this.id = id;
        this.name = name;
        this.itens = itens;
        this.createdIn = new Date();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopList shopList = (ShopList) o;
        return Objects.equals(id, shopList.id) && Objects.equals(name, shopList.name) && Objects.equals(itens, shopList.itens) && Objects.equals(createdIn, shopList.createdIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, itens, createdIn);
    }

    @Override
    public String toString() {
        return "ShopList{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", itens=" + itens +
                ", createdIn=" + createdIn +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ItemQuantity> getItens() {
        return itens;
    }

    public void setItens(List<ItemQuantity> itens) {
        this.itens = itens;
    }

    public void setCreatedIn(Date createdIn) {
        this.createdIn = createdIn;
    }

    public Date getCreatedIn() {
        return createdIn;
    }

}
