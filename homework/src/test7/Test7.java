package test7;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class Test7 {
	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("G.txt");
		StringBuffer buffer = new StringBuffer();
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
    	String line = reader.readLine();
		while (line != null) {
		buffer.append(line+"\n");
		line = reader.readLine();
		}
		input.close();
		String ss = buffer.toString();
		JFrame frame = new JFrame ("Test7");
	      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	      JPanel panel = new JPanel();
	      panel.setBackground (Color.BLUE);
	      //Graphics page = null;
	      //page.drawLine(10,10,20,20);
	      panel.setPreferredSize (new Dimension(1024, 768));
	      //panel.drawLine(10,10,20,20);
	      //panel.setFont (new Font("Arial", Font.BOLD, 16));
	      //l.paintComponent(panel);
	      frame.getContentPane().add (panel);
	      frame.pack();
	      frame.setVisible(true);
	}	
}