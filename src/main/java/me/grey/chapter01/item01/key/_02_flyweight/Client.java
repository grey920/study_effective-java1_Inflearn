package me.grey.chapter01.item01.key._02_flyweight;

/**
 * 사용하는 소스
 */
public class Client {

    public static void main ( String[] args ) {
        // FontFactory fontFactory = new FontFactory();

        // FontFactory.getFont -> 플라이웨이트 팩토리 메서드를 static으로 만들어서 이 3개의 Character가 하나의 인스턴스를 공유하도록 만들어서 더 가볍게 했다.
        Character c1 = new Character( 'h', "white", FontFactory.getFont( "nanum:12" ) );
        Character c2 = new Character( 'e', "white", FontFactory.getFont( "nanum:12" ) );
        Character c3 = new Character( 'l', "white", FontFactory.getFont( "nanum:12" ) );
    }
}
