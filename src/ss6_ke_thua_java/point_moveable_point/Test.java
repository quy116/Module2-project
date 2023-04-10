package ss6_ke_thua_java.point_moveable_point;

public class Test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1, 2, 3, 4);
        System.out.println(moveablePoint);
        moveablePoint.getSpeed();
        System.out.println(moveablePoint);
//        moveablePoint.move();
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint.toString());
    }
}
