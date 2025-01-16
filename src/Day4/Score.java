package Day4;

public class Score {
    public void score(int[] score)
    {
        int maxScore = score[0];
        int minScore = score[0];
        int mostScore = 0;
        int leastscore = 0;
        for(int c:score)
        {
            if(c>maxScore)
            {
                maxScore = c;
                mostScore++;

            } else if (c<minScore) {
                minScore=c;
                leastscore++;
            }
        }

        System.out.println(mostScore+" "+minScore);

    }
}
