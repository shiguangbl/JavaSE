package testGUI;
import java.awt.event.*;
import java.awt.*;
class TestActionEvent
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("event");
		Button b = new Button("button");//button�����еĹ������Ѿ�������ActionListener�ӿ� ����ʵ�ʹ����д��ڶ�̬
		monitor m = new monitor();//new����һ��ʵ����ActionListener�ӿڵĶ���
		b.addActionListener(m);//һ��ע��Ĺ��̣����߰�ťb �и��������ڼ�����������Ķ���
		f.add(b);                //����ı�����ʵ��ActionListener�ӿڵĶ���
		f.setBackground(new Color(200,100,30));
		f.setBounds(300,200,200,300);
		f.setVisible(true);
	}
}
class monitor implements ActionListener//������ͬ���¼�(����)��Ҫʵ�ֲ�ͬ�ļ����ӿڣ��˽ӿ����������������¼�
{
	public void actionPerformed(ActionEvent e){//��д�˴˼������ķ��������Ҵ˹����а�����̬
		System.out.println("button has been pressed");//��button���ô˷���ʱ ϵͳ�ѹ�������·�������Ϣ��װ�ɺ���˷���ActionEvent e
	}
}
