package testGUI;

import java.awt.*;
class WorkPanel 
{
	public static void main(String[] args) 
	{
		new MyFrame("FrameWithPanel",600,600,600,600,Color.BLUE);//Color��awt���ڵ�һ���࣬��ɫƴдΪ��д
	}
}
class MyFrame extends Frame//Frame�ĸ���ΪWindow
{
	MyFrame(String s,int x,int y,int w,int h,Color color){//���������д��Frame�Ĺ��췽��
		super(s);//�̳и���Ĺ��췽��  �����ڵı��⴫��
		Panel p = new Panel(null);//
		setLayout(null);
		setBackground(color);//���ñ�����ɫ
		setBounds(x,y,w,h);//���ô��ڵĴ�С  x,y���������굥λΪ���� w,h�ǿ�Ⱥ͸߶�
		p.setLayout(null);
		p.setBounds(w/4,h/4,w/2,h/2);//����Panel�Ĵ�С
		p.setBackground(Color.YELLOW);
		setVisible(true);//���ô����Ƿ�ɼ�
		add(p);//��p��ӵ���Frame�Ĵ�����
	}
}
