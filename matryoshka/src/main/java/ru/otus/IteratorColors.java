package ru.otus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorColors implements IteratorMatryoshka{
    private int index = 0;
    private final List<String> list = new ArrayList<>();

    public IteratorColors(Box box){
        this.list.addAll(box.getRed().getItems());
        this.list.addAll(box.getBlue().getItems());
        this.list.addAll(box.getGreen().getItems());
        this.list.addAll(box.getMagenta().getItems());
    }

    public Iterator<String> getIteratorColors() {
        return list.iterator();
    }

    @Override
    public boolean hasNext() {
        return list.size() < index;
    }

    @Override
    public String next() {
        return list.get(index++);
    }
}
