
// 배열 학습

public class ArrayPractice {

    public static void main (String[] args){

        int all = 0; // 합계 변수

        int[] A = {70, 85, 90, 60, 100}; // 배열 생성

        for (int X = 0; X < A.length; X++) {

            System.out.println(A[X]);

            all += A[X];

        }

        System.out.println(all / A.length);

    }

}

// for문을 활용하여, 배열 안의 값을 모두 출력
// 배열의 평균값 출력 - 코드 수정 팔요 | *완료
// for을 활용하여 합계값을 변수에 저장