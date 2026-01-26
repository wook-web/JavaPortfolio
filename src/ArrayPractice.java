
// 배열 학습

public class ArrayPractice {

    public static void main (String[] args){

        int[] A = {70, 85, 90, 60, 100}; // 배열 생성

        int all = 0; // 합계 변수

        int max = A[0]; // 최댓값 변수

        int min = A[0]; // 최솟값 변수

        for (int X = 0; X < A.length; X++) {

            System.out.println(A[X]);

            all += A[X];

            if (max < A[X]) {

                max = A[X];

            }

            if (min > A[X]) {

                min = A[X];

            }


        }

        System.out.println("합계 : " + all);

        System.out.println("평균 : " + all / A.length);

        System.out.println("최댓값 : " + max);

        System.out.println("최숫값 : " + min);

    }

}

// for문을 활용하여, 배열 안의 값을 모두 출력

// 배열의 평균값 출력 - 코드 수정 팔요 | *완료

// for을 활용하여 합계값을 변수에 저장

/* 구상

   배열의 갯수는 5개 비교해야되니까

   5번 반복 for문 사용

   A[0]이 기존 최댓값 변수보다 높으면 추가

   배열값이 바뀌니까 for문의 인덱스 값 사용

   0은 Y로

   if(A[Y]>최대)

   최대 = A[Y]

   */

// for문을 활용하여 배열의 최댓값 출력 코드 완성

// if문 위치를 상단의 for문으로 이동 - 가독성 향상

// for문을 활용하여 배열의 최솟값 출력 코드 완성 + 최갯값 변수 수정