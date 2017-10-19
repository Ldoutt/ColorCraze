/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorcraze;

/**
 *
 * @author mlh5614
 */

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Tymer {
    



  Toolkit toolkit;

  Timer timer;

  public Tymer(int seconds) {
    toolkit = Toolkit.getDefaultToolkit();
    timer = new Timer();
    timer.schedule(new timeIsUp(), seconds * 1000);
  }

   // private Tymer() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

  class timeIsUp extends TimerTask {
    public void run() {
      System.out.println("Time's up!");
      toolkit.beep();
      //System.exit(0); 
    }
  }

}  