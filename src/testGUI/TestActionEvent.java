package testGUI;
import java.awt.event.*;
import java.awt.*;
class TestActionEvent
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("event");
		Button b = new Button("button");//button在运行的过程中已经调用了ActionListener接口 而在实际过程中存在多态
		monitor m = new monitor();//new出来一个实现了ActionListener接口的对象
		b.addActionListener(m);//一个注册的过程，告诉按钮b 有个监听器在监听它被点击的动作
		f.add(b);                //传入的必须是实现ActionListener接口的对象
		f.setBackground(new Color(200,100,30));
		f.setBounds(300,200,200,300);
		f.setVisible(true);
	}
}
class monitor implements ActionListener//监听不同的事件(动作)，要实现不同的监听接口，此接口是用来监听动作事件
{
	public void actionPerformed(ActionEvent e){//重写了此监听器的方法，并且此过程中包含多态
		System.out.println("button has been pressed");//在button调用此方法时 系统把关于这件事发生的信息封装成后传入此方法ActionEvent e
	}
}
