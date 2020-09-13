package assignment1;

import java.lang.StringBuffer;

public class Identifier implements IdentifierInterface {

    private StringBuffer identifier;

    Identifier(){
        identifier = new StringBuffer();
    }

    Identifier(Identifier src){
        identifier = new StringBuffer();
        identifier.append(src.identifier);
    }

    @Override
    public void init(char c) {
        identifier.delete(0,identifier.length());
        identifier.append(c);
    }

    @Override
    public void add(char c){
         identifier.append(c);
    }

    @Override
    public int size() {
        return identifier.length();
    }

    @Override
    public boolean equals(Identifier comparand) {
        return this.get().equals(comparand.get());
    }

    @Override
    public String get() {
        return identifier.toString();
    }
}