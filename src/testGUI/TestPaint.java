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
	public void LaunchFrame()//�ڷ�������дFrame
	{
		setBounds(100,200,300,300);
		setVisible(true);
	}
	public void paint(Graphics g)//�˷���Ϊ�Զ����ã��ڴ��ڱ����´�ʱ����С�����������ػ���
	{
		Color c = g.getColor();//��¼��ǰ���ʵ���ɫ
		g.setColor(Color.RED);//���軭�ʵ���ɫ
		g.fillOval(100,100,150,100);//����Բ������������100��100 ��������150��100�ľ��ε��ڽ�Բ
		g.setColor(Color.GREEN);
		g.drawLine(30,20,45,100);//����Ĳ�ͬ��ͼ�εĻ�����Graphics���з�װ
		g.setColor(c);//��ԭ��ǰ���ʵ���ɫ
	}
}


