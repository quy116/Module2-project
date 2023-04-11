package ss6_ke_thua_java.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3,"red",5);
        cylinder.getarea();
        cylinder.getRadius();
        System.out.println(cylinder.getarea());
        System.out.println(cylinder.theTich());
        System.out.println(cylinder.getColor());
        System.out.println(cylinder.getRadius());
    }
}
