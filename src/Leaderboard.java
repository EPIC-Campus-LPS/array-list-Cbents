import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Leaderboard {
    private int capacity;
    private ArrayList<Score> scoreboard;

    public Leaderboard(int cap){
        capacity = cap;
        scoreboard = new ArrayList<>(capacity);

    }

    public void addScore(String name, int score){
        //Add score to the scoreboard in the appropriate location
        Score newScore = new Score(name, score);
        scoreboard.add(newScore);
    }

    public int getHighScore(){
        int big = 0;
        for (Score e : scoreboard){
            if (e.score >= big){
                big = e.score;
            }

        }
        return big;
    }

    public int getAverageScore(){
        int sum = 0;
        for (Score e : scoreboard){
            sum += e.score;
        }
        return sum / scoreboard.size();
    }

    public boolean break1000(){
        for (Score e : scoreboard){
            if (e.score > 1000){
                return true;
            }
        }
        return false;
    }

    public void printLeaderboard(){
        Collections.sort(scoreboard, Comparator.comparingInt(Score::getScore));
        System.out.println("----------Leaderboard----------");
        for (Score e : scoreboard){
            System.out.printf("   %s  |   %d   \n", e.name, e.score);
        }

    }

}
