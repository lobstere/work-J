package Me_Demo;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class atjm {
    public static void main(String[] args) throws AWTException{
        Random random = new Random();
        int n = random.nextInt(30000,60000);
        Robot robot = new Robot();
        int target = 1000*340;
        int i;
        boolean flag = false;
        for (i=0;i<target;i++){
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            robot.delay(2000);
        }
        if(i==target){
            flag=true;
        }
        while (true){ 
            if(flag){
                robot.keyPress(KeyEvent.VK_W);
                robot.delay(1000);
                robot.keyRelease(KeyEvent.VK_W);
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_S);
                robot.delay(1000);
                robot.keyRelease(KeyEvent.VK_S);
                robot.delay(1000);
                robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
                robot.delay(2000);
                robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
            }else{
                break;
            }
        }
    }
}
