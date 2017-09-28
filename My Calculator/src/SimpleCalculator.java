import javax.swing.*;
import java.awt.*;

/**
 * Created by Splayd on 07.02.2017.
 * Simple Calculator
 */

public class SimpleCalculator {
    JPanel windowContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JPanel panel1;

    SimpleCalculator() {
        // Panel creating;
        windowContent = new JPanel();
        //Manager for visual display JPanel;
        BorderLayout borderLayout = new BorderLayout();
        windowContent.setLayout(borderLayout);
        //Panel display;
        displayField = new JTextField(30);
        windowContent.add("North", displayField);
        //Create button;
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        //Create Panel;
        panel1 = new JPanel();
        GridLayout gridLayout = new GridLayout(4,3);
        panel1.setLayout(gridLayout);
        //Put button on panel;
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(button0);
        panel1.add(buttonPoint);
        panel1.add(buttonEqual);
        //Put panel on screen center;
        windowContent.add("Center", panel1);
        //Create frame;
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        //Set size of the window for all components;
        frame.pack();
        //Window display;
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
    }
}
