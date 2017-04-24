package Menus;
import checkinput.CheckInput;
import java.util.Scanner;

public class Manipulate{												//Array Manipulations
	public void Show(String [][] curArray){
		int show_rows = 0, show_cols = 0;
		show_rows = curArray.length;
		show_cols = curArray[0].length;
		for(int cur1 = 0; cur1 < show_rows; cur1++){
			for(int cur2 = 0; cur2 < show_cols; cur2++){
				System.out.print(curArray[cur1][cur2] + "  ");
			}
			System.out.println("");
		}						 //Print the Array
	}

	public void SearchCell(String [][] srchArr){
		int cur1 = 0, cur2 = 0;
		int ctr = 0, end = 0, occur = 0;
		Scanner needle = new Scanner(System.in);
		String srchN = new String();			
		while ( (srchN.length() > 3) || (srchN.length() == 0) ){		//Input should be 3 Chars or Less
			System.out.print("Input Search Character: ");
			srchN = needle.nextLine();
			if(srchN.length() > 3){
				System.out.println("\nSearch Character should be 3 characters or less");
			}
		}
		for(cur1 = 0; cur1 < srchArr.length; cur1++ ){
			for (cur2 = 0; cur2 < srchArr[0].length; cur2++){
				ctr = 0;
				end = 0;
				while((end = srchArr[cur1][cur2].indexOf(srchN, end)) != -1){			
					ctr++;
					occur++;
					if(occur == 1){
						System.out.println("\nSearch Character \"" + srchN + "\" occurred");
					}
					end += srchN.length();
				}
				if(ctr > 0){
					System.out.println( ( (ctr > 1) ? (ctr + " times") : "Once" ) + " on" + " Row: " + (cur1+1) + " Column: " + (cur2+1) );

				}
			}
		}
		if(occur == 0){
			System.out.println("\nSearch Character \"" + srchN + "\" not found.");
		}
	}

	public String [][] EditCell(String [][] editArr){
		int editCol = 0, editRow = 0;
		Scanner editIndex = new Scanner(System.in);
		
		do{
			System.out.println("\nSpecify which cell to update");
			System.out.print("Specify Row: ");
			editRow = CheckInput.InTest();							//get row input
			System.out.print("Specify Column: ");
			editCol = CheckInput.InTest();							//get col input
			if( (editRow > editArr.length) || (editCol > editArr[0].length) ){
				System.out.print("\nSpecified Cell is out of bounds.\n");		//prommpt if out of bounds
			}
		}while( (editRow > editArr.length) || (editCol > editArr[0].length) );	//get input until the cell is okay
		System.out.println("\nChange Value of Cell to:");
		String inString = editIndex.nextLine();					//get cell input until input is correct
		while((inString.length() != 3)){						
			if( inString.length() > 0 ){
				System.out.println("\nValue should be three characters");
				System.out.println("\nChange Value of Cell to:");
			}
			inString = editIndex.nextLine();
		}
		editArr[editRow-1][editCol-1] = inString;
		return editArr;
	}
}
