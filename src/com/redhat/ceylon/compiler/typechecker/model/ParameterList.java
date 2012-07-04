package com.redhat.ceylon.compiler.typechecker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ParameterList implements Serializable {
    
    private static final long serialVersionUID = -3623327480774107914L;

    private List<Parameter> parameters = new ArrayList<Parameter>();
    private boolean supportsNamedParameters = true;
    
    public List<Parameter> getParameters() {
        return parameters;
    }
    
    @Override
    public String toString() {
        return "ParameterList" + parameters.toString();
    }

    public boolean isNamedParametersSupported() {
        return supportsNamedParameters;
    }

    public void setNamedParametersSupported(boolean supportsNamedParameters) {
        this.supportsNamedParameters = supportsNamedParameters;
    }
    
    public boolean hasSequencedParameter() {
        return !parameters.isEmpty() && 
                parameters.get(parameters.size()-1).isSequenced();
    }
    
}
