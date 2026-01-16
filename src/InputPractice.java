
// Scanner 학습

import java.util.Scanner; // Scanner 사용시 필수

public class InputPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner 객체 생성 - 키보드(System.in)로 부터 입력을 받을 수 있는 도구 (sc)를 만듬.

        System.out.print("나이를 입력하세요. : ");

        int age = sc.nextInt(); // sc.nextInt() : 사용자 입력한 숫자

        double age2 = sc.nextDouble(); // 궁금해서 해본 것

        if (age2 < 0) {

            System.out.println("정수를 입력해주세요.");

        } else if (age2 > 0) {

            System.out.println("정수를 입력해주세요.");

        } else if (age <= 20) {

            System.out.println("성인입니다.");

        } else {

            System.out.println("미성년자입니다.");

        }
    }
}

// 사용자가 입력한 숫자를 변수로 저장하고, if문으로 문장 출력

// 정수가 아닌 실수를 입력 했을 시, if문으로 정수를 입력하라고 출력하게 코드 수정
// * 코드에는 오류가 없으나, 입력을 2번 받아 의도와 맞지 않은 코드가 됨