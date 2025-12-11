import java.util.Random;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();  //난수 생성

        Garen garen = new Garen("가렌", 300, 400, 200, 40, false);
        Ashe ashe = new Ashe("에쉬", 300, 400, 200, 40, false);
        Champion garen1 = new Garen("가렌1", 300, 400, rand.nextInt(500), 40 ,false);
        Champion dummy = new Ashe("연습용 로봇", 1000000, 2000, 200, 40,false);
        System.out.println("총 생성된 챔피언의 수: " + garen1.getCreatedCount());

        garen1.basicAttack(dummy);
        garen1.useQ(dummy);
        garen1.useW(dummy);
        garen1.useE(dummy);   //약간의 감소된 데미지로 5연타
        garen1.useR(dummy);   //남은 체력이 1000미만이면 처형

        garen1.levelUp(garen1);

        /// 스태틱 활용
//        BattleUtil battleUtil = new BattleUtil();
//        Champion champ = battleUtil.pickHigherHp(garen1, dummy);  //스태틱 메서드가 아닐 때
        Champion champion = BattleUtil.pickHigherHp(garen1, garen);  //스태틱 메서드 (클래스명.메서드명)
        System.out.println("champion = " + champion);
        GameLog.LogEmtry entry = new GameLog.LogEmtry("로그입니다. ");  //스태틱 클래스 사용(클래스명.클래스명 객체이름 = new ~~)
        entry.print();  //스태틱 클래스 내부 선언된 print 함수

    }
}