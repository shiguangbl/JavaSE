package testGUI;

import java.awt.*;
import java.awt.event.*;
class TeFiMath2
{
	public static void main(String[] args)//======ʹ���ڲ���======
	{
		new TeFiFrame().launchFrame();//��ע�⡿�ؿ��˷���ʱҪ���տ�TeFiMath
	}
}

class TeFiFrame extends Frame //�ڴ����ڲ���ʱ �˳�Ϊ��װ��
{
	TextField num1,num2,num3;
	public void launchFrame()
	{
		 num1 = new TextField(10);
		 num2 = new TextField(10);
		 num3 = new TextField(15);
		Label add = new Label("+");
		Button equal = new Button("=");
		equal.addActionListener(new MyMonitor());//�ڵ��ô˷���ʱ����Ҫ�����������
		setLayout(new FlowLayout());
		add(num1);
		add(add);
		add(num2);
		add(equal);
		add(num3);
		pack();
		setVisible(true);//��ʲôʱ��ʹ���ڲ��ࡿ==���಻��Ҫ�����������ʱ==
	}
	class MyMonitor implements ActionListener//�ڲ��࣬�䷽��ʹ�ð�װ��ĳ�Ա�����ͷ���
	{
		public void actionPerformed(ActionEvent e)
		{
			int n1 = Integer.parseInt(num1.getText());//num1 �ܱ�����������������
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(""+(n1+n2));
		}
	}
}

