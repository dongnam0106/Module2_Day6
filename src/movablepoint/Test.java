package movablepoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3f, 4f, 5f, 6f);
        System.out.println();
        System.out.println(movablePoint);
        movablePoint.move();
    }
}
