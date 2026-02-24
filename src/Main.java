public static void main(String[] args) {

    ArrayList<String> words = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean n = true;
    while (n){
        String input = scanner.nextLine();

        if (input.equals("STOP")) {
            n = false;
        }

        else if (input.indexOf(' ') != -1){ //If the string has more than 1 word
            String[] wordarr = input.split(" ");
            for (String e : wordarr){
                words.add(e);
            }

        }
        else{ //String has only 1 word
            words.add(input);
        }

    }












    Leaderboard board = new Leaderboard(5);

    board.addScore("ABC", 100);
    board.addScore("DEF", 200);
    board.addScore("GHI", 250);
    board.addScore("JKL", 300);
    board.addScore("MNO", 205);

    System.out.println("High Score: " + board.getHighScore());
    System.out.println("Average Score: " + board.getAverageScore());
    System.out.println("Did a player break 1000 points?: " + board.break1000());

    System.out.println("\nLeaderboard: ");
    board.printLeaderboard();

    System.out.println("\nLeaderboard: ");
    board.addScore("PQR", 150);

    board.printLeaderboard();

}