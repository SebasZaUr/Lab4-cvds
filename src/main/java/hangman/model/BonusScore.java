package hangman.model;

public class BonusScore implements GameScore{
    private int score = 0;
    private int previousIncorrect =0;
    private int previousCorrect = 0;
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        if(previousCorrect < correctCount){
            previousCorrect = correctCount;
            score += 10;
        }else if(previousIncorrect < incorrectCount){
            previousIncorrect = incorrectCount;
            score -= 5;
        }
        return score;
    }
}
