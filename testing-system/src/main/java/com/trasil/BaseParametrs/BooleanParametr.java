package com.trasil.BaseParametrs;

public class BooleanParametr extends Parametr<Boolean> {
    public BooleanParametr(boolean start){
        super(start, true, !start, start);
    }

    @Override
    public boolean hasNext() {
        return current ^ stop;
    }

    @Override
    public void next() {
        current ^= true ;
    }
}
