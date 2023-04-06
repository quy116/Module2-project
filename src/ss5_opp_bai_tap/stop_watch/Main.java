package ss5_opp_bai_tap.stop_watch;

public class Main {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
//        1680764171023
//        1680764231364
        Watch watch = new Watch();
        System.out.println();
        watch.start();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                for (int k = 0; k < 100; k++) {
                }
            }
        }
        watch.end();
//        watch.end();
        System.out.println(watch.getElapsedTime());
//        1680764995546
    }
}
