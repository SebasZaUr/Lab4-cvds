package hangman;

import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class GameScoreTest {

    private OriginalScore origin = new OriginalScore();
    private BonusScore bonus = new BonusScore();
    private PowerScore power = new PowerScore();
    @Test
    public void validateOriginPlay() {
        int result = origin.calculateScore(0, 0);
        Assert.assertEquals(100, result);
        result = origin.calculateScore(0, 1);
        Assert.assertEquals(90, result);
        result = origin.calculateScore(1, 1);
        Assert.assertEquals(90, result);
        result = origin.calculateScore(1, 2);
        Assert.assertEquals(80, result);
    }

    @Test
    public void validateBonusPalyscorrct(){
        int result = bonus.calculateScore(0, 0);
        Assert.assertEquals(0, result);
        result = bonus.calculateScore(1, 0);
        Assert.assertEquals(10, result);
        result = bonus.calculateScore(1, 1);
        Assert.assertEquals(5, result);
        result = bonus.calculateScore(2, 1);
        Assert.assertEquals(15, result);
    }

    @Test
    public void validateNotResiveNegativeNumber() {
        int result = origin.calculateScore(0, 0);
        Assert.assertEquals(100, result);
        result = origin.calculateScore(0, -1);
        Assert.assertEquals(100, result);
        result = bonus.calculateScore(0, -1);
        Assert.assertEquals(0, result);
        result = power.calculateScore(0, -1);
        Assert.assertEquals(0, result);
    }

    @Test
    public void validateOriginDownToNegativesNumbers() {
        int result = origin.calculateScore(0, 0);
        result = origin.calculateScore(0, 0);
        result = origin.calculateScore(0, 1);
        result = origin.calculateScore(0, 2);
        result = origin.calculateScore(0, 3);
        result = origin.calculateScore(0, 4);
        result = origin.calculateScore(0, 5);
        result = origin.calculateScore(0, 6);
        result = origin.calculateScore(0, 7);
        result = origin.calculateScore(0, 8);
        result = origin.calculateScore(0, 9);
        result = origin.calculateScore(0, 10);
        result = origin.calculateScore(0, 11);
        Assert.assertEquals(0, result);
    }

}
