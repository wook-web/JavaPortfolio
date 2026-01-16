
// while 반복문 공부하는 코드입니다.

import java.util.Scanner;   // Scanner 추가
import java.util.Random;    // Random 추가

public class NumberGuessGame2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // Scanner - scan은 사용자의 입력 값

        Random random = new Random();           // Random - random

        int answer = random.nextInt(10) + 1;    // int - answer은 (0 ~ 9) + 1중 무작위 값을 지님

        boolean isCorrect = false;  // 예상 : 참과 거짓을 나타내는 변수

        System.out.println("숫자 맞추기 게임 시작!");

        while (!isCorrect) {    // while (조건)

            System.out.print("1부터 10사이 숫자를 입력하세요.");

            String input = scan.nextLine(); // 사용지의 입력값 받기 = input

            if (input.matches("\\d+")) {   // 만약 input이 정수와 매치된다면

                int guess = Integer.parseInt(input);    // input는 int(정수)로 전환 = input

                if (guess == answer) {

                    System.out.println("정답입니다. 게임 종료");

                    isCorrect = true;    // 반복문 끝내기

                } else {

                    System.out.println("틀렸습니다. 다시 시도하세요.");

                }


            } else {

                System.out.println("정수를 입력해주세요.");

            }

        }

    }

}

// 문재 - Random의 최대값과 최소값을 벗어 났을 때, 맞는 문장을 출력