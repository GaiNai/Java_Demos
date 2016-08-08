package c1.p1;

//访问修饰符：说明类成员如何被使用
//static
//final：修饰变量的时候，变量称为常量
//一个源文件里可以定义多个类
//一个源文件里只能有一个类是public
//如果一个源文件有多个类，而且有一个是public，则文件名必须和public类相同
//如果一个源文件有多个类，但是没有public类，则文件名随意
class Circle{
	
	//静态成员，属于类的，不会随着对象而改变，所有对象共享一个值
	public static final double PI=3.14;
	double r; //非静态成员，属于对象，值随着对象改变
	
	public void calArea(){
		System.out.println(PI*r*r);
	}
	
	public static void displayPI(){
		System.out.println(PI);
	}
}

public class UseCircle {
	
	public static void sayHi(){
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		//一般情况下，同类里的两个方法可以直接相互调用
		//但是同类里，静态方法只能访问静态成员
		//非静态方法可以访问其他任何成员
		sayHi();
		
		Circle c1=new Circle();
		c1.r=3;
		System.out.println(c1.PI);
		System.out.println(c1.r);
		c1.calArea();
		//静态成员可以直接通过类名访问,一般通过类名访问静态对象
		System.out.println(Circle.PI);
		//System.out.println(Circle.r);
		
		Circle c2=new Circle();
		System.out.println(c1.PI);//3.14
		System.out.println(c2.PI); //3.14
		
		//c2.PI=3.1415; //final的变量为常量，不能修改值
		System.out.println(c1.PI); //3.1415
		System.out.println(c2.PI); //3.1415
		
		
	}
}
