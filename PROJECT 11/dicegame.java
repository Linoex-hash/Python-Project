import java.lang.Math;
//this is a game that tests a dice roll
public class dicegame
{
    int[]pscore;
    int[]cscore;
    int[]cwins;
    int[]pwins;
    int[]ties;
    int[]count;
    
    
    public dicegame(int x)
    {
        pscore=new int[x];
        cscore=new int[x];
        cwins=new int[x];
        pwins=new int[x];
        ties=new int[x];
        count=new int[x];
    }
    public int diceroll()
    {
        double a=(Math.random()*6);
        int y=(int)(a);
        y++;
        return y;
    }
    /**
     * Method run
     *
     */
    public void run()
    {
        System.out.println(count.length);
        int dr;
        int dr2;
        int pointp=0;
        int pointc=0;
        int wc=0;
        int wp=0;
        int tp=0;
        int prtc=1;
        int sum=0;
        int sum2=0;
        int tiest=0;
        for(int i=0;i<(count.length);i=i+1)
        {
            dr=diceroll();
            dr2=diceroll();
            pscore[i]=dr;
            cscore[i]=dr2;
            System.out.println("for round " + prtc + " the number on the dice for the player is " + dr);
            System.out.println("for round " + prtc + " the number on the dice for the computer is " + dr2);
            if (dr2>dr)
            {
               cwins[i]=1;
               pwins[i]=0;
               ties[i]=0;
               System.out.println("computer wins round " + prtc + "!");
               System.out.println("player lost this round!");
            }
             else if (dr>dr2)
            {
                
                pwins[i]=1;
                cwins[i]=0;
                ties[i]=0;
                System.out.println("player wins round " + prtc + "!");
                System.out.println("computer lost this round!");

            }
            else
            {
             ties[i]=1;
             pwins[i]=0;
             cwins[i]=0;  
             System.out.println("Tie for round " + prtc + "!");
            }
            prtc++;
        }
        for(int i=0;i<pwins.length;i++)
        {
            sum=sum+pwins[i];
        }
        for(int i=0;i<cwins.length;i++)
        {
           sum2=sum2+cwins[i];
        }
        for (int i=0;i<ties.length;i++)
        {
            tiest=tiest+ties[i];
        }
        System.out.println("Player won " + sum + " times.");
        System.out.println("NPC won " + sum2 + " times.");
        System.out.println("There were " + tiest + " ties.");
        if (sum==sum2)
        {
            System.out.println("So there was a compelete tie.");
        }
        else if(sum>sum2)
        {
            System.out.println("So you won!");
        }
        else
        {
            System.out.println("So you lost...");
        }
    }
    public static void main(String[] args)
    {
        String m=javax.swing.JOptionPane.showInputDialog("how many games?");
        int l;
        l=Integer.parseInt(m);
        dicegame c=new dicegame(l);
        c.run();
    }
}
        
    
        
      
