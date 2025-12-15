package test;

import java.util.ArrayList;
import java.util.List;

// T : 타입 / E : 원소(Element) / K : 키

public class Team<T extends Champion> {    //챔피언을 상속 받는 요소들만 올 수 있다. --> 상한 제한 적용
    private List<T> members = new ArrayList<>();
    private String name;

    public Team() {}

    public Team(String name) {
        this.name = name;
    }

    public void add(T champion){   //매개변수 타입 제네릭
            members.add(champion);
        }
        public T get(int index){     //반환 타입 제네릭
            return members.get(index);
        }

        public void printTeam(List<Champion> list){  //제네릭은 상속을 이해하지 못함 --> 와일드 카드 사용해야함
        System.out.println("T!!@@@");
    }

    public void printChampion(List<? extends Champion> list){  //하위 와일드 카드, 하지만 요소 추가 불가 --> super 사용해야 함
        System.out.println("T!!@@@");
    }

    public void printChampion2(List<? super Champion> list){  // 상위 와일드 카드, 요소 추가하기
        list.add(new Garen("가렌2", 300, GameConstants.BASIC_HP, GameConstants.BASIC_ATTACK, GameConstants.BASIC_DEFENCE,false));
    }

    public List<T> getMembers() {
            return members;
    }

    public void addMember(T champion) {
        members.add(champion);
        System.out.println(champion.getName() + "이(가) " + name + " 팀에 합류!");
    }

    public int getTotalHp() {
        return members.stream().mapToInt(Champion::getHp).sum();
    }

    public static void printTeamMembers(List<? extends Champion> team){   //제네릭 와일드카드 적용해보기
            team.stream()
                    .map(Champion::getName)     //이름만 뽑아내기
                    .forEach(System.out::println);   //뽑아낸 데이터 각각 출력
    }

    public List<T> getMembersName() {    //팀원들의 이름 출력
        return members;
    }
}
