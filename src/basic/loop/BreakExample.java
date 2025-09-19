package basic.loop;

public class BreakExample {
    public static void main(String[] args) {
        //fori 자동완성 탬프릿
        for (int i = 1; i <= 10; i++) {
            // 블록 내의 코드가 한 줄인 경우 대괄호 생략 가능합니다.
            if(i==5) break;
            System.out.print(i+" ");
        }

        System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        //중첩 반복문에서 라벨링을 통해 특정 상황에 맞게 해당 반복문으로 복귀하거나 멈출 수 있습니다.
        outer: for (int i=0; i<=2; i++) {
            for (int j=0; j<=i; j++) {
                if(i==j) break outer;
                System.out.println(i + "-" + j);
            }
        }
    }
}
