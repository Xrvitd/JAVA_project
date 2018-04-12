package Search;


import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;


import javax.swing.*;
import javax.swing.event.*;

public class Gui extends Frame {
	public TextArea mass,ma;
	private Button start;
	public static void main(String[] args) {
		new Gui();
	}
	public Gui()
	{
		setBounds(60, 20, 1200, 800);
		start = new Button("Search!");
		ma = new TextArea(25,25);
		mass= new TextArea(25,25);
		Panel p = new Panel();
		p.add(ma);
		p.add(start);
		add(p,BorderLayout.NORTH);
    	//add(,BorderLayout.);
    	add(mass,BorderLayout.CENTER);
    	addWindowListener(new WindowAdapter() {
    		public void windowClosing(WindowEvent e) {
    			System.exit(0);
    		}
    	});
        setVisible(true);
		validate();
	}
}
