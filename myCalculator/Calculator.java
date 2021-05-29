package myCalculator;

import javax.swing.JFrame;

public class Calculator {
    public static void main(String[] args) {
        Frame f = new Frame("myFrame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationByPlatform(true);
        f.setVisible(true);  
    }
}
