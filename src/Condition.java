public class Condition {
    public static void main(String[] args) {

        // 변수

        int age1 = 20;
        int age2 = 19;

        //조건문
        if (age1 >= 20) {
                System.out.println("귀하의 나이는 " + age1 + "세 이며, " + "성인입니다.");
        } else {
            System.out.println("귀하의 나이는 " + age1 + "세 이며, " + "미성년자입니다.");
        }

        if (age2 >= 20) {
            System.out.println("귀하의 나이는 " + age2 + "세 이며, " + "성인입니다.");
        } else {
            System.out.println("귀하의 나이는 " + age2 + "세 이며, " + "미성년자입니다.");
        }
    }

}
