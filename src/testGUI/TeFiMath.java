package testGUI;

import java.awt.*;
import java.awt.event.*;
class TeFiMath
{
	public static void main(String[] args)//========没有使用内部类=======
	{
		new TeFi2Frame().launchFrame();//此方法为了在静态的主函数里new出来一个非静态的方法  即调用方法 在Chat聊天系统中也是如此使用
	}
}

class TeFi2Frame extends Frame//Frame是一个类 注意使用关键字extends
{
	TextField num1,num2,num3;//将这三个变量定义为成员变量
	public void launchFrame()
	{
		 num1 = new TextField(10);//TextField的一个构造方法，可以定义文本框的宽度
		 num2 = new TextField(10);
		 num3 = new TextField(15);
		Label add = new Label("+");//此为一个Label类 能生成一个标签栏
		Button equal = new Button("=");
		equal.addActionListener(new MyMonitor(this));//在调用此方法时传入其对象本身
		setLayout(new FlowLayout());//将布局管理器重设
		add(num1);
		add(add);
		add(num2);
		add(equal);
		add(num3);
		pack();
		setVisible(true);
	}
}

class MyMonitor implements ActionListener
{
	TeFi2Frame tf = null;//先引用TeFiFrame对象
	public MyMonitor(TeFi2Frame tf)
	{
		this.tf = tf;//将传入的对象赋给引用
	}
	public void actionPerformed(ActionEvent e)
	{
		int n1 = Integer.parseInt(tf.num1.getText());//将文本内容解析成int类型
		int n2 = Integer.parseInt(tf.num2.getText());
		tf.num3.setText(""+(n1+n2));//此方法要传入字符串 将n1，n2的值相加后加上一个字符串，数据就自动转换为String类型
	}
}