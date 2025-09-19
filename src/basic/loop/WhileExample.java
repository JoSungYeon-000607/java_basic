package basic.loop;

public class WhileExample {
    public static void main(String[] args) {
        int cnt = 0;
        while (cnt < 10){
            System.out.println("안녕하세요!");
            cnt++;
        }

        for(int i = 0; i < 10; i++){
            System.out.println("안녕하세요!");
        }

        System.out.println("======================================");

        // 특정 값이 소수인지, 소수가 아닌지 판별하는 문제

        int num = 23;
        int cnt2 = 0;
        for(int i = 1; i <= num; i++){
            if(num%i==0){
                cnt2++;
            }
        }
        System.out.println(cnt2);
        if(cnt2==2){
            System.out.println("소수입니다.");
        }else{
            System.out.println("소수가 아닙니다.");
        }
    }
}
