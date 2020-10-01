import java.util.Scanner;
public class WHZ4{
	public static void main(String[] args){
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0;
		Scanner ac = new Scanner(System.in);
		System.out.println("第一个整数：");
		a = ac.nextInt();
		Scanner in = new Scanner(System.in);
		System.out.println("第二个整数：");
		b = ac.nextInt();
		c = a+b;
		d = a-b;
		e = a*b;
		f = a/b;
		g = a%b;
		System.out.println(a+"+"+b+"="+c);
		
		System.out.println(a+"-"+b+"="+d);
		System.out.println(a+"*"+b+"="+e);
		System.out.println(a+"/"+b+"="+f);
		System.out.println(a+"%"+b+"="+g);
	
		}
}