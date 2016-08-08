package c1.p1;

//访问说明符：说明类成员被访问的界限
//public,private, protected, default
//public和default可以修饰外部类
public class Student {
	
	//成员变量
	public String rollno; //说明该成员可以被任何类访问
	String name; //不加任何访问说明符，就是默认的default访问界限
	private int age; //该成员只能被当前类内部使用
	protected char gender; // F或M
	
	//构造函数
	//名字和类名一样，没有返回类型，初始化类成员变量，或一些其他的初始化工作
	//创建对象的时候自动被调用
	public Student(){
		rollno="S001";
		name="Anna";
		age=18;
		gender='M';
	}
	
	public Student(String r,String n){
		rollno=r;
		name=n;
	}
	
	public Student(String r,String n,int a,char g){
		rollno=r;
		name=n;
		age=a;
		gender=g;
	}
	
	//成员方法
	public void takeExam(){
		System.out.println("我要考试");
		//int aaa=10;
	}
	
	//定义的一个方法，显示学生信息
	public void displayDetails(){
		System.out.println("学号："+rollno);
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("性别："+gender);
		//System.out.println(aaa);
	}
}
