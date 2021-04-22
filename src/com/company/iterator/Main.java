package com.company.iterator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> skills = List.of(
                "Java", "Spring", "Hibernate"
        );
        JavaDeveloper developer = new JavaDeveloper("Vasya", skills);
        Iterator iterator = developer.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
