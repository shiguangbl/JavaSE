package testGUI;

import java.awt.*;
class TestBorderLayout //�˲��ֹ����������ڷ�Ϊ�����ϱ����ĸ����� ��ע�ⴰ��չ��ʱ������λ�İ�ť�ı任����
{
	public static void main(String[] args) //�˲��ֹ�������Frame��Ĭ�Ϲ����� ���õ���setLayout()����
	{
		Frame f = new Frame("BorderLayout");
		f.setLocation(200,300);
		f.setBackground(new Color(200,100,250));
		Button b1 = new Button("��");
		Button b2 = new Button("��");
		Button b3 = new Button("��");
		Button b4 = new Button("��");
		Button b5 = new Button("��");
		f.add(b4, BorderLayout.NORTH);//���˰�ť��ӵ����ֹ������ı���
		f.add(b3, BorderLayout.SOUTH);
		f.add(b2, BorderLayout.WEST);
		f.add(b1, BorderLayout.EAST);
		f.add(b5, BorderLayout.CENTER);
		f.setVisible(true);
		f.setSize(300,300);
	}
}
