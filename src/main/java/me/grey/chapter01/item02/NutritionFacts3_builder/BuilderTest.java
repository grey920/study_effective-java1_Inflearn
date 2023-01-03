package me.grey.chapter01.item02.NutritionFacts3_builder;

public class BuilderTest {

    public static void main ( String[] args ) {
        new NutritionFacts.Builder( 10, 10 )
                .calories( 10 )
                .build();

        NutritionFactsLombok build = new NutritionFactsLombok.Builder().sodium( 0 ).build();

    }
}
