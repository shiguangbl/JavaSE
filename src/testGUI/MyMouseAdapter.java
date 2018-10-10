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
	ArrayList<Point> points = null;//����һ������  ��ʹ�÷��� ��������ֻ��װPoint����
	MyFrame2(String s)//���췽������Ҫ�����β�
	{
		super(s);
		points = new ArrayList<Point>();
		setBounds(200,300,400,500);
		setLayout(null);
		setBackground(new Color(200,100,150));
		setVisible(true);
		addMouseListener(new MouseMonitor());//����������
		addWindowListener(new WindowMonitor());
	}
	class WindowMonitor extends WindowAdapter//WindowListener��һ�������� ����̳����Ļ�������д�����з��� ���Բ���һ���Ѿ�ʵ�ַ�����WindowAdapter��
	{
		public void windowClosing(WindowEvent e)
		{
			setVisible(false);//����ʾ�Ĵ����˳���ʾ      �˾仰�������ڲ���ʱ����ʹ�� �����ڴ����в������˷��� �˷���Ϊ��װ��ĳ�Ա����
			System.exit(0);//����0���ⷵ�ظ�ϵͳ�Ķ�Ϊ�������˳� �������û�����������Ӱ��
		}                
	}
	public void addPoint(Point p)//дһ��Frame���еķ���
	{
		points.add(p);//��Point������ӵ�ArrayList��
	}
	public void paint(Graphics g)//Frame������paint����
	{
		Iterator<Point> i = points.iterator();//һ����������ȡ�� �������������ж�����
		while(i.hasNext())//��ȡ������ȡ��ʽ
		{
			Point p = i.next();//������һ��Point����
			g.setColor(Color.YELLOW);
			g.fillOval(p.x,p.y,10,10);//p��Point���� �ڲ���������x��y��ֵ
		}
	}
}

class MouseMonitor extends MouseAdapter//MouseListener��һ�������� ����̳����Ļ�������д�����з��� ���Բ���һ���Ѿ�ʵ�ַ�����MouseAdapter��
{
	public void mousePressed(MouseEvent e)//���ʱ�¼�
	{
		MyFrame2 f = (MyFrame2)e.getSource();//�õ��¼�Դ ��ǿ��ת��ΪMyFrame2����
		f.addPoint(new Point(e.getX(),e.getY()));//�õ��¼�Դ�е�����
		f.repaint();//�˷���Ϊǿ���ػ� ����Ļ��ڴ����л����ĵ��޷�������ʾ������������󻯣���С����������ʾ����ʱ�������ֳ���
	}                 //������ʵ��Ϊ�ȵ���UpDate�����ٵ���Paint����  ���ֳ�˫����
}
