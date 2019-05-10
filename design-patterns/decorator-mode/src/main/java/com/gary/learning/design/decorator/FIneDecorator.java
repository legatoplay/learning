package com.gary.learning.design.decorator;

/**
 * Created by Gary on 2018-11-28.
 * 罚款抽象装饰
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public abstract class FIneDecorator implements IFine {
    private IFine fine;

    public FIneDecorator(IFine fine) {
        this.fine = fine;
    }

    @Override
    public void fine() {
        this.fine.fine();
    }
}
