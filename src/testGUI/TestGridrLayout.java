package testGUI;

import java.awt.*;
class TestGridrLayout //�����ڷָ�ɰ�ť
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("GridLayout");
		f.setLayout(new GridLayout(3,2));//���˴��ڷָ�Ϊ3��4��
		f.setLocation(200,300);
		f.setBackground(new Color(200,100,250));
		Button b1 = new Button("b1");
		Button b2 = new Button("b2");
		Button b3 = new Button("b3");
		Button b4 = new Button("b4");
		Button b5 = new Button("b5");
		f.add(b4);
		f.add(b3);
		f.add(b2);
		f.add(b1);
		f.add(b5);
		f.pack();//ȱʧ�˷������������ʾ�����������ǻ����϶�չ��
		f.setVisible(true);
		f.setSize(300,300);
	}
}
