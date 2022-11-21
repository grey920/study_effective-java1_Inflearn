package me.grey.chapter01.item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main ( String[] args ) {

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

    }
}
