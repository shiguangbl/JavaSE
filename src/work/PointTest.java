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
	public double distance(Point2 o){//此为引用 定义一个类就是可以像int double 一样地可以引用 但是前提给该方法所传的是一个对象
		return (x - o.x)*(x - o.x)+(y - o.y)*(y - o.y)+(z - o.z)*(z - o.z);
	}
}
public class PointTest {
	public static void main(String[] args) {
		Point2 p = new Point2(1.0, 1.0, 1.0);
		Point2 o = new Point2(0.0,0.0,0.0);
		System.out.println(p.distance(o));//o 在前面已经造出来  即 o 代表一个对象
		p.setX(2.0);
		p.setY(2.0);
		p.setY(2.0);
		System.out.println(p.distance(new Point2(0.0, 1.0, 1.0)));//直接匿名出一个对象 传给distance方法

	}

}
