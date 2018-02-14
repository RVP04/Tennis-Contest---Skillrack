import java.util.*;
public class Hello {

    public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int players = sc.nextInt();
	    //store all the player information in map
	    Map<Integer,String> player = new HashMap<Integer,String>();
	    for(int i =0;i<players;i++)
	    {
	        player.put(sc.nextInt(),sc.next());
	    }
	    int winnerId = 0;
	    //store all the rounds played by the players
	    String[][] round = new String[players-1][2];
	    for(int i =0;i<players-1;i++)
	    {
	        String temp = sc.next();
	        String[] teamNumber = temp.split("vs");
	        round[i][0]=teamNumber[0];
	        round[i][1]=teamNumber[1];
	        
	        if(i==players-2)
	            winnerId = Integer.parseInt(teamNumber[0]);
	    }
	    
	    for(int i = players-2;i>=0;i--)
	    {
	        if(Integer.parseInt(round[i][0])==winnerId)
	        {
	            int temp = Integer.parseInt(round[i][1]);
	            System.out.println(player.get(temp));
	        }
	    }
	    
	}
}
