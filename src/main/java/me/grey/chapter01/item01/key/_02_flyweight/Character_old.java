package me.grey.chapter01.item01.key._02_flyweight;

public class Character_old {
    private char value;

    private String color;

    private String fontFamily;

    private int fontSize;

    public Character_old ( char value, String color, String fontFamily, int fontSize ) {
        this.value = value;
        this.color = color;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}
