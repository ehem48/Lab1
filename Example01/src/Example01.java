import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example01 extends JFrame {
    private javax.swing.JPanel JPanel;
    private JButton closeButton;
    private JButton witajButton;
    private JButton klikButton;
    private JPanel Data;

    public static void main(String[] args) {
        Example01 swingApp = new Example01();
        swingApp.setVisible(true);
    }

    public  Example01(){
        super("Moje GUI");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width=400, height=300;
        this.setSize(width,height);


        witajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = JOptionPane.showInputDialog("Podaj imie: ");
                //JOptionPane.showMessageDialog(null, "Witaj: "+ text);
                //JOptionPane.showMessageDialog(null, "Witaj: "+ text, "Uwaga", JOptionPane.WARNING_MESSAGE);
                int a =JOptionPane.showConfirmDialog(null, "Wpisano dane: " + text, " Moje okno 1 ", JOptionPane.YES_NO_OPTION);
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        klikButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
