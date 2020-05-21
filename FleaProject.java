import java.util.Arrays;


public class FleaProject {
    
    int[][] fleas = new int[900][2];
    int[][] grid = new int[30][30];
    
    
    public FleaProject() 
    {
        

            for (int i = 0; i < fleas.length; i++)
            {
                for (int j = 0; j < fleas[i].length; i++)
                {
                    System.out.print(fleas[i][j]);
                }
            }
        
    
    
    }
    
    public static int getRandomInt(int limit) {
        double d = Math.random() * limit;
        int randomInt = (int) d;
        randomInt++;
        return randomInt;
    }//end of getRandomInt
    
    
    public int[][] getLocation(int i[][], int x, int y)
    {   
        
        int[][] s = new int[1][2];
        
       
        s[0][0] = {{i[x][0], 0}};
        return s;
    }
    
    
}



/* getLocation 

getPossibleJumps -- find out what spaces are available to jump into

jump




*/