package testGUI;

import java.awt.*;
class TestFlowLayout//����FlowLayout���ֹ�����  �ؿ�API�ĵ� 
{
	public static void main(String[] args) 
	{
		Button b1 = new Button("Open");//������ť �����������
		Button b2 = new Button("Close");
		Button b3 = new Button("Next");
		Frame f = new Frame("FlowLayout");//����һ������4������:λ�ô�С������ɫ���Ƿ���ӣ����ֹ���ķ�ʽ
		f.setLayout(new FlowLayout());//�˹��췽����3��
		f.setBounds(100,100,500,400);//���������Լ���Ⱥ͸߶�
		f.setBackground(Color.GREEN);
		f.setVisible(true);
		f.add(b1);//����ť�����Frameͼ��������
		f.add(b2);
		f.add(b3);
	}
}
