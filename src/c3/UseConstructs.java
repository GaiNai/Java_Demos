package c3;

import java.util.Scanner;

public class UseConstructs {
	public static void main(String[] args) {
		//条件结构
		//if...else
		
		int age=18;
		
		if(age>=18)
			System.out.println("成年人");
		
		if(age>=18)
			System.out.println("成年人");
		else
			System.out.println("未成年人");
		
		
		int salary=1000;
		if(salary>800)
			System.out.println("土豪");
		else if(salary>500)
			System.out.println("平民");
		else
			System.out.println("穷人");
		
		//switch...case
		//判断结果有多个，一般用于判断变量或表达式的值
		//怎么输入
		System.out.println("1.开始游戏");
		System.out.println("2.查看帮助");
		System.out.println("3.退出游戏");
		System.out.println("请输入你的选择：");
		
		//Scanner类公开了一些方法，可以接受输入
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		//switch后面的变量只能是整数、char、String类型
		switch(choice){
		case 1: 
			System.out.println("你选择开始游戏");
			break;
		case 2:
			System.out.println("你选择查看帮助");
			break;
		case 3:
			System.out.println("你选择退出游戏");
			break;
		default:
			System.out.println("无效操作！");
		}
	}
}
