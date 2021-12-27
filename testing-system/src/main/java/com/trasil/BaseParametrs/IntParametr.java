package com.trasil.BaseParametrs;

public class IntParametr extends Parametr<Integer> {
    public IntParametr(int start, int step, int stop, int def){
        super(start, step, stop, def);
    }

    @Override
    public boolean hasNext() {
        return current + inc < stop;
    }

    @Override
    public void next() {
        current += inc;
    }
}
