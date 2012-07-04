package com.redhat.ceylon.compiler.typechecker.model;

import java.io.Serializable;

public class Import implements Serializable {
	
    private static final long serialVersionUID = 5986201817631766626L;

    private TypeDeclaration typeDeclaration;
	private String alias;
	private Declaration declaration;
	private boolean wildcardImport;
	
	public Import() {}

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public TypeDeclaration getTypeDeclaration() {
		return typeDeclaration;
	}
    
    public void setTypeDeclaration(TypeDeclaration typeDeclaration) {
		this.typeDeclaration = typeDeclaration;
	}
    
    @Override
    public String toString() {
        return "Import[" + alias + "]";
    }
    
    public boolean isWildcardImport() {
        return wildcardImport;
    }
    
    public void setWildcardImport(boolean wildcardImport) {
        this.wildcardImport = wildcardImport;
    }

}
