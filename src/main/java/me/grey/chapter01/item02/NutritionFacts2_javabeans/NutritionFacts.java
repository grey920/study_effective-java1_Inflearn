package me.grey.chapter01.item02.NutritionFacts2_javabeans;

// 코드 2-2 자바빈즈 패턴 - 일관성이 깨지고, 불변으로 만들 수 없다. (16쪽)

/**
 * 기본생성자와 getter, setter를 사용하는 패턴.
 * 장점은 객체 생성이 굉장히 간단해진다는 점. (이전에는 파라미터로 다 넘겨줘야했고, 따라서 많으면 뭐가 들어가야 하는지 헷갈렸다)
 * 단점은 1. 어디까지 셋팅해야 완전한 객체인건지 알기 어렵다 (== 일관성이 깨진다) -> 주석남기고 문서화하는 방법밖에 없다.
 * 2. setter가 있어서 불변객체로 만들기 어렵다.
 *
 * 1.의 단점은 '필수' 필드들은 기본 생성자로 받고, 옵셔널한 필드들은 setter로 받게 하여 처리할 수 있지만, 2.의 단점이 여전히 남는다. java에서는 프리징 기능을 임의로 구현해야 함
 * ==> 그래서 이 책에서 추천하는게 "빌더"!!!
 */
public class NutritionFacts {
    // 필드 (기본값이 있다면) 기본값으로 초기화된다.
    private int servingSize  = -1; // 필수; 기본값 없음
    private int servings     = -1; // 필수; 기본값 없음
    private int calories     = 0;
    private int fat          = 0;
    private int sodium       = 0;
    private int carbohydrate = 0;
    private boolean healthy;

    public NutritionFacts () { }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);

        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }
}
