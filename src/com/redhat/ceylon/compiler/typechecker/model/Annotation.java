package com.redhat.ceylon.compiler.typechecker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Annotation implements Serializable {

    private static final long serialVersionUID = 7386263346052027518L;
    
    private String name;
	private Map<String,String> namedArguments = new HashMap<String,String>();
	private List<String> positionalArguments = new ArrayList<String>();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Map<String,String> getNamedArguments() {
        return namedArguments;
    }
    
    public void addNamedArgument(String param, String value) {
        this.namedArguments.put(param, value);
    }
    
    public List<String> getPositionalArguments() {
        return positionalArguments;
    }
    
    public void addPositionalArgment(String value) {
        positionalArguments.add(value);
    }
    
    @Override 
    public String toString() {
        String vs = "";
        if (!positionalArguments.isEmpty()) {
            vs = positionalArguments.toString().replace('[', '(').replace(']', ')');
        }
        else if (!namedArguments.isEmpty()) {
            vs = namedArguments.toString().replace(',', ';');
        }
        return "Annotation[" + name + vs + "]";
    }
    
}
