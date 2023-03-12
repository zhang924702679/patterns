package com.yao.mediator;

public abstract class AbstractColleague {

    protected Mediator mediator;
    public AbstractColleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
