package testGUI;

import java.awt.event.*;
import java.awt.*;

class TestAnonymous2 
{
	Frame f = new Frame("匿名监听器");
	TextField tf = new TextField();
	Button b = new Button("start");
	TestAnonymous2(){//此类的构造方法
		f.add(b,"North");//将按钮加入到布局中
		f.add(tf,"South");
		f.setBounds(200,200,300,300);
		b.addActionListener(new ActionListener(){//匿名活动监听  此为一个语法要求的格式
			private int i = 1;
			public void actionPerformed(ActionEvent e){
				tf.setText(e.getActionCommand()+ i++);
			}
		});
		f.addWindowListener(new WindowAdapter(){//添加一个匿名的 Window监听
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.pack();        	
		f.setVisible(true);//注意:此句的丢失会导致窗口无法显示，程序自动结束
	}
	public static void main(String[] args) 
	{
		new TestAnonymous2(); 
	}
}

