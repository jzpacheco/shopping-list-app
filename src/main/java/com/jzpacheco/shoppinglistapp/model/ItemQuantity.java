package com.jzpacheco.shoppinglistapp.model;

public class ItemQuantity {
    private Item item;
    private int quantity;

    public ItemQuantity(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ItemQuantity{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
