package pr54;

import java.util.*;
import java.io.*;
class pr54 
{
	public static void main(String[] args) throws IOException 
	{
          	 
    	Scanner file = new Scanner( new File( "pr54.dat" ) );
    	int times = file.nextInt();
    	file.nextLine();
    	 int sum = 0;
			int[][] myMatrix = {{1,2,3,4,5},{6,7,8,9,0},{6,7,1,2,5},{6,7,8,9,0},{5,4,3,2,1}};
			for( int zz = 0; zz < times; zz++ )
				{
					int r = file.nextInt();
					int c = file.nextInt();
					int specialNumber = myMatrix[r][c];
					if ((r>0 && r<4)&&( c>0 && c<4))
				//	for(int i = 0 ; i<9; i++)
					{
						
					
					int a = myMatrix[r-1][c-1]+myMatrix[r-1][c]+myMatrix[r-1][c+1]+myMatrix[r][c-1]+specialNumber+myMatrix[r][c+1]+myMatrix[r+1][c-1]+myMatrix[r+1][c]+myMatrix[r+1][c+1];
					System.out.println(a);
					}
				
    	///AABBBCCCC
				}
}
}
