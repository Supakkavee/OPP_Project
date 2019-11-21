/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.awt.Font;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author LAB205_30
 */
public class MyClock extends JLabel implements Runnable{

    @Override
    public void run() {
        boolean count = true;
        int sec = 0;
        int min = 0;
        int hour = 0;
        while(true){
            String ss = "";
            String mm = "";
            String hh = "";
            if (sec % 60 == 0 && sec != 0){
                min++;
                sec = 0;
            }

            if (min % 60 == 0 && min != 0 && sec != 0){
                hour++;
                min = 0;
            }
            if(hour < 10)
                hh = "0";
            if(min < 10)
                mm = "0";
            if(sec < 10)
                ss = "0";
            // System.out.println(hour+":"+m+":"+ss+s);
            // setFont(new Font("Courier", Font.BOLD,100));
            setText(hh+hour+":"+mm+min+":"+ss+sec);
            sec++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
            count = false;
        }
    }



   // @Override
   // public void run() {
   //     while(true) {
   //         Calendar d = Calendar.getInstance();
   //         int sec = d.get(Calendar.SECOND);
   //         int min = d.get(Calendar.MINUTE);
   //         int hour = d.get(Calendar.HOUR_OF_DAY);
   //         //System.out.println(hour+":"+min+":"+sec);
   //         if(sec < 10){
   //             sec = '0'+sec;
   //         }
   //         if(min < 10){
   //             min = '0' + min;
   //         }
   //         if(hour < 10){
   //             hour = '0' + hour;
   //         }
   //         // setFont(new Font("Courier", Font.BOLD,400));
   //         setText(hour + ":" + min + ":" + sec);
   //         try {
   //             Thread.sleep(1);
   //         } catch (InterruptedException ex) {
   //             Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
   //         }
   //     }
   // }
}




