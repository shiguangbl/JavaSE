package testGUI;

import java.awt.*;
import java.awt.event.*;
class TeFiMath
{
	public static void main(String[] args)//========û��ʹ���ڲ���=======
	{
		new TeFi2Frame().launchFrame();//�˷���Ϊ���ھ�̬����������new����һ���Ǿ�̬�ķ���  �����÷��� ��Chat����ϵͳ��Ҳ�����ʹ��
	}
}

class TeFi2Frame extends Frame//Frame��һ���� ע��ʹ�ùؼ���extends
{
	TextField num1,num2,num3;//����������������Ϊ��Ա����
	public void launchFrame()
	{
		 num1 = new TextField(10);//TextField��һ�����췽�������Զ����ı���Ŀ��
		 num2 = new TextField(10);
		 num3 = new TextField(15);
		Label add = new Label("+");//��Ϊһ��Label�� ������һ����ǩ��
		Button equal = new Button("=");
		equal.addActionListener(new MyMonitor(this));//�ڵ��ô˷���ʱ�����������
		setLayout(new FlowLayout());//�����ֹ���������
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
	TeFi2Frame tf = null;//������TeFiFrame����
	public MyMonitor(TeFi2Frame tf)
	{
		this.tf = tf;//������Ķ��󸳸�����
	}
	public void actionPerformed(ActionEvent e)
	{
		int n1 = Integer.parseInt(tf.num1.getText());//���ı����ݽ�����int����
		int n2 = Integer.parseInt(tf.num2.getText());
		tf.num3.setText(""+(n1+n2));//�˷���Ҫ�����ַ��� ��n1��n2��ֵ��Ӻ����һ���ַ��������ݾ��Զ�ת��ΪString����
	}
}