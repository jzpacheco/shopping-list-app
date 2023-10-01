package com.jzpacheco.shoppinglistapp.model;

public class Item {
    private String name;
    private String group;

    public Item(String name, String group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
