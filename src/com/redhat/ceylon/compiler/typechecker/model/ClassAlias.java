package com.redhat.ceylon.compiler.typechecker.model;


import java.util.List;

public class ClassAlias extends Class {

    private static final long serialVersionUID = -7491927517590239329L;

    @Override
    public ProducedType getProducedType(ProducedType outerType, 
            List<ProducedType> typeArguments) {
        return aliasType(outerType, typeArguments);
    }

    @Override
    public boolean isAlias() {
        return true;
    }
    
    @Override
    public boolean isAbstract() {
        Class etd = getExtendedTypeDeclaration();
        return etd!=null && etd!=this && etd.isAbstract();
    }
    
}
