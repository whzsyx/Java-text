import java.util.Scanner;
public class WHZ5{
	public static void main(String[] args){
		System.out.println("������һ����ݣ�");
		Scanner ac = new Scanner(System.in);
		int years = ac.nextInt();
		if (years % 4 ==0&& years %100 !=0|| years % 400 ==0) {
			System.out.println(years+"����ƽ��");
		}else{
			System.out.println(years+"����ƽ��");
		}
	}
}