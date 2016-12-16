package luffarshack;

public class Main {
	
	drawMap draw;
	Player player;
	CheckMap mapCheck;
	AI enemy;
	
	
	
	public Main(){
		draw = new drawMap(15, 15);
		player = new Player();
		mapCheck = new CheckMap();
		enemy = new AI(draw.getWidth(), draw.getHeight());
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
				draw.addPMoveToBoard(player.getY(), player.getX());
				enemy.aiMove(player.getX()+1, player.getY()+1);
				draw.addEMoveToBoard(enemy.getY(), enemy.getX());
			}
				
		}
		
	}

}
