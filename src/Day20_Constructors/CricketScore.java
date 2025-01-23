package Day20_Constructors;

import java.util.Scanner;

public class CricketScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String team = sc.next();
        long score = sc.nextLong();
//        String[][] arr = new String[2][2];
//        for(int i = 0;i<2;i++)
//        {
//            for (int j = 0;j<2;j++)
//            {
//                arr[i][j] = sc.nextLine();
//            }
//        }
        Score[] scores = new Score[2];
        for(int i=0;i<2;i++)
        {
            scores[i] =  new Score();
            scores[i].setTeam(team);
            scores[i].setScore(score);
        }
        for(int i = 0;i<2;i++)
        {
            System.out.println("Innings "+(i+1)+" Details");
            String tresult = scores[i].getTeam();
            long sresult = scores[i].getScore();
            System.out.println("BattingTeam: "+tresult);
            System.out.println("Run scored: "+sresult);
        }
    }
}
class Score{
    private String Team;
    private  long score;



    public void setTeam(String team) {
        this.Team = team;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String getTeam() {
        return Team;
    }

    public long getScore() {
        return score;
    }

    public void print()
    {
        System.out.println("BattingTeam: "+getTeam());
        System.out.println("Run scored: "+getScore());
    }
}
