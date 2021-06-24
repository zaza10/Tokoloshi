import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Date;

import static java.lang.Thread.sleep;

public class Tokoloshi {
    public static void main(String args[]) throws AWTException, InterruptedException {
        Robot r = new Robot();
        while(true) {
            System.out.println("cheating"+new Date());
            r.keyPress(KeyEvent.VK_F12);
            r.keyRelease(KeyEvent.VK_F12);
            sleep(20000);
        }
    }
}
