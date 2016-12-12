package luffarshack;

import java.util.Scanner;

public class Player {
	
	char[] letters = "ABCDEFHIJKLMNO".toCharArray();
	Scanner scanner = new Scanner(System.in);
	private int x;
	private int y;
	
	public Player(){
		// Konstruktor ifall det behövs :p
	}
	
	public void move(){
		System.out.println("Ditt drag: ");
		
		String line = scanner.nextLine();
		x = Character.getNumericValue(line.charAt(1));
		y = getYValue(line.charAt(0));
		System.err.println(x + " " + y);
	}
	
	private int getYValue(char letter){
		int finalY = 0;
		
		for(int i = 0; i < letters.length; i++){
			if(letter == letters[i]){
				finalY = i+1;
			}
		}
		
		return finalY;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
}
