package me.grey.chapter01.item01.key._03_interface_static_method;

import java.util.List;

public interface Comparator {

    static void descendingInteger( List<Integer> integers ){

        integers.stream()
                .sorted( java.util.Comparator.reverseOrder() )
                .forEach( System.out::println );

    }
}
