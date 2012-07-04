package com.redhat.ceylon.compiler.typechecker.model;


public class ControlBlock extends Element implements Scope {

    private static final long serialVersionUID = -5840480538320168334L;
    
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ControlBlock) {
            ControlBlock that = (ControlBlock) obj;
            return id==that.id && 
                    getContainer().equals(that.getContainer());
        }
        else {
            return false;
        }
    }
}
