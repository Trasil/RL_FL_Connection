package com.trasil;

import com.trasil.BaseParametrs.Parametr;

import java.util.ArrayList;

public class Parametrs {
    int i=0;
    ArrayList<Parametr> parametrs;

    public void print(){
        for (int i=0;i<parametrs.size(); i++)
            System.out.print(parametrs.get(i).getCurrent() + " ");
        System.out.println();
    }

    public Parametrs(){
        parametrs = new ArrayList<>();
    }

    public Parametrs add(Parametr parametr){
        parametrs.add(parametr);
        return  this;
    }

    public ArrayList get(){
        return parametrs;
    }

    public boolean step2() {return _step2();}
    private boolean _step2(){
        if (i == parametrs.size())
            return false;

        Parametr current = parametrs.get(i);
        if( current.hasNext() ){
            current.next();
        }
        else {
            current.reset();
            i++;

            if (i != parametrs.size())
                parametrs.get(i).start();

            return _step2();
        }

        return true;
    }


    public boolean step1() {return _step1(0);}
    private boolean _step1(int i) {
        if (i == parametrs.size())
            return false;

        Parametr current = parametrs.get(i);
        if (current.hasNext()){
            current.next();
        }
        else{
            current.reset();
            return  _step1(i+1);
        }

        return true;
    }
}
