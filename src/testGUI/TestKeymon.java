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
	class WindowMonitor extends WindowAdapter//WindowListener��һ�������� ����̳����Ļ�������д�����з��� ���Բ���һ���Ѿ�ʵ�ַ�����WindowAdapter��
	{
		public void windowClosing(WindowEvent e)
		{
			setVisible(false);//����ʾ�Ĵ����˳���ʾ      �˾仰�������ڲ���ʱ����ʹ�� �����ڴ����в������˷��� �˷���Ϊ��װ��ĳ�Ա����
			System.exit(0);//����0���ⷵ�ظ�ϵͳ�Ķ�Ϊ�������˳� �������û�����������Ӱ��
		}                
	}
}
class KeyMonitor extends KeyAdapter//���̵ļ�����    KeyAdapterΪKeyListener������
{
	public void keyPressed(KeyEvent e)//�¼�Դ����
	{
		int i = e.getKeyCode();//ͨ���¼�Դ����  ��ü�����ַ�
		switch(i)//������һ��Ӧ���ж�
		{
			case KeyEvent.VK_DOWN :System.out.println("down");
								break;
			case KeyEvent.VK_LEFT :System.out.println("left");
								break;
			case KeyEvent.VK_RIGHT :System.out.println("right");
								break;
			case KeyEvent.VK_UP :System.out.println("up");
								break;
			default:System.out.println("����뷽���");
								break;
		}
	}
}
