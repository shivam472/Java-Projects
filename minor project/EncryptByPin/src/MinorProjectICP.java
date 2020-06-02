import java.util.Scanner;
public class MinorProjectICP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: "); //length of the digit the user will enter
		int n = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the 1st " + n + " digit number: ");
		String num1 = sc.next();
		System.out.println();
		
		System.out.print("Enter the 2nd " + n + " digit number: ");
		String num2 = sc.next();
		System.out.println();
		
		System.out.print("Enter the 3rd " + n + " digit number: ");
		String num3 = sc.next();
		System.out.println();
		
		System.out.print("Enter the 4th " + n + " digit number: ");
		String num4 = sc.next();
		System.out.println();
		
		String pin = "";
		int min;
		int ch1, ch2, ch3, ch4;
		for(int i = 0; i < 6; i++)
		{
			ch1 = (int)(num1.charAt(i) - 48);
			ch2 = (int)(num2.charAt(i) - 48);
			ch3 = (int)(num3.charAt(i) - 48);
			ch4 = (int)(num4.charAt(i) - 48);
			min = Math.min(Math.min(ch1,ch2),Math.min(ch3,ch4));
			pin = pin + min;
		}
		System.out.print("Your pin is: " + pin);
		System.out.println();
		System.out.println();
		
		Scanner msg = new Scanner(System.in);
		System.out.println("Enter the message: ");
		String message = msg.nextLine();
		message = message.replaceAll(" ", "");   	//replacing all kinds of whitespaces
		message = message.toLowerCase();		 //converting the message into lowercase
		System.out.println();
		System.out.print("The message is:  " + message);
		
		int msgLength = message.length();
		int j = 0;
		int x = 0;
		String encrypt = "";
		for(int i = 0; i < message.length(); i++)
		{
			x = (int)(message.charAt(i)) + (pin.charAt(j) - 48);
			
			if(x <= 122) {
				encrypt = encrypt + (char)(x);
				j++;
			}
			
			else {
				x = 97;
				encrypt = encrypt + (char)(x);
				j++;
			}
				
			if(j == 6)
				j = 0;
		}
		System.out.println();
		System.out.println();
		encrypt = encrypt.toUpperCase();
		System.out.println("The encrypted message is: " + encrypt);
	
	}

}
