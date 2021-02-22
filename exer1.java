import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exer1 extends JFrame implements ActionListener {
    JPanel row1 = new JPanel();
    JLabel first = new JLabel("Select the first number:", JLabel.RIGHT);
    JComboBox fNum = new JComboBox();
    JPanel row2 = new JPanel();
    JLabel second = new JLabel("Select the second number:", JLabel.RIGHT);
    JComboBox sNum = new JComboBox();
    JPanel row3 = new JPanel();
    JButton comp = new JButton("Compute");
    JTextField total = new JTextField(5);

    public exer1() {
        super("Calculator");
        row1.add(first);
        fNum.addItem("1");
        fNum.addItem("2");
        fNum.addItem("3");
        fNum.addItem("4");
        fNum.addItem("5");
        fNum.addItem("6");
        row1.add(fNum);
        add(row1);
        row2.add(second);
        sNum.addItem("1");
        sNum.addItem("2");
        sNum.addItem("3");
        sNum.addItem("4");
        sNum.addItem("5");
        sNum.addItem("6");
        row2.add(sNum);
        add(row2);
        comp.addActionListener(this);
        row3.add(comp);
        total.setEditable(false);
        row3.add(total);
        add(row3);
        setLayout(new FlowLayout());
        setSize(500, 550);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        int num1 = Integer.parseInt(fNum.getSelectedItem().toString());
        int num2 = Integer.parseInt(sNum.getSelectedItem().toString());
        total.setText("" + (num1 + num2));
    }

    public static void main(String[] args) {
        exer1 xx = new exer1();
    }
}