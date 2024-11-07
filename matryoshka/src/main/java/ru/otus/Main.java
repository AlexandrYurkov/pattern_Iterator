package ru.otus;

import java.util.Iterator;
import java.util.List;

public class Main {
    private static String print(List s){
        return s.toString();
    }
    public static void main(String[] args) {
        Box test = new Box();

        for(int i = 0; i < test.getRed().getItems().size(); i++){
            System.out.print(test.getRed().getItems(i) + " "
                    + test.getBlue().getItems(i) + " "
                    + test.getGreen().getItems(i) + " "
                    + test.getMagenta().getItems(i) + "\n");
        }

        System.out.println("*************************************");
        System.out.println(print(test.getRed().getItems()) + " | " + "\n"
                +print(test.getBlue().getItems()) + " | " + "\n"
                +print(test.getGreen().getItems()) + " | " + "\n"
                +print(test.getMagenta().getItems()));

        System.out.println("*************************************");
        Iterator<String> it = test.getColorFirstIterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("*************************************");
        Iterator<String> its = test.getSmallFirstIterator();
        while (its.hasNext())
            System.out.println(its.next());

    }


}