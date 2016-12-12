package luffarshack;

public class Main {
	
	drawMap draw;
	Player player;
	
	public Main(){
		draw = new drawMap(15, 15);
		player = new Player();
		gameLoop();
	}

	public static void main(String[] args) {
		new Main();
	}
	
	
	public void gameLoop(){
		boolean loop = true;
		while(loop){
			draw.draw();
			player.move();
			loop = false;
		}
		
	}

}
