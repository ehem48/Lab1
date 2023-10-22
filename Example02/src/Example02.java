import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example02 extends JFrame {

    private JPanel JPanel;
    private JButton sumaButton;
    private JButton roznicaButton;
    private JButton iloczynButton;
    private JButton ilorazButton;
    private JButton wyjscieButton;
    private JTextField textField2;
    private JTextField textField1;
    private JLabel JLabelScore;
    double valueA, valueB, score;

    public static void main(String[] args) {
        Example02 swingApp = new Example02();
        swingApp.setVisible(true);
    }
    public  Example02() {
        super("Moje GUI");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 450, height = 250;
        this.setSize(width, height);
        //this.pack();

        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA=Double.parseDouble(textField1.getText());
                valueB=Double.parseDouble(textField2.getText());
                score=valueA+valueB;
                JLabelScore.setText("Suma "+ String.valueOf(valueA)+ "+ " +String.valueOf(valueB)+" ="+score);
            }
        });


        iloczynButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA=Double.parseDouble(textField1.getText());
                valueB=Double.parseDouble(textField2.getText());
                score=valueA*valueB;
                JLabelScore.setText("Iloczyn "+ String.valueOf(valueA)+ "* " +String.valueOf(valueB)+" ="+score);
            }
        });
        ilorazButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA=Double.parseDouble(textField1.getText());
                valueB=Double.parseDouble(textField2.getText());

                if (valueB==0) {

                    JOptionPane.showMessageDialog(null, JOptionPane.ERROR_MESSAGE);
                }
                else {
                    score = valueA / valueB;
                    JLabelScore.setText("Iloraz " + String.valueOf(valueA) + "/ " + String.valueOf(valueB) + " =" + score);
                }
            }
        });
        roznicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA=Double.parseDouble(textField1.getText());
                valueB=Double.parseDouble(textField2.getText());
                score=valueA-valueB;
                JLabelScore.setText("Roznica "+ String.valueOf(valueA)+ "- " +String.valueOf(valueB)+" ="+score);
            }
        });
    }
}
