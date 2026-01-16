
// 숫자 맞추기 게임

import java.util.Scanner;
import java.util.Random; // 랜덤

public class NumberGuessGame1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Random random = new Random(); // 새로운 랜덤 추가

        // 1 ~ 10 사이 랜덤 숫자 생성

        int answer = random.nextInt(10) + 1;

        System.out.print("1부터 10사이의 숫자를 맞혀보세요. : ");

        String input = scan.nextLine();

        if (input.matches("\\d+")) { // 만약 input이 정수 일 겅우

            int guess = Integer.parseInt(input); // guess는 input에 있는 (int)정수 값만 인식

            if (guess == answer) {

                System.out.println("정답입니다.");

            } else {

                System.out.println("틀렸습나디.");

                System.out.println("정답 : " + answer);

            }

        } else {

            System.out.println("정수를 입력해주세요.");

        }

    }

}
