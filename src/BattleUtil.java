public class BattleUtil {
    // 챔피언 2개를 입력 받는다.
    // 입력 받은 두 챔피언 중 더 체력이 높은 챔피언을 반환

    // 스태틱 메서드는 private 변수는 쓸 수 없고, 비즈니스 로직이나 범용적으로 쓰는 경우에 사용

    public static Champion pickHigherHp(Champion champ1, Champion champ2) {
        if(champ1.getHp() >= champ2.getHp()) {
            return champ1;
        }
        return champ2;
    }

}
