package checkinput;
import java.util.Scanner;

public class CheckInput {												//Check all integer input if legit int
	public static int InTest() {
		Scanner input = new Scanner(System.in);
		String inLine = new String();
		int inVal;
		while(true){
			inVal = 0;
			inLine = input.nextLine();
			try{
				inVal = Integer.parseInt(inLine);
				if(inVal < 1){
					System.out.print("Input invalid. Input should be greater than 0: ");
				}
				else{
					break;
				}
			} catch (NumberFormatException ne){
				System.out.print("Input not a number, please provide another: ");
			}
		}
		return inVal;
	}
}
