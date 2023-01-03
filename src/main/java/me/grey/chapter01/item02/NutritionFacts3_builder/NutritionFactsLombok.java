package me.grey.chapter01.item02.NutritionFacts3_builder;

import lombok.*;

/**
 * 빌더 패턴의 단점인 코드양을 줄일 수 있는 방법 -> 롬복 사용
 * 장점 : 애노테이션 하나로 코드가 엄청나게 줄어든다.
 * 단점 : 1. 모든 파라미터를 받는 생성자가 기본으로 생긴다.
 *      => 이게 싫다면 @AllArgsConstructor(access = AccessLevel.PRIVATE) 를 지정한다. 이러면 내부적으로 빌더만 이 생성자를 사용하게 된다.
 *      2. 필수값을 지정해줄 수 없다. ...!!!!! -> 이걸,, 사용할 수 없다... 치명적인걸..?
 *
 */
@Builder(builderClassName = "Builder")
@AllArgsConstructor( access = AccessLevel.PRIVATE )
public class NutritionFactsLombok {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    public static void main( String[] args) {
        /*NutritionFactsLombok nutri = new NutritionFactsLombokBuilder() //롬복 사용시 기본으로 적용되는 빌더 네임
                .servingSize(100)
                .servings(10)
                .build();*/
        NutritionFactsLombok build = new Builder()
                .calories( 100 )
                .sodium( 35 )
                .build();

    }


}
