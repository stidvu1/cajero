import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ca = new Scanner(System.in);

        int opc;

        metodos m = new metodos();

        System.out.println(
                "Bienvenido a su cajero: \n1.Creacion de cuenta\n2.Consignaciones\n3.Retiros\n4.Consulta de saldo\n5Cambio de clave\n6.Terminar");

        opc = ca.nextInt();

        switch (opc) {
            case 1: {
                m.cuenta();
                break;
            }
            case 2: {
                m.consignar();
                break;
            }
            case 3: {
                m.retiro();
                break;
            }
            case 4: {
                m.consulta();
                break;
            }
            case 5: {
                m.cambio();
                break;
            }
            case 6: {
                System.exit(0);
            }

            default: {
                System.out.println("Opcion no valida");
            }

        }
        ca.close();
    }

}
