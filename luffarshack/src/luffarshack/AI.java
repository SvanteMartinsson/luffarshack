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
	
	
	public AI(int width, int height){
		this.width = width;
		this.height = height;
	}

	public void aiMove(int pX, int pY){
		
				x = pX + 1;
				y = pY;
		
	}
	
	public int getX(){
		return x-1;
	}
	
	public int getY(){
		return y-1;
	}

}
