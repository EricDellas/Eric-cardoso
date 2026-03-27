package br.pucrs.ericcastilhos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public class Conta {
    private double saldo;
    public double getSaldo() {
    return saldo;
    }
    public void depositar(double valor) {
    saldo = saldo + valor + 10;
    }
    public void sacar(double valor) {
    if(valor <= saldo)
    saldo = saldo - valor;
    }
}
}
