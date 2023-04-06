package ss5_opp_bai_tap.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan(2,false,5,"blue");
        fan1.toString();
        fan2.toString();
        System.out.println( fan1.toString());
        System.out.println( fan2.toString());
    }
}
