package testGUI;

import java.awt.*;
class TestFlowLayout2 //��ڷ�����һ�� ����ڷŷ���
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("frame2");
		FlowLayout l = new FlowLayout(FlowLayout.CENTER,20,30);//�˲��ֹ�������һ�ֹ��췽��:λ�ã����Ҽ�࣬���¼��
		f.setLayout(l);
		f.setBackground(new Color(200,100,100));//��ӱ���3ԭɫ
		f.setSize(200,200);
		f.setLocation(200,300);//�������Ͻ�����λ��
		f.setVisible(true);//���ӻ� �˷�����λ�÷���û������
		for(int i=0;i<8;i++)
		{
			f.add(new Button("button"));//��Ӷ����ť
		}
	}
}
