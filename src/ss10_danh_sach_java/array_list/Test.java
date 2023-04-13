package ss10_danh_sach_java.array_list;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        listInterger.add(5);
//        System.out.println(listInterger.getIndex(0));
//        System.out.println(listInterger.getIndex(2));
//        System.out.println(listInterger.getIndex(3));
//        System.out.println(listInterger.getIndex(4));
        listInterger.remove(3);
        System.out.println(listInterger.toString());
    }
}
