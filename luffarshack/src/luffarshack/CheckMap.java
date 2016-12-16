package luffarshack;

public class CheckMap {
	
	private boolean loop = true;
	
	public void checkPlayer(int[][] map, int height, int width){
		for(int x = 0; x < height; x++){
			for(int y = 0; y<width; y++){
				
				
				// Upp, ner , v�nster & h�ger
				if(x<width-2){
					if(map[y][x] == 1 && map[y][x+1] == 1 && map[y][x+2] == 1 && map[y][x+3] == 1 && map[y][x+4] == 1){
						System.out.println("Win");
						loop = false;
					}
				}	
				
				if(y>3){
					if(map[y][x] == 1 && map[y-1][x] == 1 && map[y-2][x] == 1 && map[y-3][x] == 1 && map[y-4][x] == 1){
						System.out.println("Win");
						loop = false;
					}
				}
				
				// Diagonaler
				
				if(x>3 && y>3){
					if(map[y][x] == 1 && map[y-1][x-1] == 1 && map[y-2][x-2] == 1 && map[y-3][x-3] == 1 && map[y-4][x-4] == 1){
						System.out.println("Win");
						loop = false;
					}
				}
				
				if(x<width-2 && y>1){
					if(map[y][x] == 1 && map[y-1][x+1] == 1 && map[y-2][x+2] == 1 && map[y-3][x+3] == 1 && map[y-4][x+4] == 1){
						System.out.println("Win");
						loop = false;
					}
				}
				
				
				
				
				
			}
		}
	}
	
	public boolean getLoop(){
		return loop;
	}
	
}
