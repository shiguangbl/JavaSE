/*	范例名称：Java事件处理举例
 * 	源文件名称：TestActionEvent2.java
 *	要  点：
 *  	1. 一个事件源组件上可以同时注册多个监听器
 *		2. 一个监听器对象可以同时注册到多个事件源组件上
 *		3. 事件源的信息可以随它所触发的事件自动传递到所有注册过的监听器
 */
package testGUI;

import java.awt.*;
import java.awt.event.*;
public class TestActionEvent2 {
    public static void main(String args[]) {
			Frame f = new Frame("Test");//采用了默认的布局管理器 东西南北中
			Button b1 = new Button("Start");
			Button b2 = new Button("Stop");
			Monitor2 bh = new Monitor2();
			b1.addActionListener(bh);//b1没有重设，其默认ActionCommand是Button名
			b2.addActionListener(bh);
			b2.setActionCommand("game over");//重设b2的ActionCommand
			f.add(b1,"North");
			f.add(b2,"Center");
			f.pack();	
			f.setVisible(true);
    }
}

class Monitor2 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	System.out.println("a button has been pressed," + 
    	"the relative info is:\n " + e.getActionCommand());//按钮不同，显示不同   
	}
}
