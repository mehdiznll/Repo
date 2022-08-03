import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JButton button1;
    private JTextField txtDisplay;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;

    double a, b, result;
    String op;

    public Calculator() {
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button2.getText());
            }
        });

        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button13.getText());
            }
        });

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button12.getText());
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button3.getText());
            }
        });

        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button14.getText());
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button8.getText());
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button1.getText());
            }
        });

        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button17.getText());
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button9.getText());
            }
        });

        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button15.getText());
            }
        });

        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + button18.getText());
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplay.getText().contains(".")){

                    double pm = Double.parseDouble(txtDisplay.getText());
                    pm = pm*-1;
                    txtDisplay.setText(String.valueOf(pm));

                } else{

                    long PM = Long.parseLong(txtDisplay.getText());
                    PM = PM*-1;
                    txtDisplay.setText(String.valueOf(PM));

                }
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().contains(".")){
                    txtDisplay.setText(txtDisplay.getText() + button19.getText());

                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Double.parseDouble(txtDisplay.getText());
                op = "+";
                txtDisplay.setText("");

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Double.parseDouble(txtDisplay.getText());
                op = "-";
                txtDisplay.setText("");

            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Double.parseDouble(txtDisplay.getText());
                op = "*";
                txtDisplay.setText("");

            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Double.parseDouble(txtDisplay.getText());
                op = "/";
                txtDisplay.setText("");

            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String backspace = null;

                if (txtDisplay.getText().length() > 0){
                    StringBuilder stringBuilder = new StringBuilder(txtDisplay.getText());
                    stringBuilder.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = String.valueOf(stringBuilder);
                    txtDisplay.setText(backspace);
                }

            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                b = Double.parseDouble(txtDisplay.getText());
                if (op == "+"){
                    result = a+b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op == "-"){
                    result = a-b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op == "*"){
                    result = a*b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op == "/"){
                    if (b != 0){
                    result = a/b;
                    txtDisplay.setText(String.valueOf(result));
                 } else {
                        txtDisplay.setText("=" + " " + "Can't divide by zero");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
