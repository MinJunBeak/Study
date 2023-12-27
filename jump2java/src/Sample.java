import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Sample {
    // 상수집합
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
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

        System.out.println("********맵********");
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));
        System.out.println(map.get("java"));
        System.out.println(map.getOrDefault("java", "자바"));
        System.out.println(map.containsKey("people"));
        // System.out.println(map.remove("people"));
        // System.out.println(map.getOrDefault("people", "없어용"));
        System.out.println(map.size());
        System.out.println(map.keySet());
        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList);

        System.out.println("********집합********");
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        // 교집합
        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);
        // 합집합
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);
        // 차집합
        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);
        System.out.println(substract);
        // 집합 자료형과 관련된 메서드
        System.out.println(set);
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);

        set.addAll(Arrays.asList("Python", "C++", "C")); // 값을 한꺼번에 넣기
        System.out.println(set);

        set.remove("To");
        System.out.println(set);

        System.out.println("********상수집합********");
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);

        for(CoffeeType type: CoffeeType.values()) {
            System.out.println(type);
        }

        System.out.println("********형 변환과 Final********");
        String num = "123";
        // 문자열을 정수로
        int n = Integer.parseInt(num);
        System.out.println(n);
        // 정수를 문자열로
        String st_num = "" + n;
        System.out.println(st_num);
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);
        System.out.println(num1);
        System.out.println(num2);
        // 실수 형태의 문자열을 실수로
        String num3 = "123.456";
        double d = Double.parseDouble(num3);
        System.out.println(d);
        // 정수를 실수로
        int n1 = 123;
        double d1 = n1;
        System.out.println(d1);
        // 실수를 정수로
        double d2 = 123.456;
        int n2 = (int) d2;
        System.out.println(n2);
        // 실수 형태의 문자열을 정수로 바꾸려면 실수로 변경후 정수로 바꾸면 됨.
        double n3 = Double.parseDouble(num3);
        int n4 = (int) n3;
        System.out.println(n4);

        // final은 자료형의 값을 단 한번만 설정하고 다시 설정이 불가능한것.
        final int n5 = 123;
        // n5 = 456; // final로 설정했기 때문에 바꿀수 없음
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        // a = new ArrayList<>(Arrays.asList("c", "d")); // 리스트도 마찬가지
    }
}