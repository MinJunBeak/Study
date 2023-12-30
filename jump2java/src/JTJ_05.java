class Animal{
    // 클래스에 선언된 변수를 객체변수, 인스턴스 변수, 멤버 변수, 속성이라고도 한다.
    String name;

    // 메서드 만들기 (클래스 안에 구현된 함수)
    public void setName(String name){
        // this는 클래스에 의해서 생성된 객체를 지칭(즉 cat.name = "boby")
        this.name = name;
    }

}

public class JTJ_05 {
    // 1. 입력값과 리턴값이 모두 있는 메서드
    // int는 리턴 자료형, sum은 메서드명(입력자료형1 매개변수 1, 입력자료형2 매개변수 2, ...)
    int sum(int a, int b) { // a, b는 매개변수
        return a + b; // 리턴값 단, 리턴 자료형이 void인 경우에는 return 문이 필요없다.
    }

    // 2. 입력값은 없고 출력값만 있는 메서드
    String say() {
        return "Hi";
    }

    // 3. 입력값은 있고 출력값은 없는 메서드
    void sum1(int a, int b) {
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
    }

    // 4. 입출력이 없는 메서드
    void say1() {
        System.out.println("Hi");
    }

    // 5. 특별한 경우 메서드를 빠져나가고 싶을때 return을 단독으로 씀.
    void sayNick(String nick){
    // 리턴 자료형이 void일때만 가능함.
        if ("바보".equals(nick)){
            return;
        }
        System.out.println("나의 별병은 " + nick + "입니다");
    }

    void varTest(int num){
        num++; // 메서드 안에서 사용한 매개변수는 메서드 안에서만 쓰인다.
    }

    int varTestInt(int num){
        num++;
        return num;
    }

    int number; // 객체변수 number
    void varTest1(JTJ_05 sample){ // JTJ_05클래스의 객체변수들을 받는다.
        sample.number++;
        // this.number++;
    }
    public static void main(String[] args) {
        // 객체 지향 프로그래밍
        System.out.println("********객체 지향 프로그래밍********");
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();
        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));
        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));

        // 클래스
        System.out.println("********클래스********");
        // 객체 만들기
        Animal cat = new Animal(); // 클래스로 만들어진 객체를 Animal의 인스턴스라고 한다.
        Animal dog = new Animal();
        // 객체 변수 접근하기 (cat.name)
        System.out.println(cat.name);
        System.out.println(dog.name);
        // 메서드를 이용한 객체변수 변경
        cat.setName("boby");
        dog.setName("happy");
        System.out.println(cat.name);
        System.out.println(dog.name);
        cat.name = "DiDi";
        System.out.println(cat.name);
        System.out.println(dog.name);

        // 메서드 더 살펴보기
        System.out.println("********메서드 더 살펴보기********");
        int a = 3;
        int b = 4;

        // 객체 생성
        JTJ_05 sample = new JTJ_05(); // 작성한 클래스를 단독으로 테스트함.

        // 1. 입출력이 있는 메서드의 사용
        int c = sample.sum(a, b); // a, b는 인수
        System.out.println(c);

        // 2. 입력만 없고 출력이 있는 메서드의 사용
        JTJ_05 sample1 = new JTJ_05();
        String say = sample1.say();
        System.out.println(say);

        // 3. 입력만 있고 출력이 없는 메서드의 사용
        JTJ_05 sample2 = new JTJ_05();
        sample2.sum1(3,4);

        // 4. 입출력이 없는 메서드의 사용
        sample.say1();

        // 5. 특별한 경우 메서드를 빠져나가고 싶을때 return을 단독으로 씀.
        sample.sayNick("야호");
        sample.sayNick("바보");

        // 메서드 내에서 선언된 변수의 효력 범위
        int num = 1;
        sample.varTest(num);
        System.out.println(num);
        num = sample.varTestInt(num);
        System.out.println(num);
        System.out.println(sample.number);
        sample.number = 2;
        System.out.println(sample.number);
        sample.varTest1(sample);
        System.out.println(sample.number);
        System.out.println("********값에 의한 호출과 객체에 의한 호출********");

    }
}
class Calculator{
    int result = 0;
    int add(int num) {
        result += num;
        return result;
    }

    int sub(int num) {
        result -= num;
        return result;
    }
}