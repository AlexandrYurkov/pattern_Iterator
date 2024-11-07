package ru.otus;

import java.util.ArrayList;
import java.util.List;

public final class Matryoshka {

    // [0] - the smallest / [9] - the biggest
    private final List<String> items;
    private String colors;

    Matryoshka(String colors){
        items = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            items.add(colors + i);
    }

    public List<String> getItems() {
        return items;
    }

    public String getItems(int index) {
        return items.get(index);
    }
}