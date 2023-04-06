package ss5_opp_bai_tap.stop_watch;

import java.time.LocalDate;
import java.time.LocalTime;

public class Watch {
    long startTime;
    long endTime;

    public Watch() {

    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void end() {
         this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime-this.startTime;
    }


}
