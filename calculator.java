
import java.awt.*;
import java.awt.event.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gihanpunarji
 */
class close extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class cal implements ActionListener {

    String fv, sv, op;
    Double fdv, sdv, total;

    Frame f;
    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    Button addBtn, subBtn, multBtn, divBtn, percentageBtn, prdBtn, clearBtn, backBtn, resultBtn, squrBtn;
    Font font1 = new Font("Moonspace", Font.BOLD, 30);
    Font font2 = new Font("Cuorier New", Font.BOLD, 28);

    cal() {
        Frame f1 = new Frame();
        f1.setVisible(true);
        f1.setBackground(Color.gray);
        f1.addWindowListener(new close());
        f1.setBounds(500, 500, 425, 604);
        f1.setTitle("Calculator");

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");

        addBtn = new Button("+");
        subBtn = new Button("-");
        multBtn = new Button("*");
        divBtn = new Button("/");
        percentageBtn = new Button("%");
        prdBtn = new Button(".");
        clearBtn = new Button("CE");
        backBtn = new Button("X");
        squrBtn = new Button("SQRT");
        resultBtn = new Button("=");

        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        b0.setFont(font1);

        addBtn.setFont(font2);
        subBtn.setFont(font2);
        multBtn.setFont(font2);
        divBtn.setFont(font2);
        percentageBtn.setFont(font2);
        prdBtn.setFont(font2);
        clearBtn.setFont(font2);
        backBtn.setFont(font2);
        resultBtn.setFont(font2);

        clearBtn.setForeground(Color.decode("#EF843C"));
        addBtn.setForeground(Color.decode("#EF843C"));
        subBtn.setForeground(Color.decode("#EF843C"));
        divBtn.setForeground(Color.decode("#EF843C"));
        multBtn.setForeground(Color.decode("#EF843C"));
        percentageBtn.setForeground(Color.decode("#EF843C"));
//        resultBtn.setSize(10, 30);
        squrBtn.setForeground(Color.decode("#EF843C"));
        backBtn.setForeground(Color.decode("#EF843C"));
        prdBtn.setForeground(Color.decode("#EF843C"));
        resultBtn.setForeground(Color.decode("#EF843C"));

        tf = new TextField(25);

        Font font = new Font("Cuorier New", Font.BOLD, 24);
        tf.setFont(font);
        tf.setEditable(false);

        tf.setBackground(Color.white);
        tf.setForeground(Color.black);

        MenuBar menuBar = new MenuBar();
        MenuItem mi1 = new MenuItem("Standard");
        MenuItem mi2 = new MenuItem("Sciencetific");
        MenuItem mi3 = new MenuItem("Copy");
        MenuItem mi4 = new MenuItem("Paste");
        MenuItem mi5 = new MenuItem("Help");
        MenuItem mi6 = new MenuItem("About");

        Menu m1 = new Menu("View");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("Help");

        m1.add(mi1);
        m1.add(mi2);

        m2.add(mi3);
        m2.add(mi4);

        m3.add(mi5);
        m3.add(mi6);

        menuBar.add(m1);
        menuBar.add(m2);
        menuBar.add(m3);

        f1.setMenuBar(menuBar);

        Panel p1 = new Panel();
        Panel p2 = new Panel();

        p1.add(tf);

        GridLayout gl = new GridLayout(6, 4, 3, 3);

        p2.setLayout(gl);
        p2.setBackground(Color.WHITE);

        p2.add(clearBtn);
        p2.add(divBtn);
        p2.add(multBtn);
        p2.add(backBtn);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(subBtn);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(addBtn);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(squrBtn);
        p2.add(prdBtn);
        p2.add(b0);
        p2.add(percentageBtn);
        p2.add(resultBtn);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        multBtn.addActionListener(this);
        divBtn.addActionListener(this);
        percentageBtn.addActionListener(this);
        prdBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        backBtn.addActionListener(this);
        resultBtn.addActionListener(this);
        squrBtn.addActionListener(this);

        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object o = e.getSource();

        if (o.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());
        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());
        } else if (o.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());
        } else if (o.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());
        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b0)) {
            tf.setText(tf.getText() + b0.getLabel());
        } else if (o.equals(addBtn)) {
            fv = tf.getText();
            tf.setText("");
            op = "add";
        } else if (o.equals(subBtn)) {
            fv = tf.getText();
            tf.setText("");
            op = "sub";
        } else if (o.equals(multBtn)) {
            fv = tf.getText();
            tf.setText("");
            op = "mult";
        } else if (o.equals(divBtn)) {
            fv = tf.getText();
            tf.setText("");
            op = "div";
        } else if (o.equals(percentageBtn)) {
            fv = tf.getText();
            tf.setText("");
            op = "mod";
        } else if (o.equals(squrBtn)) {
            fv = tf.getText();
            tf.setText("");
            op = "squr";
            
            if ("squr".equals(op)) {
                fdv = Double.parseDouble(fv);
                total = Math.sqrt(fdv);

                tf.setText(String.valueOf(total));
            }

        } else if (o.equals(resultBtn)) {
            sv = tf.getText();
            if ("add".equals(op)) {
                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);

                total = fdv + sdv;

                tf.setText(String.valueOf(total));
            }
            if ("sub".equals(op)) {
                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);

                total = fdv - sdv;

                tf.setText(String.valueOf(total));
            }
            if ("mult".equals(op)) {
                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);

                total = fdv * sdv;

                tf.setText(String.valueOf(total));
            }
            if ("div".equals(op)) {
                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);

                total = fdv / sdv;

                tf.setText(String.valueOf(total));
            }
            if ("mod".equals(op)) {
                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);

                total = (fdv / 100) * sdv;

                tf.setText(String.valueOf(total));
            }
            if ("mod".equals(op)) {
                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);

                total = (fdv / 100) * sdv;

                tf.setText(String.valueOf(total));
            }

        } else if (o.equals(clearBtn)) {
            tf.setText("");

        } else if (o.equals(backBtn)) {
            tf.setText(tf.getText().substring(0, tf.getText().length() - 1));
        }

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

public class Calculator {

    public static void main(String[] args) {

        new cal();

    }

}
