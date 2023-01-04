package me.grey.chapter01.item02.hierarchicalbuilder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * 계층적 빌더 사용 (21p)
 * self() 를 사용하여 빌더 팩토리 계층구조를 재활용 할 수 있는 좋은 예제!
 * -> 형변환을 줄이고 하위 클래스의 메서드를 사용할 수 있음
 */
public abstract class Pizza {

    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }

    final Set<Topping> toppings;

    /**
     *
     * @param <T>
     * Builder<T extends Builder<T>> : 재귀적인 타입 제한을 사용했다. ( 추상 빌더가 자기 자신의 하위 클래스 타입을 제한 타입으로 쓰기 때문 )
     */
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf( Topping.class );

        public T addTopping( Topping topping ) {
            toppings.add( Objects.requireNonNull( topping ) );
            return self(); // self()대신 Builder<T>타입인 this를 리턴한다면 -> 클라이언트에서 사용할 떄 casting을 해줘야 한다.
            //return this; // ( 사용할 때 build()를 하면 하위 클래스가 아니라 Pizza.build()가 호출되기 때문에 캐스팅을 해야만 한다 )
        }

        abstract Pizza build();

        /**
         * 하위 클래스는 이 메서드를 재정의(overriding)하여 "this"를 반환하도록 해야한다.
         * @return
         */
        protected abstract T self ();

    }

    Pizza( Builder<?> builder ) {
        toppings = builder.toppings.clone(); // 아이템 50 참조
    }
}
