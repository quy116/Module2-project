package ss5_opp_bai_tap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getRadius();
//        circle.radius;
        circle.getArea();
        int newData = (int) circle.getRadius();
        int newData2 = (int) circle.getArea();
        System.out.println(newData);
        System.out.println(newData2);
    }
}
