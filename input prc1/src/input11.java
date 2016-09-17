import java.util.Scanner;
public class input11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 ,pay  ;
		
		Scanner user = new Scanner(System.in);
	    System.out.println ("請輸入價格:");
	    num1 =user.nextInt();
	    System.out.println("請輸入投入金額:");
	    pay =user.nextInt();
	    int num3,num4;
	    num3=pay-num1;
	    if  (num3<1) {
	    System.out.println("金額不足");}
	    else{System.out.print("找錢金額"+num3);
	    	System.out.println("謝謝惠顧");}

	}

}
