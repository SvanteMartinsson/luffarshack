package luffarshack;

public class Main {
	
	drawMap draw;
	
	public Main(){
		draw = new drawMap(15, 15);
		gameLoop();
	}

	public static void main(String[] args) {
		new Main();
	}
	
	
	public void gameLoop(){
		draw.draw();
	}

}
