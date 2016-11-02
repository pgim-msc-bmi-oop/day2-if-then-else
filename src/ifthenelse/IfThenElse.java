package ifthenelse;

import javax.swing.JOptionPane;

public class IfThenElse {

    public static void main(String[] args) {
        String strHt;
        String strWt;

        strHt = JOptionPane.showInputDialog(null, "Please enter height");
        strWt = JOptionPane.showInputDialog(null, "Please enter weight");

        double ht;
        double wt;
        double bmi;

        ht = Double.parseDouble(strHt);
        wt = Double.parseDouble(strWt);

        bmi = wt / (ht * ht);

        System.out.println("Your BMI is " + bmi + "kg/m2");

        if (bmi < 23) {
            System.out.println("Low Risk");
        }else{
            System.out.println("At Risk");
        }
    }

}
