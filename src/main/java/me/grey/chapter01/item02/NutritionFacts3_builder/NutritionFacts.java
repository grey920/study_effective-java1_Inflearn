package me.grey.chapter01.item02.NutritionFacts3_builder;

/**
 * 빌더 패턴의 장점
 *  1. 인스턴스를 만들 때 필수 속성을 강제할 수 있다. -> 자바빈즈 패턴보다 안전함. (객체를 consist하게 만들 수 있음)
 *  * 모든 경우에 다 쓰는 것이 아니다!!!
 *  - [필수적인 필드]와 [필수적이지 않은 필드]가 나뉘어져 있고, 이 때문에 생성자의 매개변수가 많이 늘어난다면, 그리고 이 객체를 불변하게 만들고 싶다면 -> 빌더 패턴이 좋음
 *  - 그렇지 않다면 자바빈즈 패턴이나 생성자 체이닝으로 해결하는 것도 좋다.
 *
 *  빌더 패턴의 단점
 *  1. 코드 양이 너무 많다 (필드들도 중복됨)
 */
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static void main(String[] args) {

        NutritionFacts cocaCola = new Builder(240, 8)
                .build();
    }

    public static class Builder {
        // 필수 매개변수
        private final int servingSize;
        private final int servings;

        // 선택 매개변수 - 기본값으로 초기화한다.
        private int calories      = 0;
        private int fat           = 0;
        private int sodium        = 0;
        private int carbohydrate  = 0;

        /**
         * 필수값을 빌더의 생성자에 넣어준다.
         * @param servingSize
         * @param servings
         */
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings    = servings;
        }

        /**
         * 옵션값들은 setter와 비슷하게 따로 셋팅할 수 있도록 메서드를 제공한다.
         * return은 Builder 자체를 리턴한다 ( void가 아닌 게 setter와의 차이점. ). 이 특징 때문에 메서드 체이닝(fluent API)이 가능해진다.
         * @param val
         * @return
         */
        public Builder calories( int val)
        { calories = val;      return this; }
        public Builder fat( int val)
        { fat = val;           return this; }
        public Builder sodium( int val)
        { sodium = val;        return this; }
        public Builder carbohydrate( int val)
        { carbohydrate = val;  return this; }

        /**
         * 최종적으로 build()를 할 때 우리가 원하는 실제 객체를 만들어준다.
         * @return
         */
        public NutritionFacts build() {
            return new NutritionFacts(this );
        }
    }

    private NutritionFacts( Builder builder) {
        servingSize  = builder.servingSize;
        servings     = builder.servings;
        calories     = builder.calories;
        fat          = builder.fat;
        sodium       = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

}
