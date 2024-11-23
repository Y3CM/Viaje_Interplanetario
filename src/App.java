import java.util.Scanner;
import functions.SelectPlanet;
public class App {
    public static void main(String[] args) throws Exception {
        var scan = new Scanner(System.in);
        boolean salir = false;
        do{
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("********** Bienvenido a un Viaje Interplanetario **********");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
            System.out.println("Prepárate para embarcarte en un viaje que desafiará tu ingenio, te maravillará con paisajes alienígenas y");
            System.out.println("te hará reflexionar sobre nuestro lugar en el cosmos.\n¿Estás listo para ser un pionero del espacio? ¡La cuenta regresiva comienza ahora!\n");
            System.out.println("Por favor elige una opción para continuar: ");
            System.out.println("1. Seleccionar planeta destino");
            System.out.println("2. Seleccionar nave espacial");
            System.out.println("3. Iniciar simulación del viaje");
            System.out.println("0. salir del programa");
            
            int opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    SelectPlanet.getAllPlanets();
                    break;

                case 2:
                    
                    break;

                case 3:
                    
                    break;

                case 0:
                    salir = true;
                    System.out.print("Saliendo del programa...");
                    break;
                
            
                default:
                System.err.println("Opción invalida. Por favor elija una opción valida");
                    break;
            }
            
            pressEnter(scan);

        }while(!salir);

    }
    
    private static void pressEnter(Scanner scan) {
        System.out.println("Presione ENTER para continuar...");
        scan.nextLine();
    }
}