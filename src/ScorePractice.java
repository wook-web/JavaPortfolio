
// 점수 등급 출력기

public class ScorePractice {

    public static void main(String[] args) {

        for (int score = 60; score <= 100; score += 10) {

            if (score >= 100) {
                System.out.println("점수 : " + score + " / 등급 : A+");
            } else if (score >= 90) {
                System.out.println("점수 : " + score + " / 등급 : A");
            } else if (score >= 80) {
                System.out.println("점수 : " + score + " / 등급 : B");
            } else if (score >= 70) {
                System.out.println("점수 : " + score + " / 등급 : C");
            } else {
                System.out.println("점수 : " + score + " / 등급 : F");
            }
        }

        System.out.println();// 다른 방식의 코드

        for (int score = 60; score <= 100; score += 10) {

            String grade; // 변수

            if (score >= 100) grade = "A+";
            else if (score >= 90) grade = "A";
            else if (score >= 80) grade = "B";
            else if (score >= 70) grade = "C";
            else grade = "F";

            System.out.println("점수 : " + score + " / 등급 : " + grade);

        }



    }
}
