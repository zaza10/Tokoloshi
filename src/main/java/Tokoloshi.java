
import java.awt.*;
import java.util.Date;

import static java.lang.Thread.sleep;

public class Tokoloshi {

    public static void main(String args[]) throws AWTException, InterruptedException {
        Robot r = new Robot();
        while (true) {
            double xCoordinate = MouseInfo.getPointerInfo().getLocation().getX();
            double yCoordinate = MouseInfo.getPointerInfo().getLocation().getY();
            int newXCoordinate = (int) (xCoordinate + 1);

            r.mouseMove(newXCoordinate, (int) yCoordinate);
            System.out.println("Move X to " + newXCoordinate + ": " + new Date());
            sleep(20000);
        }
    }
}
