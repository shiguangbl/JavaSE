package testGUI;

import java.awt.*;
import java.awt.event.*;
class WindowClosing
{
	public static void main(String[] args) 
	{
		new ClosingFrame("WindowClosing");
	}
}
class ClosingFrame extends Frame
{
	ClosingFrame(String s)
	{
		super(s);
		setBounds(200,300,400,500);
		setLayout(null);
		setBackground(new Color(200,100,150));
		setVisible(true);
		addWindowListener(new WindowMonitor());
	}
	class WindowMonitor extends WindowAdapter//WindowListener是一个抽象类 如果继承它的话必须重写其所有方法 所以采用一个已经实现方法的WindowAdapter类
	{
		public void windowClosing(WindowEvent e)
		{
			setVisible(false);//将显示的窗口退出显示
			System.exit(0);//除了0以外返回给系统的都为非正常退出 不过对用户来讲无其他影响
		}                
	}
}