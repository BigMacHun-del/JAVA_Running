package test;

import java.util.List;
import java.util.Random;

public class Battle {
    private static Random random = new Random();

    public static void oneVsOne(Team<Champion> t1, Team<Champion> t2) {

        Champion c1 = randomPick(t1.getMembers());
        Champion c2 = randomPick(t2.getMembers());

        System.out.println("\n===== 1:1 전투 시작 =====");
        System.out.println(c1.getName() + " vs " + c2.getName());
        System.out.println("========================");
        c1.basicAttack(c2);
        c2.basicAttack(c1);

        c1.useQ(c2);
        c2.useQ(c1);
        System.out.println("========================");
    }

    private static Champion randomPick(List<Champion> list) {  //리스트 중 랜덤으로 뽑기
        return list.get(random.nextInt(list.size()));
    }


}
