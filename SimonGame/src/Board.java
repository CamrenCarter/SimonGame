

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
public class Board extends JFrame {

    static ArrayList<Integer> Player = new ArrayList<Integer>();
    static ArrayList<Integer> Computer = new ArrayList<Integer>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simon");
        int CompPick;
        Random gen = new Random();

        frame.setSize(206, 232);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        final JButton BlueButton = new JButton();
        BlueButton.setBounds(0, 0, 100, 100);
        BlueButton.setBackground(Color.blue);

        JButton RedButton = new JButton();
        RedButton.setBounds(100, 0, 100, 100);
        RedButton.setBackground(Color.red);

        final JButton YellowButton = new JButton();
        YellowButton.setBounds(100, 100, 100, 100);
        YellowButton.setBackground(Color.yellow);

        final JButton GreenButton = new JButton();
        GreenButton.setBounds(0, 100, 100, 100);
        GreenButton.setBackground(Color.green);

        frame.add(BlueButton);
        frame.add(RedButton);
        frame.add(YellowButton);
        frame.add(GreenButton);
        frame.setVisible(true);

        BlueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Player.add(0);
                if (!Player.equals(Computer)) {
                    JOptionPane.showMessageDialog(null, "You Lose");
                }
            }
        });

        RedButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Player.add(1);
                if (!Player.equals(Computer)) {
                    JOptionPane.showMessageDialog(null, "You Lose");
                }
            }
        });

        YellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Player.add(2);
                if (!Player.equals(Computer)) {
                    JOptionPane.showMessageDialog(null, "You Lose");
                }
            }
        });
 
        GreenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Player.add(3);
                if (!Player.equals(Computer)) {
                    JOptionPane.showMessageDialog(null, "You Lose");
                }
            }
        });
 
        do {
            if (Player.equals(Computer)) {
                Player.clear();
            }

            CompPick = gen.nextInt(4);
            Computer.add(CompPick); 

            for (int i = 0; i < Computer.size(); i++) {
                if (Computer.get(i) == 0) {
                	BlueButton.doClick(1000);
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (Computer.get(i) == 1) {
                    RedButton.doClick(1000);
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else if (Computer.get(i) == 2) {

                    YellowButton.doClick(1000);

                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (Computer.get(i) == 3) {
                    GreenButton.doClick(1000);
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (!Computer.equals(Player)) {
                JOptionPane.showMessageDialog(null, "You Lose");
            }
        } while (Computer.equals(Player));
    }
}
