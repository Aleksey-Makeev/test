public class Tank {
    private int x, y;
    private int fuel;
    private int dir;
    private int n;

    static final String name = "Т-34";
    static int num;

    public Tank() {
       this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++num;
    }

    public void goForward(int i) {
        i = goFuel(i);
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;

    }

    public void printPosition() {
        System.out.println("The Tank " + name + "-" + n + " is at " + x +", " + y + " now.");
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    int goFuel(int a) {
        if (a < 0 && -a > -fuel)
        a = -fuel;
		else if (a > fuel)
            a = fuel;
        return a;
    }
}
