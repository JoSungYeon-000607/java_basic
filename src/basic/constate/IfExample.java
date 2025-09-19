package basic.constate;

public class IfExample {
    //조건문
    public static void main(String[] args) {
        //자바는 위 형태의 main 함수가 있어야 실행이 됨

        int score = 95;
        if (score >= 70){
            //sout
            System.out.println("점수가 70점 이상입니다. 합격입니다!");
        }else if(score < 70){
            System.out.println("점수가 70점 미만입니다. 불합격입니다.");
        }
        //이 문장은 두 조건에 공통적으로 들어가는 내용
        //따라서 if 종료된 후 출력
        System.out.println("고생하셨습니다!");
    }
}
