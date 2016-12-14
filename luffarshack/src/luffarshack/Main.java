package luffarshack;

public class Main {
	
	drawMap draw;
	Player player;
	CheckMap mapCheck;
	
	public Main(){
		draw = new drawMap(15, 15);
		player = new Player();
		mapCheck = new CheckMap();
		gameLoop();
	}

	public static void main(String[] args) {
		new Main();
	}
	
	
	public void gameLoop(){
		boolean loop = true;
		while(loop){
			draw.draw();
			mapCheck.checkPlayer(draw.getMap(), draw.getHeight(), draw.getWidth());
			loop = mapCheck.getLoop();
			
			if(loop){
				player.move();
				draw.addPMoveToBoard(player.getX(), player.getY());
			}
				
		}
		
	}

}
