package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textpan, textaddar;
    JRadioButton r1, r2, e1, e2;
    String formno;
    JButton next;

    signup2(String formno) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String religion[] = {"HINDU", "MUSLIM", "CHRISTIAN", "Others.."};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(225, 208, 76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        String category[] = {"General", "SC", "ST", "OBC", "PWD", "Other.."};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(225, 208, 76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);

        String income[] = {"NULL", "<1,50,000", "<2,50,000", "<5,00,000", "UpTo 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(225, 208, 76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 270, 150, 30);
        add(l6);

        String educational[] = {"Non-Graduate", "Graduate", "PG", "UG", "Other.."};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(225, 208, 76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 340, 150, 30);
        add(l7);

        String occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other.."};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(225, 208, 76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 340, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("Pan Number :");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 390, 180, 30);
        add(l8);

        textpan = new JTextField();
        textpan.setFont(new Font("Raleway", Font.BOLD, 18));
        textpan.setBounds(350, 390, 320, 30);
        add(textpan);

        JLabel l9 = new JLabel("Aadhar Number :");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 440, 180, 30);
        add(l9);

        textaddar = new JTextField();
        textaddar.setFont(new Font("Raleway", Font.BOLD, 18));
        textaddar.setBounds(350, 440, 320, 30);
        add(textaddar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 490, 180, 30);
        add(l10);

        r1 = new JRadioButton("YES");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(251, 122, 122));
        r1.setBounds(350, 490, 100, 30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(251, 122, 122));
        r2.setBounds(460, 490, 100, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 540, 180, 30);
        add(l11);

        e1 = new JRadioButton("YES");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBackground(new Color(251, 122, 122));
        e1.setBounds(350, 540, 100, 30);
        add(e1);

        e2 = new JRadioButton("NO");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(new Color(251, 122, 122));
        e2.setBounds(460, 540, 100, 30);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

        JLabel label12 = new JLabel("FORM NO:");
        label12.setBounds(700, 10, 100, 30);
        label12.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label12);

        JLabel label13 = new JLabel(formno);
        label13.setBounds(760, 10, 60, 30);
        label13.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label13);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.CYAN);
        next.setBounds(570, 640, 100, 30);
        add(next);
        next.addActionListener(this);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(251, 122, 122));
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String pan = textpan.getText();
        String addhar = textaddar.getText();

        String scitizen = "";
        if (r1.isSelected()) {
            scitizen = "YES";
        } else if (r2.isSelected()) {
            scitizen = "NO";
        }

        String eAccount = "";
        if (e1.isSelected()) {
            eAccount = "YES";
        } else if (e2.isSelected()) {
            eAccount = "NO";
        }

        try {
            if (pan.equals("") || addhar.equals("")) {
                JOptionPane.showMessageDialog(null, "FILL ALL THE FIELDS");
            } else {
                Con c1 = new Con();
                String q = "insert into Signuptwo values('" + formno + "','" + rel + "','" + cate + "','" + inc + "','" + edu + "','" + occ + "','" + pan + "','" + addhar + "','" + scitizen + "','" + eAccount + "')";
                c1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup2("");
    }
}
