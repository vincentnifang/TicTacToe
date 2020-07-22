package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Vincent
 */

public class GameTest {

    Game game;

    @Before
    public void init() {
        game = new Game();
    }

    @Test
    public void tic_success() {
        Assert.assertEquals(Code.TIC_SUCCESS, game.tic("1,1").code);
    }

    @Test
    public void tic_fail_invalid_input() {
        Assert.assertEquals(Code.INVALID_INPUT, game.tic("-1").code);
        Assert.assertEquals(Code.INVALID_INPUT, game.tic("dsa").code);
        Assert.assertEquals(Code.INVALID_INPUT, game.tic("1,s").code);
    }

    @Test
    public void tic_fail_out_of_bounds() {
        Assert.assertEquals(Code.OUT_OF_BOUNDS, game.tic("-1,0").code);
        Assert.assertEquals(Code.OUT_OF_BOUNDS, game.tic("5,0").code);
        Assert.assertEquals(Code.OUT_OF_BOUNDS, game.tic("0,3").code);
    }
    @Test
    public void tic_fail_already_tic() {
        game.tic("1,0");
        Assert.assertEquals(Code.TIC_ALREADY, game.tic("1,0").code);
    }

    @Test
    public void tic_no() {
        Assert.assertEquals(false, game.noEmptyPostion());
        game.tic("0,0");
        game.tic("0,1");
        game.tic("0,2");
        game.tic("1,0");
        game.tic("1,1");
        game.tic("1,2");
        game.tic("2,0"); game.tic("2,0");
        game.tic("2,1");
        Assert.assertEquals(false, game.noEmptyPostion());
        game.tic("2,2");
        Assert.assertEquals(true, game.noEmptyPostion());
    }

}
