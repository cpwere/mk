package com.project.triangle.component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JDialog;


public class UIViewComponent {
  JFrame jf;

  public UIViewComponent() {
    jf = new JFrame("Project test");
    jf.setVisible(true);
    jf.setBounds(100, 200, 550, 300);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JOptionPane.showMessageDialog(jf, "Hello there");
  }

  public UIViewComponent(boolean version) {

    JOptionPane optP = new JOptionPane();


    String specialChar = "%";

    int numberOfTimeX = 3;    // 4 times , index 0
    //int numberOfTimeY = 3;

    // iterate / loop
    // check counter to determine how many to print character
    // move to next line  --> \n
    //
  // X
    // 0  ... (0 <= 3) = true
    // 1  ... (1 <= 3) = true
    // 2  ... (2 <= 3) = true
    // 3  ... (3 <= 3) = true
    // 4  ... (4 <= 3) = false


    ///String display = "% \n% % \n% % %\n% % % %";

    String outputResultDisplay = "";

    for(int x = 0; x <= 3; x++) {     // row

      // print out special character
      for(int  y = 0; y <= x; y++ )   // determines how many times you print across / column
      {
        //System.out.print(specialChar + " ");
        outputResultDisplay = outputResultDisplay + specialChar + " ";
      }

      outputResultDisplay = outputResultDisplay + "\n";
      //System.out.println(); // \n   go to the next line

    }

    /**
     * conditional expression:  if else
     * iterate/repeat: while
     */

    int mark = 56;

    if (mark > 75) {
      System.out.println("Exceptional");
    } else if (mark < 35) {
      System.out.println("Bad");
    } else if (mark >= 40 && mark <= 74) {
      //System.out.println("Good");
    }


    optP.setMessage(outputResultDisplay);

    optP.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    optP.setSize(450, 400);

    //optP.setOptionType(JOptionPane.YES_NO_OPTION);

    JDialog dialog = optP.createDialog(null, "Width 100");
    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    dialog.setVisible(true);


    Object value = optP.getValue();

    System.out.println("To EXIT press >> CTRL + C ");

  }

}
