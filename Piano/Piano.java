
import javax.swing.JFrame;

public class Piano {
	static JFrame frame;

	public static void main(String [] args)
	{

		run();


	}

	public static void run(){
		frame=new JFrame("Piano");

		Work p = new Work();
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(p);
		frame.setLocation (500,50);
		frame.setSize(415,648);
		frame.setVisible(true);
		frame.setResizable(false);
		Music.p.loop();

	}
}
