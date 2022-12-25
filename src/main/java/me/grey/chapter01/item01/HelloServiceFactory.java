package me.grey.chapter01.item01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main ( String[] args ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
/*

        // ServiceLoader : 자바가 기본으로 제공하는 정적 팩토리 메서드
        // ServiceLoader.load( HelloService.class ) : HelloService 타입의 임의의 서비스를 로딩한다.
        // 아래 코드가 실행되는 순간, 현재 참조할 수 있는 클래스패쓰 내에 있는 모든 HelloService의 구현체들을 가져온다 (iterable)
        ServiceLoader<HelloService> loader = ServiceLoader.load( HelloService.class );

        // 구현체 중 가장 첫번째 것을 가져온다. 없을수도 있기 때문에 Optional을 사용함
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        // 있으면 호출해라
        helloServiceOptional.ifPresent( helloService -> {
            System.out.println( helloService.hello() );
        } );
*/


        /* [ 서비스 제공자 인터페이스가 없다면 각 구현체를 인스턴스로 만들 때 리플렉션을 사용해야 한다(p.12) ]
        클래스 정보를 직접 참조하지 않는 이상, Class.forname() 으로 시작한다.
         => Class.forName( "" ) 은 문자열을 가지고 클래스 인스턴스를 생성할 수 있기 때문!
        * */
        Class<?> aClass = Class.forName( "me.whiteship.hello.ChineseHelloService" );

        // class를 가지고 인스턴스를 만든다 ( 생성자를 만들고 -> 거기서 인스턴스를 꺼낸다 )
        Constructor<?> constructor = aClass.getConstructor();
        HelloService helloService = (HelloService) constructor.newInstance();
        System.out.println( helloService.hello() );
    }
}
