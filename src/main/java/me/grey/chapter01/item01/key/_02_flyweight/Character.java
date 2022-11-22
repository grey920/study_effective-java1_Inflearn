package me.grey.chapter01.item01.key._02_flyweight;

import java.awt.*;

public class Character {
    private char value;

    private String color;

//    private String fontFamily;
//
//    private int fontSize;

    // fontFamily와 fontSize는 잘 바뀌지 않기 때문에 하나로 합침.
    private Font font;

    public Character ( char value, String color, Font font ) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
