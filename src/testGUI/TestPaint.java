package testGUI;

import java.awt.*;
class TestPaint
{
	public static void main(String[] args)
	{
		new PaintFrame().LaunchFrame();
	}
}
class PaintFrame extends Frame
{
	public void LaunchFrame()//在方法中重写Frame
	{
		setBounds(100,200,300,300);
		setVisible(true);
	}
	public void paint(Graphics g)//此方法为自动调用，在窗口被重新打开时，最小化，最大最大化重画，
	{
		Color c = g.getColor();//记录当前画笔的颜色
		g.setColor(Color.RED);//重设画笔的颜色
		g.fillOval(100,100,150,100);//画椭圆，在物理坐标100，100 画出宽，高150，100的矩形的内接圆
		g.setColor(Color.GREEN);
		g.drawLine(30,20,45,100);//具体的不同的图形的画法在Graphics类中封装
		g.setColor(c);//还原当前画笔的颜色
	}
}


