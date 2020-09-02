class Elevator {
    final String name = "N";
    final int cCap = 25;
    int level = 0;
    boolean isUp = true;
    int count = 0;

    Elevator() {
        isUp = false;
    }

    Elevator(int xLevel, boolean xIsUp, int currentCount) {
        level = xLevel;
        isUp = xIsUp;
        count = currentCount;
    }

}

public class Testing {
    public static void main(String[] args) {
        Elevator a = new Elevator();
        a.level = 2;
        System.out.println(a.count);
        Elevator b = new Elevator(6, true, 16);
        System.out.println(b.count);
    }
}