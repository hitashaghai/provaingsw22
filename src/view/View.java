package view;

import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame {
    private JTextField x1 = new JTextField(10);
    private JTextField y1 = new JTextField(10);
    private JTextField x2 = new JTextField(10);
    private JTextField y2 = new JTextField(10);
    private JLabel x = new JLabel("x= ");
    private JLabel y = new JLabel("y= ");
    private JLabel p1 = new JLabel("Coordinate Punto 1");
    private JLabel p2 = new JLabel("Coordinate Punto 2");
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);


    public View() {
        // Sets up the view and adds the components
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        calcPanel.add(p1);
        calcPanel.add(x);
        calcPanel.add(x1);
        calcPanel.add(y);
        calcPanel.add(y1);
        calcPanel.add(p2);
        calcPanel.add(x);

        calcPanel.add(x2);
        calcPanel.add(y);
        calcPanel.add(y2);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        this.add(calcPanel);

    }

    void addCalculateListener(ActionListener listener){
        calculateButton.addActionListener(listener);
    }
}
