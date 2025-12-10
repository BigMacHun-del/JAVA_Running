import java.util.Random;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();  //난수 생성

        Garen garen = new Garen("가렌", 300, 400, 200, 40);
        Ashe ashe = new Ashe("에쉬", 300, 400, 200, 40);
        //garen.takeDamage(50);

        //garen.basicAttackToAshe(ashe);
        //System.out.println(ashe.getHp());
        //ashe.basicAttackToGaren(garen);

        Champion garen1 = new Garen("가렌1", 300, 400, rand.nextInt(500), 40);
        Champion ashe1 = new Ashe("에쉬1", 300, 400, 200, 40);

        garen1.basicAttack(ashe1);
        garen1.useQ(ashe1);

        garen1.levelUp(garen);
    }
}