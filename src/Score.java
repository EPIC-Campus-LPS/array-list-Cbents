public class Score {
    public String name;
    public int score;


    public Score(String n, int s){
        name = n;
        score = s;
    }

    public static String toString(char s){
        return Character.toString(s);
    }
    public static String toString(int s){
        return Integer.toString(s);
    }

    public int getScore(){
        return score;
    }


}
