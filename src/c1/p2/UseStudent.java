package c1.p2;

import c1.p1.Student;

//导包
//import c1.*; //导c1包里的所有类

//Ctrl+Shift+O导包，导入需要的类，删除不需要的类的导入
public class UseStudent {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.rollno="S004"; //public 所有类可以访问该成员
//		s1.name="Anna"; //default 同包里的类可以访问
//		s1.age=19; //private 只有定义该成员的类可以访问该成员
//		s1.gender='M'; //protected 受保护的,不同包的子类可以访问
		//同包里的类可以访问，不同包里只有子类可以访问
		
		//public->protected->default->private
	}
}

class GoodStudent extends Student{
	
	public void display(){
		System.out.println(gender);
	}
}

class Animal{
	protected String color;
}

class Dog extends Animal{
	
}




