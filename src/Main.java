import java.util.Random;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();  //난수 생성

        Garen garen = new Garen("가렌", 300, GameConstants.BASIC_HP, GameConstants.BASIC_ATTACK, GameConstants.BASIC_DEFENCE, false);
        Ashe ashe = new Ashe("에쉬", 300, 400, 200, 40, false);
        //garen.takeDamage(50);

        //garen.basicAttackToAshe(ashe);
        //System.out.println(ashe.getHp());
        //ashe.basicAttackToGaren(garen);

        Champion garen1 = new Garen("가렌1", 300, GameConstants.BASIC_HP, GameConstants.BASIC_ATTACK, GameConstants.BASIC_DEFENCE,false);
        Champion dummy = new Ashe("연습용 로봇", 1000000, 2000, 200, 40,false);

        garen1.basicAttack(dummy);
        garen1.useQ(dummy);
        garen1.useW(dummy);
        garen1.useE(dummy);   //약간의 감소된 데미지로 5연타
        garen1.useR(dummy);   //남은 체력이 1000미만이면 처형

        garen1.levelUp(garen1);
    }
}