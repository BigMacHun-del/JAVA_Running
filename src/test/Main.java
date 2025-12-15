package test;

import test.Battle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();  //난수 생성

        Champion garen1 = new Garen("가렌1", 300, GameConstants.BASIC_HP, GameConstants.BASIC_ATTACK, GameConstants.BASIC_DEFENCE,false);
        Champion ashe1 = new Ashe("에쉬1", 1000000, 2000, 200, 40,false);
        Champion garen2 = new Garen("가렌2", 300, GameConstants.BASIC_HP, GameConstants.BASIC_ATTACK, GameConstants.BASIC_DEFENCE,false);
        Champion ashe2 = new Ashe("에쉬2", 1000000, 2000, 200, 40,false);
        Champion garen3 = new Garen("가렌3", 300, GameConstants.BASIC_HP, GameConstants.BASIC_ATTACK, GameConstants.BASIC_DEFENCE,false);
        Champion ashe3 = new Ashe("에쉬3", 1000000, 2000, 200, 40,false);

        List<Garen> garens = new ArrayList<>();
        Team<Garen> team = new Team<>();


        //team.add(garens.get(0));
        //List<Champion> champions = new ArrayList<Garen>();  --> 제네릭은 상속관계를 이해하지 못한다


        //List
        List<Champion> list = new ArrayList<>();   //객체의 정보를 담겠다
        list.add(garen1);  //삽입
        list.add(garen2);
        list.add(garen3);
        list.add(ashe1);
        list.add(ashe2);
        list.add(ashe3);

        // 챔피언 Pool 구성
        ChampionPool pool = new ChampionPool();
        pool.addChampion(garen1);
        pool.addChampion(garen2);
        pool.addChampion(garen3);
        pool.addChampion(ashe1);
        pool.addChampion(ashe2);
        pool.addChampion(ashe3);

        // 팀 생성
        Team<Champion> blue = new Team<>("블루");
        Team<Champion> red = new Team<>("레드");

        // 팀 배치
        blue.addMember(pool.get("가렌1"));
        blue.addMember(pool.get("에쉬1"));
        blue.addMember(pool.get("가렌2"));

        red.addMember(pool.get("에쉬2"));
        red.addMember(pool.get("가렌3"));
        red.addMember(pool.get("에쉬3"));

        System.out.println("블루팀 전체 체력: " + blue.getTotalHp());
        System.out.println("레드팀 전체 체력: " + red.getTotalHp());

        Battle.oneVsOne(red, blue);



        //자주 쓰는 리스트 반복문 응용
        //1.
        for (int i = 0; i<list.size(); i++) {list.get(i);}  //인덱스별 리스트 크기만큼 하나씩 접근
        //2.
        for (Champion champion1 : list) {}   // 챔피언 요소하나씩 접근

        //Map<키 : 값>
        Map<Integer, Champion> map = new HashMap<>();

        map.put(1, garen1); //삽입
        map.get(1);  //값 반환
        boolean d = map.containsKey(1); // 키에 해당하는 값이 존재하는지
        map.remove(1);  //삭제

        Set<Integer> integers = map.keySet(); //키 값 전체 출력
        Collection<Champion> collection = map.values();

        //map 반복문 응용
        for (Integer key : map.keySet()){  // 전체 키를 기준으로 키값 증가시키며 반복
            Champion champ = map.get(key);
        }
    }
}