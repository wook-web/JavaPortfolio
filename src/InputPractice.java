
// Scanner 학습

import java.util.Scanner; // Scanner 사용시 필수

public class InputPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // sc = 변수, new Scanner = scanner를 새로 만듬, System.in = 키보드 입력

        System.out.print("나이를 입력하세요. : ");

        // int age = sc.nextInt(); : 사용자 입력한 숫자

        String input =sc.nextLine(); // 사용자한테 문자열 받기 Ex) 1, 1.1, abc

        if (input.matches("\\d+")) {

            // input.matches("\\d+") - 숫자인지 확인
            // "\d" - 숫자
            // "+" - 하나 이상

            int age = Integer.parseInt(input); // 문자열 → 정수 / 변환

            if (age >= 20) {

                System.out.println("성인입니다.");

            } else {

                System.out.println("미성년자입니다.");

            }

        } else {

            System.out.println("올바른 나이를 입력해주세요.");

        }
    }
}

// 사용자가 입력한 숫자를 변수로 저장하고, if문으로 문장 출력

// 정수가 아닌 실수를 입력 했을 시, if문으로 정수를 입력하라고 출력하게 코드 수정
// * 코드에는 오류가 없으나, 입력을 2번 받아 의도와 맞지 않은 코드가 됨 - 해결

// 해결에 사용된 코드 :
// String name =Sanner name.nextLine();
// (input.matches("\\d+"))
// int age = Integer.parseInt(input);

// int 이름 = scanner 이름.nextInt(); - 정수 만 받기
// double 이름 = scanner 이름.next.Double(); - 실수, 정수 받기
// String 이름 = scanner 이름.nextLine(); - 한 줄 전체 받기