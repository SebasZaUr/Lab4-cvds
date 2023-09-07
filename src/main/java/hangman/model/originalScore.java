package hangman.model;

public class originalScore implements GameScore{
    private int score = 100;

    private int previousIncorrectCount = 0;


    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        if (correctCount == 0 && incorrectCount == 0){
            score = 100;
        }
        if (previousIncorrectCount < incorrectCount && score >0) {
            score -= 10;
        }
        previousIncorrectCount = incorrectCount;
        return score;
    }
}
