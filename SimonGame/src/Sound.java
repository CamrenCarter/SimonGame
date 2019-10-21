
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;

public class Sound {
	public static void main(String[] args) throws Exception {
		URL url2 = new URL("http://www.edu4java.com/sound/ball.wav");
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
	
		URL url = new URL("http://www.edu4java.com/sound/back.wav");
		AudioClip clip = Applet.newAudioClip(url);
		clip.loop();
		Thread.sleep(500);
		
		BlueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AudioClip clip = Applet.newAudioClip(url2);
				clip.play();
				
			}
		});
		YellowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AudioClip clip = Applet.newAudioClip(url2);
				clip.play();
				
			}
		});
		RedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AudioClip clip = Applet.newAudioClip(url2);
				clip.play();
				
			}
		});
		GreenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AudioClip clip = Applet.newAudioClip(url2);
				clip.play();
				
			}
		});

}
}