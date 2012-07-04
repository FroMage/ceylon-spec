package com.redhat.ceylon.compiler.typechecker.model;

public class Interface extends ClassOrInterface {

    private static final long serialVersionUID = -896055630831588627L;

    @Override
    public boolean isAbstract() {
        return true;
    }
    
}
