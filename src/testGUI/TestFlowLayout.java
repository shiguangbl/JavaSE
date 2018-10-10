package testGUI;

import java.awt.*;
class TestFlowLayout//测试FlowLayout布局管理器  回看API文档 
{
	public static void main(String[] args) 
	{
		Button b1 = new Button("Open");//创建按钮 构造出其名字
		Button b2 = new Button("Close");
		Button b3 = new Button("Next");
		Frame f = new Frame("FlowLayout");//构造一个窗口4个基础:位置大小，背景色，是否可视，布局管理的方式
		f.setLayout(new FlowLayout());//此构造方法有3种
		f.setBounds(100,100,500,400);//物理坐标以及宽度和高度
		f.setBackground(Color.GREEN);
		f.setVisible(true);
		f.add(b1);//将按钮添加入Frame图形容器中
		f.add(b2);
		f.add(b3);
	}
}
