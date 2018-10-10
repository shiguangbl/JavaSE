package testGUI;

import java.awt.*;
import java.awt.event.*;
class TFActionEvent
{
	public static void main(String[] args)
	{
		new TFFrame();
	}
}

class TFFrame extends Frame//Frame是一个类 注意使用关键字extends
{
	TFFrame()
	{
		TextField tf = new TextField();//产生一个可写入文本框
		tf.addActionListener(new TFActionListener());//对TextField对象tf添加一个监听器
//		tf.setEchoChar('*');启用此句能将输入框的文本以*('单字符')形式掩盖，但是在控制台显示的依旧是真实输入的数据
		add(tf);
		pack();//将输入框包起来
		setVisible(true);
	}
}

class TFActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		TextField tf = (TextField)e.getSource();//ActionEvent父类EventObject的方法 获得事件源的各种信息
		System.out.println(tf.getText());//此方法为TextField类从父类TextComponent继承而来
		tf.setText("");//此方法为TextField类的方法 如果设为空，则可以将文本框内容清空
	}

}