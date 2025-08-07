package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {

    JButton next;
    JRadioButton r1, r2, m1, m2;

    JTextField textName, textFName, textEmail, textADD, textCITY, textPIN, textSTATE;

    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs((first4));

    signup() {
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FROM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1 :: ");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details ");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 240, 200, 30);
        add(labelfName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300, 240, 400, 30);
        add(textFName);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 290, 200, 30);
        add(labelG);

        r1 = new JRadioButton("MALE");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 90, 30);
        add(r1);

        r2 = new JRadioButton("FEMALE");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(450, 290, 90, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelMS = new JLabel("Marital Status :");
        labelMS.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMS.setBounds(100, 440, 200, 30);
        add(labelMS);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        m1.setBackground(new Color(222, 255, 228));
        m1.setBounds(300, 440, 100, 30);
        add(m1);

        m2 = new JRadioButton("UnMarried");
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        m2.setBackground(new Color(222, 255, 228));
        m2.setBounds(450, 440, 100, 30);
        add(m2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);

        JLabel labelADD = new JLabel("Address :");
        labelADD.setFont(new Font("Raleway", Font.BOLD, 20));
        labelADD.setBounds(100, 490, 200, 30);
        add(labelADD);

        textADD = new JTextField();
        textADD.setFont(new Font("Raleway", Font.BOLD, 14));
        textADD.setBounds(300, 490, 400, 30);
        add(textADD);

        JLabel labelCITY = new JLabel("City :");
        labelCITY.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCITY.setBounds(100, 540, 200, 30);
        add(labelCITY);

        textCITY = new JTextField();
        textCITY.setFont(new Font("Raleway", Font.BOLD, 14));
        textCITY.setBounds(300, 540, 400, 30);
        add(textCITY);

        JLabel labelPIN = new JLabel("Pin Code :");
        labelPIN.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPIN.setBounds(100, 590, 200, 30);
        add(labelPIN);

        textPIN = new JTextField();
        textPIN.setFont(new Font("Raleway", Font.BOLD, 14));
        textPIN.setBounds(300, 590, 400, 30);
        add(textPIN);

        JLabel labelSTATE = new JLabel("State :");
        labelSTATE.setFont(new Font("Raleway", Font.BOLD, 20));
        labelSTATE.setBounds(100, 640, 200, 30);
        add(labelSTATE);

        textSTATE = new JTextField();
        textSTATE.setFont(new Font("Raleway", Font.BOLD, 14));
        textSTATE.setBounds(300, 640, 400, 30);
        add(textSTATE);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.cyan);
        next.setBounds(620, 710, 100, 40);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "MALE";
        } else if (r2.isSelected()) {
            gender = "FEMALE";
        }
        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "MARRIED";
        } else if (m2.isSelected()) {
            marital = "UNMARRIED";
        }
        String address = textADD.getText();
        String pin = textPIN.getText();
        String city = textCITY.getText();
        String state = textSTATE.getText();
        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "fill all the filds");
            } else {
                Con con1 = new Con();
                String q = "INSERT INTO signup (formno, name, fname, dob, gender, email, marital, address, city, pin, state) " + "VALUES ('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pin + "','" + state + "')";                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup();
    }
}
