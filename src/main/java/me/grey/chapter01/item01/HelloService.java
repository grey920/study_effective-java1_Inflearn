package me.grey.chapter01.item01;

public interface HelloService {

    /**
     * 메소드 선언.
     * 자바 8 이전에도 여기까진 가능했다.
     */
    String hello();

    /**
     * 메소드 정의.
     * 자바 8 이후부터는 인터페이스에서도 메서드를 정의할 수 있게 되었다.
     * => 인스턴스 메소드로 정의하고 싶다면 default / static 메소드로 정의하고 싶다면 static 키워드 사용
     *
     * 기본 default 메서드를 사용하면 -> 인터페이스에서 새로 추가한 기능을 인스턴스들이 고치지 않고 사용할 수 있게 된다.
     * @return
     */
    default public String hi(){
        prepareMessage();
        return "hi";
    }

    /**
     * 자바 9 부터 private 한 static 메서드도 제공하기 시작.
     * ( 자바 8은 public한 static, default 메서드만 제공 )
     * 내부에서만 사용할 용도
     */
    static private void prepareMessage (){

    };

    default public String hi1(){
        prepareMessage();
        return "hi";
    }


    default public String hi2(){
        prepareMessage();
        return "hi";
    }

    /**
     * 인스턴스를 생성하지 않고도 호출할 수 있는 static 메서드
     * @return
     */
    static public String hiStatic(){
        return "hi, I'm static";
    }
}
