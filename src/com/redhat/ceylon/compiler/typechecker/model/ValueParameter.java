package com.redhat.ceylon.compiler.typechecker.model;

public class ValueParameter extends Parameter {
    
    private static final long serialVersionUID = -4216463760487655126L;

    private boolean hidden;
    
    public boolean isHidden() {
        return hidden;
    }
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
    
}
