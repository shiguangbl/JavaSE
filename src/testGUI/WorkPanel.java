package testGUI;

import java.awt.*;
class WorkPanel 
{
	public static void main(String[] args) 
	{
		new MyFrame("FrameWithPanel",600,600,600,600,Color.BLUE);//Color是awt包内的一个类，颜色拼写为大写
	}
}
class MyFrame extends Frame//Frame的父类为Window
{
	MyFrame(String s,int x,int y,int w,int h,Color color){//此类仅仅重写了Frame的构造方法
		super(s);//继承父类的构造方法  将窗口的标题传入
		Panel p = new Panel(null);//
		setLayout(null);
		setBackground(color);//设置背景颜色
		setBounds(x,y,w,h);//设置窗口的大小  x,y是物理坐标单位为像素 w,h是宽度和高度
		p.setLayout(null);
		p.setBounds(w/4,h/4,w/2,h/2);//设置Panel的大小
		p.setBackground(Color.YELLOW);
		setVisible(true);//设置窗口是否可见
		add(p);//将p添加到此Frame的窗口中
	}
}
