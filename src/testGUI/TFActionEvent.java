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

class TFFrame extends Frame//Frame��һ���� ע��ʹ�ùؼ���extends
{
	TFFrame()
	{
		TextField tf = new TextField();//����һ����д���ı���
		tf.addActionListener(new TFActionListener());//��TextField����tf���һ��������
//		tf.setEchoChar('*');���ô˾��ܽ��������ı���*('���ַ�')��ʽ�ڸǣ������ڿ���̨��ʾ����������ʵ���������
		add(tf);
		pack();//������������
		setVisible(true);
	}
}

class TFActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		TextField tf = (TextField)e.getSource();//ActionEvent����EventObject�ķ��� ����¼�Դ�ĸ�����Ϣ
		System.out.println(tf.getText());//�˷���ΪTextField��Ӹ���TextComponent�̳ж���
		tf.setText("");//�˷���ΪTextField��ķ��� �����Ϊ�գ�����Խ��ı����������
	}

}