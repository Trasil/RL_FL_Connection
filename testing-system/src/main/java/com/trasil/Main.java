package com.trasil;

import com.trasil.BaseParametrs.BooleanParametr;
import com.trasil.BaseParametrs.DoubleParametr;
import com.trasil.BaseParametrs.IntParametr;

public class Main {
    public static void main(String[] args) {
        Parametrs parametres = new Parametrs()
                .add(new IntParametr(0, 1, 5, 0))
                .add(new BooleanParametr(false))
                .add(new DoubleParametr(0., 0.1, 1., 0.));

		System.out.println("Var. 1");
        do{
            parametres.print();
        }while (parametres.step1());
		
		parametres.reset();
		
		System.out.println("Var. 2");
        do{
            parametres.print();
        }while (parametres.step1());
    }
}
