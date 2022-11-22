package me.grey.chapter01.item01.key._02_flyweight;

public final class Font {

    final String family;

    final int size;

    public Font ( String family, int size ) {
        this.family = family;
        this.size = size;
    }

    public String getFamily(){ return family; }

    public int getSize(){ return size; }
}
