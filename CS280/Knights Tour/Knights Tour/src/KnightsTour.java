/**
 * @author Silvia Carbajal
 */
public class KnightsTour {
final static int N=8;
static int board[][];
	public static void main(String[] args){
		board = new int[N][N];
        int x , y;
        for (x = 0; x < N; x++) //init board to 0 (not visited)
        	{
        		for ( y = 0; y < N; y++)
                	{board[x][y] = 0;}
            }
        
        move(0,0,1); //start
        
        //prints board
        for (x = 0; x < N; x++)
        	{
        		System.out.println();
        		for ( y = 0; y < N; y++)
               		{System.out.print(board[x][y]+" ");}
        	}//end of outer for loop
      }//end of main
	
	/**
	 * moves knight recursively 
	 * @param x coordinate
	 * @param y coordinate
	 * @param num 1-64 that goes on the board
	 * @return boolean , false backtracks, true continues and ends 
	 */
	
	public static boolean move(int x, int y,int num){
		if (x<0 || x>=8 || y<0 || y>=8 ){ //out of bound check
			return false;
			}
		if(board[x][y]!=0){ // if the square has been visited
			return false;
			}
		board[x][y]=num;//sets square to num 
		if (num==64) //reaches end  
			{return true;}
		
    //all 8 moves of the knight
		if(move(x+2, y+1,num+1)){
			return true;
		}
		else if(move(x+1,y-2,num+1)){
			return true;
		}
		else if(move(x+1,y+2,num+1)){
			return true;
		}
		else if(move(x-1,y+2,num+1)){
			return true;
		}
		else if (move(x-2,y-1,num+1)){
			return true;
		}
		else if(move(x-2,y+1,num+1)){
			return true;
		}
		else if (move(x-1,y-2,num+1)){
			return true;
		}
		else if (move(x+2,y-1,num+1)){
			return true;
		}
		board[x][y]=0; // set square to 0 (not visited)
		return false; //backtracking
	}   

}
