package testGUI;

import java.awt.*;
import java.awt.event.*;
class TeFiMath2
{
	public static void main(String[] args)//======使用内部类======
	{
		new TeFiFrame().launchFrame();//【注意】回看此方法时要对照看TeFiMath
	}
}

class TeFiFrame extends Frame //在存在内部类时 此称为包装类
{
	TextField num1,num2,num3;
	public void launchFrame()
	{
		 num1 = new TextField(10);
		 num2 = new TextField(10);
		 num3 = new TextField(15);
		Label add = new Label("+");
		Button equal = new Button("=");
		equal.addActionListener(new MyMonitor());//在调用此方法时不必要传入自身对象
		setLayout(new FlowLayout());
		add(num1);
		add(add);
		add(num2);
		add(equal);
		add(num3);
		pack();
		setVisible(true);//【什么时候使用内部类】==该类不需要被其他类调用时==
	}
	class MyMonitor implements ActionListener//内部类，其方便使用包装类的成员变量和方法
	{
		public void actionPerformed(ActionEvent e)
		{
			int n1 = Integer.parseInt(num1.getText());//num1 能被读出，不必再引用
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(""+(n1+n2));
		}
	}
}

