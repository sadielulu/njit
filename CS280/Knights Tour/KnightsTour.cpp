#include <iostream>
#include <string>

using namespace std;
const int N = 8;

//#DEFINE N 8
int board [N][N];




bool move(int x, int y,int num){
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
	
	
	
int main(){
	//int N=8;
	//int board[N][N];
	int x,y;
	for(x=0;x< N; x++){
		for(y=0;y< N;y++){
			 board[x][y]=0;
		}
	}
	
	 move(0,0,1);
	
	 for (x = 0; x < N; x++)
		{
         	cout << '\n';
         	for ( y = 0; y < N; y++)
                { cout << board[x][y] << " ";}
         }//end of outer for loop
	return 0;
}//end of main
	
	
	
