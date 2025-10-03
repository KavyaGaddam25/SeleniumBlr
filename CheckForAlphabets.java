package regex_pack;

import java.util.Scanner;

public class CheckForAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		
		String pat = "^[a-zA-Z]+$";
		
		if(str.matches(pat))
		{
			System.out.println("All are alphabets");
		}
		else
		{
			System.out.println("All are not alphabets");
		}

	}

}
