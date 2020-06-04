
import java.util.Scanner;

public class MainTarjeta {

    public static void main(String[] args) {

        Tarjeta tarjeta = new Tarjeta();

        Scanner leer = new Scanner(System.in);

        int cuenta, nip, opcion;

        System.out.print("Numero de cuenta: ");
        cuenta = leer.nextInt();
        System.out.print("NIP: ");
        nip = leer.nextInt();

        tarjeta = tarjeta.verificarUsuario(cuenta, nip);

        if (tarjeta.nombre != null) {
            do {
                System.out.println("\nBienvenido " + tarjeta.nombre);

                System.out.println("\n\tMenu");
                System.out.println("1.- Hacer un deposito");
                System.out.println("2.- Hacer un retiro");
                System.out.println("3.- Eliminar apartado");
                System.out.println("4.- Imprimir datos de la cuenta");
                System.out.println("5.- Salir");
                System.out.print("Opcion: ");
                opcion = leer.nextInt();

                switch (opcion) {

                    case 1:
                        double depositar;
                        System.out.println("\nIngrese la cantidad que quiere depositar: ");
                        depositar = leer.nextDouble();
                        tarjeta.depositar(depositar);
                        break;
                    case 2:
                        double retirar;
                        System.out.println("\nIngrese la cantidad que quiere retirar: ");
                        retirar = leer.nextDouble();
                        tarjeta.retirar(retirar);
                        break;
                    case 3:
                        System.out.println("\nApartado Eliminado");
                        tarjeta.eliminarApartado();
                        break;
                    case 4:
                        System.out.println(tarjeta.toString());
                        break;
                }
            } while (opcion != 5);
        } else {
            System.out.println("El cliente no existe");
        }
    }
}
