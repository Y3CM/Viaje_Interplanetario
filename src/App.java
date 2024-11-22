import java.util.Scanner;
import functions.SelectPlanet;
public class App {
    public static void main(String[] args) throws Exception {
        var scan = new Scanner(System.in);
        boolean salir = false;
        do{
            System.out.println("********** Bienvenido a un Viaje Interplanetario **********");
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

        }while(!salir);
        
    }
}