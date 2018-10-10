package testGUI;

import java.awt.event.*;
import java.awt.*;


class TestKeymon
{
	public static void main(String[] args) 
	{
		new KeyFrame("keyframe");
	}
}
class KeyFrame extends Frame
{
	KeyFrame(String s)
	{
		super(s);
		setBounds(300,200,200,200);
		setBackground(Color.BLUE);
		setVisible(true);
		addKeyListener(new KeyMonitor());
		addWindowListener(new WindowMonitor());
	}
	class WindowMonitor extends WindowAdapter//WindowListener是一个抽象类 如果继承它的话必须重写其所有方法 所以采用一个已经实现方法的WindowAdapter类
	{
		public void windowClosing(WindowEvent e)
		{
			setVisible(false);//将显示的窗口退出显示      此句话必须再内部类时才能使用 否则在此类中不包含此方法 此方法为包装类的成员方法
			System.exit(0);//除了0以外返回给系统的都为非正常退出 不过对用户来讲无其他影响
		}                
	}
}
class KeyMonitor extends KeyAdapter//键盘的监听器    KeyAdapter为KeyListener的子类
{
	public void keyPressed(KeyEvent e)//事件源对象
	{
		int i = e.getKeyCode();//通过事件源对象  获得键入的字符
		switch(i)//进行逐一对应的判断
		{
			case KeyEvent.VK_DOWN :System.out.println("down");
								break;
			case KeyEvent.VK_LEFT :System.out.println("left");
								break;
			case KeyEvent.VK_RIGHT :System.out.println("right");
								break;
			case KeyEvent.VK_UP :System.out.println("up");
								break;
			default:System.out.println("请键入方向键");
								break;
		}
	}
}
