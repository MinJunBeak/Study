import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    public static void main(String[] args){
        System.out.println("********리스트********");
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133");
        System.out.println(pitches.get(1));
        System.out.println(pitches.size());
        System.out.println(pitches.remove("129"));
        System.out.println(pitches.remove(0));
        /*
        일반적인 방식
            ArrayList<String> pitches = new ArrayList<String>();
        선호되는 방식 (제네릭스로 자료형 선언)
            ArrayList<String> pitches = new ArrayList<>();
            (뒷 부분의 자료형은 명확하므로 굳이 적지 않아도 된다.)
        */
        String one = (String) pitches.get(0);
        System.out.println(one);
        System.out.println((String) pitches.get(1));

        ArrayList<String> pitches1 = new ArrayList<>();
        pitches1.add("138");
        pitches1.add("129");
        pitches1.add("142");
        System.out.println(pitches1);

        String[] data = {"138", "129", "142"};
        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches2);

        // ,(콤마를 넣는 코드)
        String result = "";
        for (int i = 0; i < pitches2.size(); i++) {
            System.out.println(i);
            result += pitches2.get(i);
            result += ",";
            System.out.println(result);
        }
        System.out.println(result.length());
        result = result.substring(0, result.length() - 1);
        System.out.println(result);

        // ,(콤마를 넣는 코드) .join 매소드를 사용
        String result1 = String.join(",", pitches2);
        System.out.println("join " + result1);

        // String.join은 문자열 배열에도 사용할 수 있다.
        String[] pitches3 = new String[]{"138", "129", "142"};
        String result3 = String.join(",", pitches3);
        System.out.println(result3);

        pitches2.sort(Comparator.naturalOrder());
        System.out.println(pitches2);
        pitches2.sort(Comparator.reverseOrder());
        System.out.println(pitches2);
    }
}