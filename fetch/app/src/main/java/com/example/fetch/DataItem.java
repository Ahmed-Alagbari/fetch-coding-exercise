package com.example.fetch;
// DataItem.java

public class DataItem {

    private String name;
    private int listId;

    public DataItem(String name, int listId) {
        this.name = name;
        this.listId = listId;
    }

    public String getName() {
        return name;
    }

    public int getListId() {
        return listId;
    }
}
