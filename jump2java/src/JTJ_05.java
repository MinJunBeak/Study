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