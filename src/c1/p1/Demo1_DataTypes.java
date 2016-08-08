package c1.p1;

public class Demo1_DataTypes {
	
	int aaa=10;//全局变量,类里面定义的变量
	
	public static void main(String[] args){
		
		int bbb=20;//局部变量,方法里面的变量
		
		//数据类型
		//8个基本数据类型
		//byte(1),short(2),int(4),long(8)
		//float(4),double(8)
		//boolean(1)
		//char(2)
		
		//定义变量
		//数据类型 变量名;
		byte age; //声明变量
		age=18; //给变量赋值
		
		age=127;
		
		int a=10; //声明的同时可以赋值
		int b1,b2=20,b3=30;
		
		System.out.println(age);
		System.out.println(1+1); //println打印后换行
		System.out.println("1"+"1"); //字符串连接
		System.out.println("1"+(1+1));
		//Ctrl+F11 运行
		System.out.println("年龄："+age);
		
		float c=10.5f; //float类型后面要加f
		double d=20.6d;  //java里面小数默认是double类型
		
		System.out.println(c);
		
		boolean result1=1>2;
		System.out.println(result1);
		boolean result2=true;
		
		char gender='M'; //char类型存储单个字符，用单引号括起来
		
		//String不是基本类型，它是一个类
		String name="Annabelle"; //双引号括起来字符串
		System.out.println("姓名："+name);
	}
}
