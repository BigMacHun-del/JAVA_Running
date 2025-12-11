import java.util.List;

public class Summoner {
    private final String name;
    //private final Ashe ashe;   //신규 객체 생성 불가
    //private final List<String> strings;  //신규 리스트 생성 불가

    public Summoner(String name){
        this.name = name;
    }  //final 이므로 여기를 기점으로 name의 값은 바뀌지 않는다.

//    public void setName(String name){
//        this.name = name;  //final 키워드이므로 오류
//    }

}
