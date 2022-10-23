package Actividad_4_POO.src;

import java.util.Scanner;

/**
 * Esta clase prueba diferentes acciones realizadas por cuentas bancarias
 * de tipo Cuenta de ahorros y Cuenta corriente
 */
public class PruebaCuenta {
    /**
     * Método main que crea una cuenta de ahorros con un saldo inicial
     * y una tasa de interés solicitados por teclado, a la cual se realiza una
     * consignación y un retiro, y luego se le genera el extracto mensual
     */
    public static void main(String[] args) {
        Cuenta c=new Cuenta();
        float saldo,tasa;
        String tipoc;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tipo de cuenta");
        System.out.println("1- Cuenta de ahorros");
        System.out.println("2- Cuenta corriente");
        tipoc=input.next();
        if (c.verificarCuentaAhorros(tipoc)==true){
            System.out.println("Ingrese saldo inicial = $");
            saldo=input.nextFloat();
            System.out.print("Ingrese tasa de interés = ");
            tasa=input.nextFloat();
            CuentaAhorros ch=new CuentaAhorros(saldo,tasa);
            System.out.println("Saldo "+ch.getSaldo());
            System.out.println("Tasa "+ch.calcularTasa());
            
            System.out.print("Ingresar cantidad a consignar:$");
            float cantidadDepositar = input.nextFloat();
            ch.consignar(cantidadDepositar);
            System.out.print("Ingresar cantidad a retirar:$");
            float cantidadRetirar = input.nextFloat();
            ch.retirar(cantidadRetirar);
            ch.extractoMensual();
            ch.imprimir();
        }
        else if(c.verificarCuentaCorriente(tipoc)){
            System.out.println("Cuenta Corriente");
            float sobregiro=0;
            float tasa1=0;
            CuentaCorriente cc=new CuentaCorriente(sobregiro,tasa1);
            System.out.println("Saldo "+cc.getSaldo());
            System.out.println("Tasa "+cc.calcularTasa());
            
            System.out.print("Ingresar cantidad a consignar:$");
            float cantidadDepositar = input.nextFloat();
            cc.consignar(cantidadDepositar);
            System.out.print("Ingresar cantidad a retirar:$");
            float cantidadRetirar = input.nextFloat();
            cc.retirar(cantidadRetirar);
            cc.extractoMensual();
            cc.imprimir();
        }      
    }
}