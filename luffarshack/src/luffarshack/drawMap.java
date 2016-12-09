package luffarshack;

public class drawMap {
	
	private int width;
	private int height;
	
	int[][] map;
	
	public drawMap(int width, int height){
		this.width = width;
		this.height = height;
		map = new int[width][height];
		for(int i = 0; i < height; i++){
			for(int x = 0; x<width; x++){
				System.out.println(i + " " + x);
				map[i][x] = 0;
			}
		}
		
	}
	
	public void draw(){
		
		for(int x = 0; x < height; x++){
			for(int y = 0; y<width; y++){
				System.out.print(map[x][y]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	
}
