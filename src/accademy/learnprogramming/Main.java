package accademy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        calculateScore( true, 800, 5, 100);
        calculateScore( false, 10000, 8, 200);
        displayHighScorePosition("Harrison", calculateHighScorePosition(1500));
        checkNumber(1);
        checkNumber(-1);
        checkNumber(0);
    }

    public static int calculateScore(boolean gameOver ,int score ,int levelCompleted, int bonus) {

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);

            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition (String name, int position){
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition (int score) {
        int myReturn = 4;
        if (score > 1000){
            myReturn = 1;
        } else if (score >= 500){
            myReturn = 2;
        } else if (score >= 100) {
            myReturn = 3;
        }
        return myReturn;

    }

    public static void checkNumber(int number) {
        if (number > 0){
            System.out.println("positive");
        } else if (number < 0){
            System.out.println("negative");
        } else {
            System.out.println("equal to 0");
        }
    }

}






























