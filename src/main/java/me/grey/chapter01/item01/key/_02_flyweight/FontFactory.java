package me.grey.chapter01.item01.key._02_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 플라이웨이트 패턴 > 플라이웨이트 팩토리
 */
public class FontFactory {

    private static Map<String, Font> cache = new HashMap<>();

    /**
     * 플라이웨이트 패턴을 사용한 로직 메서드에 static 키워드를 붙여 "정적 팩토리 메서드"를 함께 사용하도록 함
     * 이러면 같은 font가 들어왔을 때 새로 생성하지 않고 같은 인스턴스를 리턴하므로 객체가 더 가벼워진다
     */
    public static Font getFont( String font ){
        if ( cache.containsKey( font ) ) {
            return cache.get( font );
        }
        else {
            String[] split = font.split( ":" );
            Font newFont = new Font( split[ 0 ], Integer.parseInt( split[ 1 ] ) );
            cache.put( font, newFont );
            return newFont;
        }
    }
}
