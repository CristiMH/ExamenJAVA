package edu.step.math;

public class Calculator {
    public double adunare(double arg1, double arg2){
        return arg1 + arg2;
    }
    public int adunare(int arg1, int arg2){
        return arg1 + arg2;
    }

    public double scadere(double arg1, double arg2){
        return arg1 - arg2;
    }
    public int scadere(int arg1, int arg2){
        return arg1 - arg2;
    }

    public double inmultire(double arg1, double arg2){
        return arg1 * arg2;
    }
    public int inmultire(int arg1, int arg2){
        return arg1 * arg2;
    }

    public double impartire(double arg1, double arg2){
        return arg1 / arg2;
    }
    public int impartire(int arg1, int arg2){
        return arg1 / arg2;
    }

    public void tablaInmultirii(int arg) {
        for (int i = 0; i <= 10; i++)
            System.out.println(i * arg);
    }

    public int suma(int arg) {
        int sum = 0;
        for (int i = 0; i <= arg; i++)
            sum += i;
        return sum;
    }
}