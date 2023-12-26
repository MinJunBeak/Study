// 클래스 블록
// 클래스명은 명사로 지어야 하며, 대문자로 시작해야 한다.
// 여러 개의 단어를 조합하여 만들 경우 각 단어의 첫 번째 글자는 대문자이어야 한다.(파스칼 케이스)
public class study {
    /* 메서드 블록
        접근제어자, static 메서드, 리턴값 없음, 메서드 이름(입력 자료형, 매개변수)
        매서드명은 동사로 하며, 소문자로 시작한다.
     여러 개의 단어를 조합하여 만들 경우 맨 첫 글자를 제외한 나머지 단어의 첫 글자는 대문자를 써서 구분한다.(카멜 케이스)
    */
    public static void main(String[] args){
        System.out.println("Hello World");
        int a; // 변수 a의 자료형은  int이다.
        String b; // 변수 b의 자료형은 String이다.
        // 변수명은 짧지만 의미가 있어야하며, 한눈에 봐도 사용한 이유를 알아야 함.
        // 순서를 의미하고 임시로 쓰이는 정수의 변수명은 i,j,k,m,n을 사용하며 문자의 경우 c,d,e등을 사용한다.
        // 변수명에 _,$를 쓸 수 있지만 시작 문자로 사용하는 것은 지양하자.

        a = 1;
        b = "hello java";
        String c = "변수 선언과 동시에 값을 대입";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("********숫자********");
        int age = 2147483647;
        long countOfStar = 8764827384923850L; // 8764827384923849보다 크면 L을 붙임
        System.out.println(countOfStar);
        float pi = 3.14F; // 1.2를 표현하려면 8바이트를 사용하는 double형을 사용 float는 4바이트는 너무 작음 따라서 뒤에 F,f를 붙임
        double morePi = 3.14159265358979323846;
        System.out.println(pi);
        double d1 = 123.4;
        double d2 = 1.234e2; // e2는 10^2를 의미한다. (if문으로 같은지 확인하고싶다)
        boolean isTrue = d1 == d2; // 변수에 저장해서 사용해도 됨.
        if (d1 == d2) { //boolean isTrue = d1 == d2;
            System.out.println("isTrue");
        }

        int octal = 023; // 8진수로 표현 : 10진수 19
        int hex = 0xC; // 16진수로 표현 : 10진수 12

        int num1 = 11;
        int num2 = 5;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2); // int로 설정해서 그런지 몫만 나온다.
        System.out.println(num1%num2);
        System.out.println(num2%num1);

        int i = 0;
        System.out.println(i++);  // 0 출력
        System.out.println(i);  // 1 출력
        System.out.println(++i);  // 2 출력

        System.out.println("********불********");
        boolean isSuccess = true;
        boolean isTest = false;
        System.out.println(2 > 1);             // 참
        System.out.println(1 == 2);            // 거짓
        System.out.println(3 % 2 == 1);        // 참 (3을 2로 나눈 나머지는 1이므로 참이다.)
        System.out.println("3".equals("2"));   // 거짓

        System.out.println("********문자********");
        // char a1 = "a"; 오류남
        char a1 = 'a';
        char a2 = 97;
        char a3 = '\u0061';
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("********문자열********");
        // 리터럴 표기방식
        String s1 = "Happy Java";
        String s2 = "a";
        String s3 ="123";

        String st1 = new String("Happy Java");
        String st2 = new String("a");
        String st3 = new String("123");
        // int, long, double, float, boolean, char 자료형을 원시자료형(primitive)
        // String은 원시자료형은 아니지만 리터럴 표기 방식을 사용할수 있도록 특별대우받음.

        // 문자열 비교는 반드시 equals매서드를 사용해야함
        System.out.println(s1.equals(st1));
        System.out.println(s1.equals("Happy Java"));
        // 이유는
        System.out.println(s1 == st1);

        System.out.println(s1.indexOf(st2)); // 해당 문자열의 인덱스를 알려줌
        System.out.println(s1.contains("Java")); // 특정 문자열 포함여부
        System.out.println(s1.charAt(6)); // 해당 인덱스에 있는 문자열 출력
        System.out.println(s1.replaceAll("Java", "World"));
        System.out.println(s1.substring(6));
        System.out.println(s1.substring(0, 5));
        System.out.println(s1.toUpperCase());
        String s4 = "a:b:c:d";
//        String[] result = s4.split(":");

        System.out.println(String.format("I eat %d apples.", 3));
        System.out.println(String.format("I eat %s apples.", "five"));
//        System.out.println(String.format("I eat %d apples.", s2));
        System.out.println(String.format("I eat %s apples. %s", s2, s1));
        System.out.println(String.format("%10sjane.", "hi"));
        System.out.println(String.format("%-10sjane.", "hi"));
        System.out.println(String.format("%10.4f", 3.42134234));
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        sb.insert(0, "MinJun");
        sb.insert(6, " ");
        String result = sb.toString();
        System.out.println(result);
        System.out.println(sb.substring(0,6));
    }
}
/* 블록주석 : 블록단위(클래스, 메서드)등을 설명할때 주로 사용 */
// 라인주석
// 누구나 말만한 내용의 주석은 코드를 지저분하게 만들기 때문에 쓰지 않는게 좋다.