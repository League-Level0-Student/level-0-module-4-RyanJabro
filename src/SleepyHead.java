//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday = false, isVacation = false;
   int wd = 0;
   int v = 0;
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
wd = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",
    		JOptionPane.YES_NO_OPTION);
if(wd == 1) {
	isWeekday = false;
}
else {
	isWeekday = true;
}
if(isWeekday == true) {
v = JOptionPane.showConfirmDialog(null, "Is it vacation?", "",
    	    JOptionPane.YES_NO_OPTION);
if(v == 0) {
	isVacation = true;
}
else {
	isVacation = false;
}
	if(isVacation == false) {
	   JOptionPane.showMessageDialog(null, "Get up lazy bones!");
   }
	else if(isVacation == true) {
	   JOptionPane.showMessageDialog(null, "Sleep in...");
   }
   }
   else {
	   JOptionPane.showMessageDialog(null, "Sleep in...");
   }
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
