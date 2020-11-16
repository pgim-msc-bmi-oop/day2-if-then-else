package ifthenelse;

import javax.swing.JOptionPane;

public class IfThenElse {

    public static void main(String[] args) {
        String strHt;
        String strWt;

        strHt = JOptionPane.showInputDialog(null, "Please enter height in meters");
        strWt = JOptionPane.showInputDialog(null, "Please enter weight in kilograms");

        double ht;
        double wt;
        double bmi;

        ht = Double.parseDouble(strHt);
        wt = Double.parseDouble(strWt);

        bmi = wt / (ht * ht);

        JOptionPane.showMessageDialog(null, "Your BMI is " + bmi + " kg/m2.");

        if (bmi < 23) {
            JOptionPane.showMessageDialog(null, "You are at low risk category.");
        } else {
            JOptionPane.showMessageDialog(null, "You are at high risk category.");
        }
    }

}
