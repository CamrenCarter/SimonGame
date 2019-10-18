
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Sound {
	public static void main(String[] args) throws Exception {
	
		URL url = new URL("http://www.edu4java.com/sound/back.wav");
		AudioClip clip = Applet.newAudioClip(url);
		clip.loop();
		Thread.sleep(500);
		
		
		
	

}
}