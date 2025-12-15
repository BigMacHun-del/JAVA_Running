package test;

public final class GameConstants {
    // final 클래스에서는 귀중한 정보들이 관리됨
    // ex) MAX_LEVEL = 18

    public static final int MAX_LEVEL = 18;  //상수 처리
    public static final double CRIT_CHANCE = 0.2;

    //기본 체력, 공격력, 방어력 final로 정의
    public static final int BASIC_HP = 500;
    public static final int BASIC_ATTACK = 200;
    public static final int BASIC_DEFENCE = 100;

    private GameConstants(){

    }

    //--> ENUM 과 유사하다
}