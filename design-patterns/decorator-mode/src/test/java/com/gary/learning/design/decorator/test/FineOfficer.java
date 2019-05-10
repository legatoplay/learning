package com.gary.learning.design.decorator.test;

import com.gary.learning.design.decorator.BaseFine;
import com.gary.learning.design.decorator.DamagedBookFine;
import com.gary.learning.design.decorator.LoseBookFine;

/**
 * Created by Gary on 2018-11-28.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public class FineOfficer {
    public static void main(String[] args) {
        BaseFine baseFine = new BaseFine();
        baseFine.fine();
        //开始装饰

        DamagedBookFine damagedBookFine = new DamagedBookFine(baseFine);
        damagedBookFine.fine();

        LoseBookFine loseBookFine = new LoseBookFine(baseFine);
        loseBookFine.fine();
    }
}
