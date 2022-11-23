package me.grey.chapter01.item01.key._03_interface_static_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListQuiz {

    public static void main ( String[] args ) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add( 100 );
        numbers.add( 20 );
        numbers.add( 44 );
        numbers.add( 3 );

        System.out.println( "numbers = " + numbers );

//        Comparator.descendingInteger( numbers );
        Comparator<Integer> desc = ( o1, o2 ) -> o2 - o1;

        Collections.sort( numbers, desc );

        System.out.println( numbers );


        // desc.reversed() : 자바 8의 변화로 Comparator 인터페이스에 추가된 default 메서드.
        // default 메서드라 인스턴스인 desc가 필요하다. static 메서드였다면 Comparator.reversed()
        Collections.sort( numbers, desc.reversed() );
        System.out.println( numbers );
    }
}
