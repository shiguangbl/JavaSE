package testGUI;

import java.awt.event.*;
import java.awt.*;

class TestAnonymous2 
{
	Frame f = new Frame("����������");
	TextField tf = new TextField();
	Button b = new Button("start");
	TestAnonymous2(){//����Ĺ��췽��
		f.add(b,"North");//����ť���뵽������
		f.add(tf,"South");
		f.setBounds(200,200,300,300);
		b.addActionListener(new ActionListener(){//���������  ��Ϊһ���﷨Ҫ��ĸ�ʽ
			private int i = 1;
			public void actionPerformed(ActionEvent e){
				tf.setText(e.getActionCommand()+ i++);
			}
		});
		f.addWindowListener(new WindowAdapter(){//���һ�������� Window����
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.pack();        	
		f.setVisible(true);//ע��:�˾�Ķ�ʧ�ᵼ�´����޷���ʾ�������Զ�����
	}
	public static void main(String[] args) 
	{
		new TestAnonymous2(); 
	}
}

