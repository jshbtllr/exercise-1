import java.util.Scanner;
import java.util.Random;
import TableArr.CreateTable;
import Menus.Manipulate;

public class Ex1 {
	public static void main (String args[]){
		CreateTable init = new CreateTable(); 		
		String [][] localArr = init.Reset(); 					//Fill initial contents
		int exit = 0;
		Manipulate tableMat = new Manipulate();
		tableMat.Show(localArr);								//Initial Print
		while(exit == 0){
			System.out.println("");
			System.out.println("Menu");
			System.out.println("Search***********1");
			System.out.println("Edit*************2");
			System.out.println("Print************3");
			System.out.println("Reset************4");
			System.out.println("Exit*************5");
			System.out.println("");
			System.out.print("Choose corresponding number to choose a Function: ");
			Scanner menu = new Scanner(System.in);
			String func = menu.nextLine();		
			
			switch(func){
				case "1":										//Search Function	
					tableMat.SearchCell(localArr);
					break;
				case "2":										//Edit Function
					localArr = tableMat.EditCell(localArr);
					break;
				case "3":										//Print Function
					tableMat.Show(localArr);
					break;
				case "4":										//Reset Function
					localArr = init.Reset();
					tableMat.Show(localArr);
					break;
				case "5":										//Exit
					exit = 1;
					break;
				default:										
					System.out.print(func);
					System.out.println(" is not a valid Function. Choose another function.");
			}
		}
	}
}