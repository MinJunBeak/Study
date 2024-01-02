class Updater{
    void update(Counter counter){
        counter.count++;
    }
}

class Counter{
    int count = 0;
}

public class JTJ_05_01 {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter); // Counter클래스의 count객체변수 전달
        System.out.println("after update:"+myCounter.count);
    }
}