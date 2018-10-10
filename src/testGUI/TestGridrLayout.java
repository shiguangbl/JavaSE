package testGUI;

import java.awt.*;
class TestGridrLayout //将窗口分割成按钮
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("GridLayout");
		f.setLayout(new GridLayout(3,2));//将此窗口分割为3行4列
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
		f.pack();//缺失此方法将会仅仅显示标题栏，但是还能拖动展开
		f.setVisible(true);
		f.setSize(300,300);
	}
}
