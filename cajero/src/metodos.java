import java.util.Scanner;

public class metodos {

    Scanner inf = new Scanner(System.in);

    String clave;
    double saldo;

    public void cuenta() {
        System.out.println("Ingrese usuario:");
        String us = inf.nextLine();
        System.out.println("Ingrese la clave:");
        String cla = inf.nextLine();
        clave = cla;
        System.out.println("Ingrese el valor con el cual aperturara la cuenta:");
        double cin = inf.nextDouble();
        saldo = cin;
        System.out.println("Datos ingresados");
    }

    public void consignar() {
        System.out.println("Ingrese el monto a consignar");
        double valor = inf.nextDouble();
        System.out.println("Consignacion exitosa");
        saldo = saldo + valor;

    }

    public void retiro() {
        System.out.println("Ingrese el valor a retirar");
        double ret = inf.nextDouble();
        saldo = saldo - ret;
        System.out.println("Retiro realizado de manera exitosa");
    }

    public void consulta() {
        System.out.println("Su saldo es: " + saldo);

    }

    public void cambio() {

        System.out.println("Ingrese su nueva clave");
        String nc = inf.nextLine();
        clave = nc;
        System.out.println("Cambio de clave exitoso");

    }

    /**
     * @return double return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
