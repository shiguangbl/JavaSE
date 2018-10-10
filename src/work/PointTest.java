package work;
class Point2{
	double x,y,z;
	Point2(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	void setX(double x){
		this.x = x;
	}
	void setY(double y){
		this.y = y;
	}
	void setZ(double z){
		this.z = z;
	}
	public double distance(Point2 o){//��Ϊ���� ����һ������ǿ�����int double һ���ؿ������� ����ǰ����÷�����������һ������
		return (x - o.x)*(x - o.x)+(y - o.y)*(y - o.y)+(z - o.z)*(z - o.z);
	}
}
public class PointTest {
	public static void main(String[] args) {
		Point2 p = new Point2(1.0, 1.0, 1.0);
		Point2 o = new Point2(0.0,0.0,0.0);
		System.out.println(p.distance(o));//o ��ǰ���Ѿ������  �� o ����һ������
		p.setX(2.0);
		p.setY(2.0);
		p.setY(2.0);
		System.out.println(p.distance(new Point2(0.0, 1.0, 1.0)));//ֱ��������һ������ ����distance����

	}

}
