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
	class WindowMonitor extends WindowAdapter//WindowListener��һ�������� ����̳����Ļ�������д�����з��� ���Բ���һ���Ѿ�ʵ�ַ�����WindowAdapter��
	{
		public void windowClosing(WindowEvent e)
		{
			setVisible(false);//����ʾ�Ĵ����˳���ʾ
			System.exit(0);//����0���ⷵ�ظ�ϵͳ�Ķ�Ϊ�������˳� �������û�����������Ӱ��
		}                
	}
}