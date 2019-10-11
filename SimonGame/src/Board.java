

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;



public class Board {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Simon");


			frame.setSize(206, 232);
        	frame.setLocationRelativeTo(null);
        	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	frame.setResizable(false);
        	frame.setLayout(null);
        
       

        	 final JButton BlueButton = new JButton();
             BlueButton.setBounds(0, 0, 100, 100);
             BlueButton.setBackground(Color.blue);
        
         
        
               final JButton RedButton = new JButton();
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


	}

}
