package digital.innovation.core;

import digital.innovation.utils.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora =  new Calculadora();
        System.out.println(calculadora.sum(1,2));
    }
}
