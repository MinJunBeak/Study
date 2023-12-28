import java.util.ArrayList;
import java.util.Arrays;

public class JTJ_04 {
    public static void main(String[] args){
        System.out.println("********if 문********");
        int money = 2000;
        boolean hasCard = true;
        if (money >= 3000 || hasCard) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }
        int x = 3;
        int y = 2;
        System.out.println(x > y); // x가 크다
        System.out.println(y > x); // x가 작다
        System.out.println(x == y); // 같다
        System.out.println(x != y); // 같지 않다
        ArrayList<String> pocket = new ArrayList<>();
        pocket.addAll(Arrays.asList("paper", "handphone"));
        System.out.println(pocket);
        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else if (hasCard) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }

        System.out.println("********switch/case 문********");
        int month = 8;
        String monthString = "";
        switch (month) {  // 입력 변수의 자료형은 byte, short, char, int, enum, String만 가능하다.
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);

        System.out.println("********while 문********");
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.printf("나무를 %d번 찍었습니다\n", treeHit);
            if (treeHit == 10){
                System.out.println("나무 넘어갑니다.");
            }
        }
        // bereak 사용
        int coffee = 10;
        int m = 300;
        while (m > 0) {
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은" + coffee + "입니다.");
            if (coffee == 0) {
                System.out.println("커피가 다 떨어졌습니다.\n판매를 중지합니다.");
                break;
            }
        }
        // countinue 사용
        int a = 0;
        while (a < 10){
            a++;
            if (a % 2 == 0) {
                continue;
            }
            System.out.println(a);
        }
        System.out.println("********for 문********");
        String[] numbers = {"one", "two", "three"};
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        int[] marks = {90, 25, 67, 45, 80};
        for(int i = 0; i<marks.length; i++){
            if (marks[i] < 60){
                continue;
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
        }
        // 이중 for문(구구단 출력하기)
        for (int i=2; i<10; i++){
            for (int j=1; j<10; j++){
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
        // for each문
        for(String number: numbers){
            System.out.println(number);
        }
    }
}