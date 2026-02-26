public static void main(String[] args) {

    ArrayList<String> words = new ArrayList<>();
    ArrayList<String> lowercaseWords = new ArrayList<>();
    ArrayList<String> unique = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean n = true;
    int theCount = 0;
    int totalword = 0;
    boolean alllower = true;
    while (n){
        System.out.print("Enter a sentence: ");
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
    totalword = words.size();
    int big = 0;
    String biggestW = "";
    int numUnique = 0;
    for (String e : words) {

        if (e.equals(e.toUpperCase())) {  // Check uppercase
            alllower = false;
        }

        if (e.equalsIgnoreCase("the")) {  // Check for "the"
            theCount++;
        }

        if (unique.indexOf(e.toLowerCase()) == -1){ //Check for uniqueness
            unique.add(e.toLowerCase());
        }

        if (e.length() >= big){ //Find biggest word
            biggestW = e.toLowerCase();
            big = e.length();
        }

    }
    numUnique = unique.size();

    System.out.printf("Chat Report:\nYou used %d words.\nYou used %d unique words.\nYou used 'the' %d times.\n'%s' was the longest word.\nAre all words lowercase? %b\n", totalword, numUnique, theCount, biggestW, alllower);














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