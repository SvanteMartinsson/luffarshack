package luffarshack;

public class AI {

	/**

	* Kolla P1 vinst
	* Kolla AI vinst
	* Kolla om P1 har 4 i rad en sida oblockad => block
	* Kolla om AI har 3 i rad !block => offense
	* Kolla om P1 3 i rad ! block => block
	* Kolla om AI är ett drag från 3 i rad på två håll => offense
	* Kolla om P1 är ett drag från 3 i rad på två håll => block
	* Kolla om AI har 4 i rad !dubbelblock => offense vinst
	* Kolla om AI har 3 i rad åt något håll !block => Offense
	* Kolla om AI är 1move från dubbla 3 i rad => offense
	* Kolla om AI är 1move från singel 3 irad => offense
	* Kolla om P1 är 1move från 3 i rad => block
	* Kolla om P1 är 1move från 2 i rad => block
	* Kolla om AI är 1move från 2 i rad => offense
	* Kolla om AI är 
	* Gå offensivt, försök hitta opportunity för att få 3 i rad på två håll
	* 
	*/
	
	private int x;
	private int y;
	private int width;
	private int height;
	private int map[][];
	
	
	public AI(int width, int height, int map[][]){
		this.width = width;
		this.height = height;
		this.map = map;
	}

	public void aiMove(int pX, int pY){
		
				for(int y = 0; y<height; y++){
					for(int x = 0; x<width; x++){
						if(map[y][x] == 0){
							checkIfPlace(x, y, width, height, map);
						}
					}
				}
		
	}
	
	public void checkIfPlace(int x, int y, int width, int height, int map[][]){
		
		int sumToRightEdge = width-x;
		int sumToLeftEdge = x;
		int sumToTop = y;
		int sumToBot = height-y;
		
		
		
	}
	
	public int getX(){
		return x-1;
	}
	
	public int getY(){
		return y-1;
	}

}
