package basic.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] nums;

        nums = new int[5];

        nums[0] = 50;
        nums[1] = 70;
        //nums[2] = 3.14;
        //nums는 자료형이 int로 구성 된 배열이기에 double인 3.14는 nums에 들어갈 수 없습니다.
        nums[2] = (int)3.14;
        nums[3] = nums[0]+20;
//        nums[4] = Integer.parseInt("메롱"); 문자열은 바뀌긴 하지만 int자료형으로 변경할 수 없음
        nums[4] = Integer.parseInt("10");
//        nums[5] = 10; StackOverFlow 배열은 0부터 시작합니다

        System.out.println(nums.length);

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        //배열의 순회 forEach(향상된 for문)
        for(int n : nums){
            System.out.println(n);
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        //배열 확인용
        System.out.println(Arrays.toString(nums));

        //배열 초기화 단순화
        int[] pointList = {1,2,3,4,8,7,65,4,1};
    }
}
