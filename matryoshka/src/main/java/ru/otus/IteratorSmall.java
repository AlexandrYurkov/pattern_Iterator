package ru.otus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorSmall implements IteratorMatryoshka{
    private int index = 0;
    private final List<String> list = new ArrayList<>();


    public IteratorSmall(Box box){
        for(int i = 0; i < box.getRed().getItems().size(); i++){
            list.add(box.getRed().getItems(i));
            list.add(box.getBlue().getItems(i));
            list.add(box.getGreen().getItems(i));
            list.add(box.getMagenta().getItems(i));
        }
    }

    public Iterator<String> getIteratorSmall(){
        return this.list.iterator();
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
