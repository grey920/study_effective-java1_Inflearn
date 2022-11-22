package me.grey.chapter01.item01.key._01_enum;

import java.util.EnumSet;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    // enum의 장점! orderStatus 필드가 가질 수 있는 값을 특정할 수 있다. (type safety)
    private OrderStatus orderStatus;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;

        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {

        // values()
        OrderStatus[] values = OrderStatus.values();
//        Arrays.stream( values ).forEach( System.out::println );

        Order order = new Order();
        if ( OrderStatus.DELIVERED == order.orderStatus ){
            System.out.println( "delivered" );
        }

//        Arrays.stream( values ).forEach( EnumSet::of );

        /* EnumSet 사용하기 */
        // 1. allOf로 모든 요소를 포함하는 EnumSet 만들기
        EnumSet<OrderStatus> setAllOf = EnumSet.allOf( OrderStatus.class );
//        setAllOf.forEach( System.out::println );

        // 2. noneOf로 빈 컬렉션을 갖는 EnumSet 만들기
        EnumSet<OrderStatus> setNoneOf = EnumSet.noneOf( OrderStatus.class );

        // 3. 들어갈 요소를 직접 입력하여 EnumSet 만들기
        EnumSet<OrderStatus> setOf = EnumSet.of( OrderStatus.PREPARING, OrderStatus.SHIPPED );

        // 4. 원하는 요소를 제거하고 EnumSet 만들기
        EnumSet<OrderStatus> setComplementOF = EnumSet.complementOf( EnumSet.of( OrderStatus.SHIPPED, OrderStatus.DELIVERING ) );
//        setComplementOF.forEach( System.out::println );

        // 5. EnumSet의 모든 요소를 복사해서 EnumSet 만들기
        EnumSet<OrderStatus> setCopyOf = EnumSet.copyOf( EnumSet.of( OrderStatus.PREPARING, OrderStatus.SHIPPED ) );

        //===== EnumsSet method ===>
        EnumSet<OrderStatus> setAdd = EnumSet.of( OrderStatus.PREPARING, OrderStatus.SHIPPED );
        setAdd.add( OrderStatus.DELIVERED );
        if ( setAdd.contains( OrderStatus.SHIPPED ) ){
            System.out.println("배송됨 포함!!");
        }

        setAdd.remove( OrderStatus.SHIPPED );
        if ( !setAdd.contains( OrderStatus.SHIPPED ) ){
            System.out.println("배송됨 삭제!!");
        }
    }
}
