package TableArr;
import checkinput.CheckInput;
import java.util.Random;
public class CreateTable{									
	public String [][] Reset(){									//Get user input for the number of RxC
		int rows = 0, cols = 0;
		System.out.print("Input Number of Rows: ");
		rows = CheckInput.InTest();
		System.out.print("Input Number of Columns: ");
		cols = CheckInput.InTest();
		String [][] myArr = new String[rows][cols];
		int cur1 = 0, cur2 = 0, count = 0;
		StringBuilder randChar = new StringBuilder();
		for (cur1 = 0; cur1 < rows; cur1++){					//Fills the matrix with Strings
			for(cur2 = 0; cur2 < cols; cur2++){
				count = 0;
				randChar.setLength(0);
				while ( count < 3 ){
					Random c = new Random();
					char ascii = (char)(c.nextInt(94) + 32);	//random printable ascii from 32 to 126
					randChar.append(ascii);
					count++;
				}
				myArr[cur1][cur2] = randChar.toString();
			}
		}
		return myArr;
	}
}
