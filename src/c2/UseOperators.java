package c2;

public class UseOperators {
	public static void main(String[] args) {
		
		//判断一个数字是否是正偶数
		int num=10;
		if(num>0&&num%2==0)
			System.out.println("正偶数");
		
		//闰年的判断
		int year=2004;
		//1. 能除尽400 2. 能除尽4但是除不尽100
		if(year%400==0||(year%4==0&&year%100!=0))
			System.out.println("闰年！");
		
		int a=3;
		
		System.out.println(a++); //3  a=4
		System.out.println(++a); //5  a=5
		System.out.println(a--); //5  a=4
		System.out.println(--a); //3  a=3
		
		int b=3;
		int c=b++-2; //c=1 b=4;
		int d=--b+1; //b=3 d=4
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//三元运算符
		String result1=2>3?"Yes":"No";
		int result2=4>3?1:0;
		
		String result;
		if(2>3)
			result="Yes";
		else
			result="No";
	}
}
