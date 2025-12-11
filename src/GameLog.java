public class GameLog {
    // 클래스에 static 사용하기
    // 클래스 속의 클래스에 static 붙이기(내부 클래스에서 사용)
    // Spring -> DTO -> 데이터 통신을 위한 객체  ==> 스프링에선 이런 경우 사용

    public static class LogEmtry{
        private final String message;

        public  LogEmtry(String message){
            this.message = message;
        }

        public void print(){
            System.out.println("[LOG]" + message);
        }
    }


}
