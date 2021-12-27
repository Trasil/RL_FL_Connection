package com.trasil.BaseParametrs;

public class DoubleParametr extends Parametr<Double>{
    public DoubleParametr(double start, double step, double stop, double def){
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
