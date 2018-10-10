package testGUI;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
class MyMouseAdapter 
{
	public static void main(String[] args) 
	{
		new MyFrame2("drawing...");
	}
}

class MyFrame2 extends Frame
{
	ArrayList<Point> points = null;//引入一个容器  已使用泛型 即此容器只能装Point对象
	MyFrame2(String s)//构造方法，不要忘记形参
	{
		super(s);
		points = new ArrayList<Point>();
		setBounds(200,300,400,500);
		setLayout(null);
		setBackground(new Color(200,100,150));
		setVisible(true);
		addMouseListener(new MouseMonitor());//进行鼠标监听
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
	public void addPoint(Point p)//写一个Frame类中的方法
	{
		points.add(p);//将Point对象添加到ArrayList中
	}
	public void paint(Graphics g)//Frame方法中paint方法
	{
		Iterator<Point> i = points.iterator();//一个容器的提取器 其在容器的类中都包含
		while(i.hasNext())//提取器的提取格式
		{
			Point p = i.next();//返回下一个Point对象
			g.setColor(Color.YELLOW);
			g.fillOval(p.x,p.y,10,10);//p即Point对象 内部包含变量x，y的值
		}
	}
}

class MouseMonitor extends MouseAdapter//MouseListener是一个抽象类 如果继承它的话必须重写其所有方法 所以采用一个已经实现方法的MouseAdapter类
{
	public void mousePressed(MouseEvent e)//鼠标时事件
	{
		MyFrame2 f = (MyFrame2)e.getSource();//得到事件源 并强制转化为MyFrame2对象
		f.addPoint(new Point(e.getX(),e.getY()));//得到事件源中的坐标
		f.repaint();//此方法为强制重画 否则的话在窗口中画出的点无法立即显示出来，必须最大化，最小化，重新显示窗口时才能显现出来
	}                 //方法的实质为先调用UpDate方法再调用Paint方法  体现出双缓冲
}
