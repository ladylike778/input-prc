import java.util.Scanner;
public class input11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 ,pay  ;
		
		Scanner user = new Scanner(System.in);
	    System.out.println ("�п�J����:");
	    num1 =user.nextInt();
	    System.out.println("�п�J��J���B:");
	    pay =user.nextInt();
	    int num3,num4;
	    num3=pay-num1;
	    if  (num3<1) {
	    System.out.println("���B����");}
	    else{System.out.print("������B"+num3);
	    	System.out.println("���´f�U");}

	}

}
