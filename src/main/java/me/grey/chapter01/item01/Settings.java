package me.grey.chapter01.item01;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see Settings#getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    public Settings(){}

    public Settings ( boolean useAutoSteering, boolean useABS, Difficulty difficulty ) {
        this.useAutoSteering = useAutoSteering;
        this.useABS = useABS;
        this.difficulty = difficulty;
    }

    // 1) private 생성자를 만들어 외부에서 변경할 수 없도록 한다.
    //    private Settings() {}
    // 2) 미리 만들어놓는다.
    private static final Settings SETTINGS = new Settings();

    // 3) 정적 팩토리를 제공한다
    public static Settings getInstance() {
        return SETTINGS;
    }

    public static void main ( String[] args ) {
        System.out.println( new Settings() );
        System.out.println( new Settings() );
        System.out.println( new Settings() );

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        System.out.println( Settings.getInstance() );
        System.out.println( Settings.getInstance() );
        System.out.println( Settings.getInstance() );

        Boolean.valueOf(true );
    }
}
