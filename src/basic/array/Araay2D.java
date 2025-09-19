package basic.array;

import java.util.Arrays;

public class Araay2D {
    public static void main(String[] args) {
        //배열은 선언할 때 각 인덱스 자리의 값이 비어있지 않고
        //각 타입의 기본값으로 초기화 됩니다.
        //기본값: 정수 0, 실수 0.0, 논리 false, 문자(공백), 기타 null
        int[][] nums = new int[3][4];
        nums[1][1] = 100;
        System.out.println(Arrays.deepToString(nums));

        for(int[] a : nums){
            for(int i : a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
