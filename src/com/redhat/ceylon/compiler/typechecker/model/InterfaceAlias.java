package com.redhat.ceylon.compiler.typechecker.model;


import java.util.List;

public class InterfaceAlias extends Interface {
    
    private static final long serialVersionUID = -4335620396857554242L;

    @Override
    public ProducedType getProducedType(ProducedType outerType, 
            List<ProducedType> typeArguments) {
        return aliasType(outerType, typeArguments);
    }
    
    @Override
    public boolean isAlias() {
        return true;
    }
    
}
