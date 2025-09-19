package basic.loop;

public class LoopNesting {
    public static void main(String[] args) {
        int end = 10;
        int dccnt = 0;
        int cnt = 0;
        for(int i = 1; i <= end; i++){
            cnt = 0; // 소수인지 판별이 필요한 숫자(i)의 값이 변경 될 때마다 0으로 초기화
            for(int j = 1; j <= i; j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==2){
                dccnt++;
            }
        }
        System.out.println(dccnt);
    }
}
