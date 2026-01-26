
// 배열 학습

public class ArrayPractice {

    public static void main (String[] args){

        int all = 0; // 합계 변수

        int[] A = {70, 85, 90, 60, 100}; // 배열 생성

        for (int X = 0; X < A.length; X++) {

            System.out.println(A[X]);

            all += A[X];

        }

        System.out.println("합계 : " + all);

        System.out.println("평균 : " + all / A.length);

        for (int Y = 0; Y < A.length ; Y++) {

            if (>) {

                

            }

        }

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