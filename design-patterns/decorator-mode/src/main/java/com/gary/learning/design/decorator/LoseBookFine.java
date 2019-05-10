package com.gary.learning.design.decorator;

/**
 * Created by Gary on 2018-11-28.
 * 丢书图书罚款
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public class LoseBookFine extends FIneDecorator {
    public LoseBookFine(IFine fine) {
        super(fine);
    }

    @Override
    public void fine() {
        System.out.print("你丢了书，");
        super.fine();
    }
}
