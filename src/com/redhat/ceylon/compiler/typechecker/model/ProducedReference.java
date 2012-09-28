package com.redhat.ceylon.compiler.typechecker.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * A produced type or produced reference to a
 * method or attribute
 *
 * @author Gavin King
 */
public abstract class ProducedReference implements Serializable {

    private static final long serialVersionUID = -2415389105949846818L;

    ProducedReference() {}

    private Map<TypeParameter, ProducedType> typeArguments = Collections.emptyMap();
    private Declaration declaration;
    private ProducedType qualifyingType;

    public void rehash(){
        Map<TypeParameter, ProducedType> typeArguments = new HashMap<TypeParameter, ProducedType>();
        typeArguments.putAll(this.typeArguments);
        this.typeArguments = typeArguments;
    }

    public ProducedType getQualifyingType() {
        return qualifyingType;
    }

    void setQualifyingType(ProducedType qualifyingType) {
        this.qualifyingType = qualifyingType;
    }

    public Declaration getDeclaration() {
        return declaration;
    }

    void setDeclaration(Declaration type) {
        this.declaration = type;
    }

    public Map<TypeParameter, ProducedType> getTypeArguments() {
        return typeArguments;
    }

    void setTypeArguments(Map<TypeParameter, ProducedType> typeArguments) {
        this.typeArguments = typeArguments;
    }

    public abstract ProducedType getType();
    
    public ProducedType getFullType() {
    	return getFullType(getType());
    }

    public ProducedType getFullType(ProducedType wrappedType) {
    	if (getDeclaration() instanceof Functional) {
    		return getDeclaration().getUnit().getCallableType(this, wrappedType);
    	}
    	else {
    		return wrappedType;
    	}
    }
    
    public boolean isFunctional() {
        return declaration instanceof Functional;
    }

    /**
     * Get the type of a parameter, after substitution of
     * type arguments.
     */
    public ProducedTypedReference getTypedParameter(Parameter p) {
        ProducedTypedReference ptr = new ProducedTypedReference();
        ptr.setDeclaration(p);
        ptr.setQualifyingType(getQualifyingType());
        ptr.setTypeArguments(getTypeArguments());
        return ptr;
    }
    
}
