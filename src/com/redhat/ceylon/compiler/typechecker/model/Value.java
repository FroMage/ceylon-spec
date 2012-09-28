package com.redhat.ceylon.compiler.typechecker.model;


/**
 * Represents s simple attribute or local.
 *
 * @author Gavin King
 */
public class Value extends MethodOrValue {

    private static final long serialVersionUID = 2551482529365621372L;

    private boolean variable;
    //private boolean formal;
    private boolean captured = false;

    /*public boolean isFormal() {
         return formal;
     }

     public void setFormal(boolean formal) {
         this.formal = formal;
     }*/

    @Override
    public boolean isVariable() {
        return variable;
    }

    public void setVariable(boolean variable) {
        this.variable = variable;
    }

    @Override
    public boolean isCaptured() {
        return captured;
    }

    public void setCaptured(boolean local) {
        this.captured = local;
    }

}
