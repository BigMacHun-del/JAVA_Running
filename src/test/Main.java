package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();  //난수 생성

        Champion garen1 = new Garen("가렌1", 300, GameConstants.BASIC_HP, GameConstants.BASIC_ATTACK, GameConstants.BASIC_DEFENCE,false);
        Champion dummy = new Ashe("연습용 로봇", 1000000, 2000, 200, 40,false);

        List<Garen> garens = new ArrayList<>();
        Team<Garen> team = new Team<>();

        //team.add(garens.get(0));
        //List<Champion> champions = new ArrayList<Garen>();  --> 제네릭은 상속관계를 이해하지 못한다




//        //List
//        List<Champion> list = new ArrayList<>();   //객체의 정보를 담겠다
//        list.add(garen1);  //삽입
//        //생성하면서 삽입할 수 있음
//        list.add(new Garen("가렌", 200, GameConstants.BASIC_HP, GameConstants.BASIC_ATTACK, GameConstants.BASIC_DEFENCE,false ));
//
//        Champion champion = list.get(1); //가렌
//        System.out.println("champion = " + champion);  //주소값 출력, toString 오버라이드 없음
//
//        int a = list.size();  //리스트 사이즈
//        list.remove(1);  //리스트 삭제
//        boolean b = list.contains(dummy);   //해당 요소가 존재하는지
//        boolean c = list.isEmpty(); //리스트가 비어있는지
//
//        //자주 쓰는 리스트 반복문 응용
//        //1.
//        for (int i = 0; i<list.size(); i++) {list.get(i);}  //인덱스별 리스트 크기만큼 하나씩 접근
//        //2.
//        for (Champion champion1 : list) {}   // 챔피언 요소하나씩 접근
//
//        //Map<키 : 값>
//        Map<Integer, Champion> map = new HashMap<>();
//
//        map.put(1, garen1); //삽입
//        map.get(1);  //값 반환
//        boolean d = map.containsKey(1); // 키에 해당하는 값이 존재하는지
//        map.remove(1);  //삭제
//
//        Set<Integer> integers = map.keySet(); //키 값 전체 출력
//        Collection<Champion> collection = map.values();
//
//        //map 반복문 응용
//        for (Integer key : map.keySet()){  // 전체 키를 기준으로 키값 증가시키며 반복
//            Champion champ = map.get(key);
//        }
    }
}