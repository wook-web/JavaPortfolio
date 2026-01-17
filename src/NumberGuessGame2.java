
// while 반복문 공부하는 코드입니다.

import java.util.Scanner;   // Scanner 추가
import java.util.Random;    // Random 추가

public class NumberGuessGame2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // Scanner - scan은 사용자의 입력 값

        //Scanner sc = new Scanner(System.in);

        Random random = new Random();           // Random - random

        int over = 10;

        int count = 0;  // 시도 횟수 카운트

        int answer = random.nextInt(over) + 1;  // int - answer은 (0 ~ 9) + 1중 무작위 값을 지님

        boolean isRunning = true;  // 참과 거짓을 나타내는 변수 - 제거

        System.out.println("숫자 맞추기 게임 시작!");

        // 반복문 - 게임 플레이

        while (isRunning) {    // while (조건)

            System.out.print("1부터 " + over + "사이 숫자를 입력하세요. : ");

            String input = scan.nextLine(); // 사용지의 입력값 받기 = input

            count++;

            // 1. 숫자인지 검사

            if (!input.matches("\\d+")) {   // 만약 input이 정수와 매치가 안 된다면

                System.out.println("정수를 입력해주세요.");

                System.out.println();

                continue; // while 처음으로 돌아감
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

                System.out.println("정답입니다.");

                System.out.println(count + "번 만에 맞췄습니다!");

                System.out.println();

                while (true) {

                    System.out.print("다시 하시겠습니까? (y/n) : ");

                    String yn = scan.nextLine();

                    if (yn.matches("y")) {

                        count = 0;

                        answer = random.nextInt(over) + 1;

                        break;

                    } else if (yn.matches("n")){

                        System.out.println("게임 종료");

                        isRunning = false;

                        break;

                    } else {

                        System.out.println("y 또는 n를 입력하세요.");

                        System.out.println();

                    }

                }

            } else if (guess > answer) {   // 입력 값 > 랜덤 값

                System.out.println("정답보다 큽니다!");

            } else {

                System.out.println("정답보다 적습니다!");

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

// count 변수 추가로 시도 횟수 출력 코드 완성

// 다시하기 기능 코드 관성
// n을 입력하여도 종료가 안됨, 같은 숫자로 다시 시작 - 해결
// boolean 변수를 추가하여 해결 + random.nextInt 추가로 재시작 시, 정답이 다시 랜덤한 값

    while(true) {

        System.out.print("난이도를 선택해주세요. : ");

        String lv = scan.next.String

        if (!lv.metches("\\d+")) {

            int love = Integer.parseInt(lv);

        } else {

            System.out.print("1부터 3사이의 숫자를 입력하세요.");

            System.out.print("");

            continue;

        }

        if (lv.metches("\\d+")){

            int love = Integer.parseInt(lv);

            if(love =  1){

                over =10;

                break;

            }else if(love = 2){

                over =20;

                break;

            }else if(love = 3){

                over =30;

                break;

            }else{

                System.out.print("1부터 3사이의 숫자를 입력하세요.");

                System.out.print("");

            }

        }





        if (!lv.matches("\\d+")) {   // 만약 input이 정수와 매치가 안 된다면

            System.out.println("정수를 입력해주세요.");

            System.out.println();

            continue; // while 처음으로 돌아감

        }



    }

