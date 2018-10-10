package testGUI;

import java.awt.*;
class TestFrame
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("MyFrame");
		f.setLocation(300,300);
		f.setSize(500,300);
		f.setBackground(Color.green);
		f.setResizable(true);
		f.setVisible(true);
	}
}
