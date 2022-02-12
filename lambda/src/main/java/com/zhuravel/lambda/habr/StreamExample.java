package com.zhuravel.lambda.habr;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StreamExample {

    private static final List<String> places = new ArrayList<>();

    private static List<String> getPlaces() {
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main(String[] args) {
        List<String> myPlaces = getPlaces();
        System.out.println("Places from Nepal:");

        myPlaces.stream()
                .filter(p -> p.startsWith("Nepal"))
                .map(p -> p.toUpperCase(Locale.ROOT))
                .sorted()
                .forEach(System.out::println);  //вар. 1
//                .forEach(p -> System.out.println(p)); //вар. 2
    }
}
