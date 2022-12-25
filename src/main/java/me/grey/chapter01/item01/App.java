package me.grey.chapter01.item01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main ( String[] args ) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext( AppConfig.class );
        HelloService helloService = applicationContext.getBean( HelloService.class );
        System.out.println( "helloService.hello() = " + helloService.hello() );

    }
}
