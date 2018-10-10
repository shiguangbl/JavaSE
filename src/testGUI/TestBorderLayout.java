package testGUI;

import java.awt.*;
class TestBorderLayout //此布局管理器将窗口分为东西南北中四个部分 需注意窗口展开时各个方位的按钮的变换方法
{
	public static void main(String[] args) //此布局管理器是Frame的默认管理器 不用调用setLayout()方法
	{
		Frame f = new Frame("BorderLayout");
		f.setLocation(200,300);
		f.setBackground(new Color(200,100,250));
		Button b1 = new Button("东");
		Button b2 = new Button("西");
		Button b3 = new Button("南");
		Button b4 = new Button("北");
		Button b5 = new Button("中");
		f.add(b4, BorderLayout.NORTH);//将此按钮添加到布局管理器的北部
		f.add(b3, BorderLayout.SOUTH);
		f.add(b2, BorderLayout.WEST);
		f.add(b1, BorderLayout.EAST);
		f.add(b5, BorderLayout.CENTER);
		f.setVisible(true);
		f.setSize(300,300);
	}
}
