package c1.p1;

public class UseStudent {

	public static void main(String[] args) {
		//创建对应访问类成员
		Student s1;
		s1=new Student(); //new实例化对象，之后才会分配内存
		//访问类成员，对象名.属性名  对象名.方法名()
		s1.displayDetails();
		
		//Alt+shift+r 修改变量名称
		Student s2=new Student("S003","李凡凡");
		s2.displayDetails();
		
		Student s3=new Student("S004","李凡凡2",19,'F');
		s3.displayDetails();
		
		Student s4=new Student();
		s4.rollno="S004"; //public
		s4.name="Anna"; //default
		//s4.age=19; //private
		s4.gender='M'; //protected
	}

}
