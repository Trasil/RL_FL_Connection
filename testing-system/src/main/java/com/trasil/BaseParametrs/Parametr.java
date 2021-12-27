package com.trasil.BaseParametrs;

public abstract class Parametr<T> {
    T start;    // value from start
    T inc;      // incrementation parametr
    T stop;     // stop value
    T def;      // value by default
    T current;  // current value

    public Parametr(T start, T step, T stop, T def){
        this.start = start;
        this.inc = step;
        this.stop = stop;
        this.def = start;

        this.current = def;
    }

    public void reset(){
        current = def;
    }
    public void start(){
        current = start;
    }
    public T getCurrent(){
        return current;
    }


    abstract public boolean hasNext();
    abstract public void next();
}
