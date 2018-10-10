package testGUI;

import java.awt.*;
class TestFlowLayout2 //像摆放桌子一样 常规摆放方法
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("frame2");
		FlowLayout l = new FlowLayout(FlowLayout.CENTER,20,30);//此布局管理器的一种构造方法:位置，左右间距，上下间距
		f.setLayout(l);
		f.setBackground(new Color(200,100,100));//添加背景3原色
		f.setSize(200,200);
		f.setLocation(200,300);//窗口左上角物理位置
		f.setVisible(true);//可视化 此方法的位置放置没有限制
		for(int i=0;i<8;i++)
		{
			f.add(new Button("button"));//添加多个按钮
		}
	}
}
