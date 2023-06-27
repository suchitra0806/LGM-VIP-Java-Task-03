import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Runnable;

public class scientificcalc {
    private JFrame frame;
    private JTextField textfield;
    double first;
    double second;
    double result;
    String operation;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    scientificcalc window = new scientificcalc();
                    window.frame.setVisible(true);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public scientificcalc() {
        initilialize();
    }

    private void initilialize() {
        frame = new JFrame();
        frame.setForeground(Color.WHITE);
        frame.getContentPane().setForeground(Color.BLACK);
        frame.setBounds(100, 100, 360, 540);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        textfield = new JTextField();
        textfield.setFont(new Font("Georgia", Font.BOLD, 15));
        textfield.setBounds(10, 39, 320, 63);
        frame.getContentPane().add(textfield);
        textfield.setColumns(10);
        JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
        lblNewLabel.setBounds(10, 11, 320, 27);
        lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 25));
        frame.getContentPane().add(lblNewLabel);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0)  {
                String number = textfield.getText() + btn2.getText();
                textfield.setText(number);
            }
        }); 
        btn2.setFont(new Font("Georgia", Font.BOLD, 23));
        btn2.setBounds(139, 398, 64, 50);
        frame.getContentPane().add(btn2);
        
        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textfield.getText() + btn5.getText();
                textfield.setText(number);
            }
        });
        btn5.setFont(new Font("Georgia", Font.BOLD, 23));
        btn5.setBounds(139, 347, 64, 50);
        frame.getContentPane().add(btn5);
        
        JButton btn8 = new JButton("8");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textfield.getText() + btn8.getText();
                textfield.setText(number);
            }
        });
        btn8.setFont(new Font("Georgia", Font.BOLD, 23));
        btn8.setBounds(139, 295, 64, 50);
        frame.getContentPane().add(btn8);
        
        JButton btnC = new JButton("C");
        btnC.setFont(new Font("Georgia", Font.PLAIN, 19));
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textfield.getText() + btnC.getText();
                textfield.setText(number);
            }
        });
        btnC.setBounds(139, 243, 64, 50);
        frame.getContentPane().add(btnC);
        
        JButton btnLn = new JButton("sinh");
        btnLn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.sinh(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnLn.setFont(new Font("Georgia", Font.PLAIN, 13));
        btnLn.setBounds(139, 191, 64, 50);
        frame.getContentPane().add(btnLn);
        
        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textfield.getText() + btn0.getText();
                textfield.setText(number);
            }
        });
        btn0.setFont(new Font("Georgia", Font.BOLD, 21));
        btn0.setBounds(74, 449, 129, 50);
        frame.getContentPane().add(btn0);
        
        JButton btnSin = new JButton("sin");
        btnSin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.sin(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnSin.setFont(new Font("Georgia", Font.BOLD, 12));
        btnSin.setBounds(139, 139, 64, 50);
        frame.getContentPane().add(btnSin);

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textfield.getText() + btnDot.getText();
                textfield.setText(number);
            }
        });
        btnDot.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnDot.setBounds(202, 449, 64, 50);
        frame.getContentPane().add(btnDot);

        JButton btnEq = new JButton("=");
        btnEq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String answer;
                second = Double.parseDouble(textfield.getText());
                if (operation == "+") {
                    result = first + second;
                    answer = String.format("%.2f", result);
                    textfield.setText(answer);
                } else if (operation == "-") {
                    result = first - second;
                    answer = String.format("%.2f", result);
                    textfield.setText(answer);
                } else if (operation == "*") {
                    result = first * second;
                    answer = String.format("%.2f", result);
                    textfield.setText(answer);
                } else if (operation == "/") {
                    result = first / second;
                    answer = String.format("%.2f", result);
                    textfield.setText(answer);
                } else if (operation == "%") {
                    result = first % second;
                    answer = String.format("%.2f", result);
                    textfield.setText(answer);
                } else if (operation == "X^Y") {
                    double result1=1;
                    for (int i=0; i<second; i++) {
                        result1 = first * result1;
                        answer = String.format("%.2f", result);
                        textfield.setText(answer);
                    }
                }
            }
        });
        btnEq.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnEq.setBounds(266, 449, 64, 50);
        frame.getContentPane().add(btnEq);

        JButton btnOr = new JButton("X^Y");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first = Double.parseDouble(textfield.getText());
                textfield.setText("");
                operation="xrx";
            }
        });
        btnOr.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnOr.setBounds(10, 243, 64, 50);
        frame.getContentPane().add(btnOr);

        JButton btnLog = new JButton("log");
        btnLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.log(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnLog.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnLog.setBounds(74, 192, 64, 50);
        frame.getContentPane().add(btnLog);

        JButton btnCE = new JButton("CE");
        btnCE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textfield.setText(null);
            }
        });
        btnCE.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnCE.setBounds(74, 243, 64, 50);
        frame.getContentPane().add(btnCE);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textfield.getText() + btn7.getText();
                textfield.setText(number);
            }
        });
        btn7.setFont(new Font("Georgia", Font.PLAIN, 21));
        btn7.setBounds(74, 295, 64, 50);
        frame.getContentPane().add(btn7);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textfield.getText() + btn4.getText();
                textfield.setText(number);
            }
        });
        btn4.setFont(new Font("Georgia", Font.PLAIN, 21));
        btn4.setBounds(74, 347, 64, 50);
        frame.getContentPane().add(btn4);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textfield.getText() + btn1.getText();
                textfield.setText(number);
            }
        });
        btn1.setFont(new Font("Georgia", Font.PLAIN, 21));
        btn1.setBounds(74, 398, 64, 50);
        frame.getContentPane().add(btn1);

        JButton btnX = new JButton("x3");
        btnX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = (Double.parseDouble(textfield.getText()));
                a = a * a * a;
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnX.setFont(new Font("Georgia", Font.PLAIN, 12));
        btnX.setBounds(10, 295, 64, 50);
        frame.getContentPane().add(btnX);

        JButton btnEx = new JButton("ex");
        btnEx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.exp(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnEx.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnEx.setBounds(74, 139, 64, 50);
        frame.getContentPane().add(btnEx);

        JButton btnx = new JButton("1/x");
        btnx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = 1/Math.sqrt(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnx.setFont(new Font("Georgia", Font.PLAIN, 12));
        btnx.setBounds(9, 191, 64, 50);
        frame.getContentPane().add(btnx);

        JButton btnS = new JButton("\u221A");
        btnS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.sqrt(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnS.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnS.setBounds(10, 139, 64, 50);
        frame.getContentPane().add(btnS);

        JButton btnCos = new JButton("cos");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.cos(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnCos.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnCos.setBounds(202, 139, 64, 50);
        frame.getContentPane().add(btnCos);

        JButton btnCosh = new JButton("cosh");
        btnCosh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.cosh(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnCosh.setFont(new Font("Georgia", Font.PLAIN, 13));
        btnCosh.setBounds(202, 191, 64, 50);
        frame.getContentPane().add(btnCosh);

        JButton btnSpace = new JButton("BS");
        btnSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String backspace = null;
                if (textfield.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(textfield.getText());
                    str.deleteCharAt(textfield.getText().length() - 1);
                    backspace = str.toString();
                    textfield.setText(backspace);
                }
            }
        });
        btnSpace.setFont(new Font("Georgia", Font.PLAIN, 19));
        btnSpace.setBounds(202, 243, 64, 50);
        frame.getContentPane().add(btnSpace);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textfield.getText() + btn9.getText();
                textfield.setText(number);
            }
        });
        btn9.setFont(new Font("Georgia", Font.PLAIN, 21));
        btn9.setBounds(202, 295, 64, 50);
        frame.getContentPane().add(btn9);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textfield.getText() + btn6.getText();
                textfield.setText(number);
            }
        });
        btn6.setFont(new Font("Georgia", Font.PLAIN, 21));
        btn6.setBounds(202, 347, 64, 50);
        frame.getContentPane().add(btn6);
        
        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = textfield.getText() + btn3.getText();
                textfield.setText(number);
            }
        });
        btn3.setFont(new Font("Georgia", Font.PLAIN, 21));
        btn3.setBounds(202, 398, 64, 50);
        frame.getContentPane().add(btn3);

        JButton btnTan = new JButton("tan");
        btnTan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.tan(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnTan.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnTan.setBounds(266, 139, 64, 50);
        frame.getContentPane().add(btnTan);

        JButton btnTanh = new JButton("tanh");
        btnTanh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.tanh(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnTanh.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnTanh.setBounds(266, 191, 64, 50);
        frame.getContentPane().add(btnTanh);

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first = Double.parseDouble(textfield.getText());
                textfield.setText("");
                operation="+";
            }
        });
        btnPlus.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnPlus.setBounds(266, 243, 64, 50);
        frame.getContentPane().add(btnPlus);

        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first = Double.parseDouble(textfield.getText());
                textfield.setText("");
                operation="-";
            }
        });
        btnMinus.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnMinus.setBounds(266, 295, 64, 50);
        frame.getContentPane().add(btnMinus);

        JButton btnMul = new JButton("*");
        btnMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first = Double.parseDouble(textfield.getText());
                textfield.setText("");
                operation="*";
            }
        });
        btnMul.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnMul.setBounds(266, 347, 64, 50);
        frame.getContentPane().add(btnMul);

        JButton btnDiv = new JButton("/");
        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first = Double.parseDouble(textfield.getText());
                textfield.setText("");
                operation="/";
            }
        });
        btnDiv.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnDiv.setBounds(266, 398, 64, 50);
        frame.getContentPane().add(btnDiv);

        JButton btnX1 = new JButton("x2");
        btnX1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = (Double.parseDouble(textfield.getText()));
                a = a * a;
                textfield.setText("");
                textfield.setText(textfield.getText() + a);
            }
        });
        btnX1.setFont(new Font("Georgia", Font.PLAIN, 12));
        btnX1.setBounds(10, 347, 64, 50);
        frame.getContentPane().add(btnX1);

        JButton btnN = new JButton("3");
        btnN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = (Double.parseDouble(textfield.getText()));
                double fact=1;
                while (a != 0) {
                    fact = fact * a;
                    a--;
                }
                textfield.setText("");
                textfield.setText(textfield.getText() + fact);
            }
        });
        btnN.setFont(new Font("Georgia", Font.PLAIN, 21));
        btnN.setBounds(10, 398, 64, 50);
        frame.getContentPane().add(btnN);

        JSeparator separator = new JSeparator();
        separator.setBounds(72, 291, 1, 2);
        frame.getContentPane().add(separator);
        JSeparator separator1 = new JSeparator();
        separator1.setBounds(19, 191, 1, 2);
        frame.getContentPane().add(separator1);
        JSeparator separator2 = new JSeparator();
        separator2.setBounds(72, 291, 320, 2);
        frame.getContentPane().add(separator2);

        JRadioButton rdbtn = new JRadioButton("ON");
        rdbtn.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
           } 
        });
        buttonGroup.add(rdbtn);
        rdbtn.setBounds(10, 109, 63, 23);
        frame.getContentPane().add(rdbtn);

        JRadioButton rdbtn1 = new JRadioButton("OFF");
        rdbtn1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
           } 
        });
        buttonGroup.add(rdbtn1);
        rdbtn1.setBounds(74, 109, 63, 23);
        frame.getContentPane().add(rdbtn1);

        JButton button = new JButton("+/-");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Double.parseDouble(String.valueOf(textfield.getText()));
                a = a * (-1);
                textfield.setText(String.valueOf(a));
            }
        });
        button.setFont(new Font("Georgia", Font.PLAIN, 18));
        button.setBounds(10, 449, 64, 50);
        frame.getContentPane().add(button);
    }
}
