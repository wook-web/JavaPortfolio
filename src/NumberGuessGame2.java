
// while 반복문 공부하는 코드입니다.

import java.util.Scanner;   // Scanner 추가
import java.util.Random;    // Random 추가

public class NumberGuessGame2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // Scanner - scan은 사용자의 입력 값

        Random random = new Random();           // Random - random

        int over = 10;

        int answer = random.nextInt(over) + 1;    // int - answer은 (0 ~ 9) + 1중 무작위 값을 지님

        //boolean isCorrect = false;  // 참과 거짓을 나타내는 변수 - 제거

        System.out.println("숫자 맞추기 게임 시작!");

        while (true) {    // while (조건)

            System.out.print("1부터 " + over + "사이 숫자를 입력하세요. : ");

            String input = scan.nextLine(); // 사용지의 입력값 받기 = input

            // 1. 숫자인지 검사

            if (!input.matches("\\d+")) {   // 만약 input이 정수와 매치된다면

                System.out.println("정수를 입력해주세요.");

                System.out.println();

                continue; // wile 처음으로 돌아감
            }

            int guess = Integer.parseInt(input);    // input는 int(정수)로 전환 = input

            // 2. 범위 검사

            if (guess < 1 || guess > over) {

                System.out.println(over + "이하의 숫자를 입력하세요.");

                System.out.println();

                continue;

            }

            // 3. 정답 비교

            if (guess == answer) {   // 입력 값 > 랜덤 값

                System.out.println("정답입니다. 게임 종료");

                break;  //isCorrect = true;    // 반복문 끝내기

            } else if (guess > answer) {   // 입력 값 > 랜덤 값

                System.out.println("너무 큽니다!");

            } else {

                System.out.println("너무 적습니다!");

            }

            System.out.println();

        }

    }

}

// 문재 : Random의 최대값과 최소값을 벗어 났을 때, 맞는 문장을 출력 - 해결
// Random 값이 높은지 낮은지 알려줄 수 있도록 코드 수정

// * 코드 개선이 필요해 보임 - 해결
// continue를 통해 코드를 더 깔끔하게 작성

// boolean 변수 제거 후, break 사용