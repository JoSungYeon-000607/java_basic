package basic.constate;

public class SwitchExample {
    public static void main(String[] args) {
        String gender = "F";

        //if문처럼 논리형 조건식이(결과값이 true, false) 들어가는게 아니라
        //분기를 나눌 기준값이 괄호안에 들어감.(문자열, 정수만 가능)
        switch (gender){
            //java 14 이후 개선된 switch case 문법
            case "M","m","남","ㅡ":
                System.out.println("남성입니다.");
                break;//케이스 실행 후 종료
            case "F","f","여","ㄹ":
                System.out.println("여성입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
