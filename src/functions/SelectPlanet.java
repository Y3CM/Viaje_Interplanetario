package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectPlanet {
    
    static List<String> planetas = new ArrayList<String>();

    static{
        planetas.add("Marte");
        planetas.add("Jupiter");
        planetas.add("Saturno");
    }
    public static String getPlanet(int opcion){
        var planet = planetas.get(opcion - 1);
        return planet;

    };
   static int[] distance = {225000000,778000000,1429000000};
    public static String planet = null;
    public static int distancePlanet = 0;
    public static void getAllPlanets(){
        var scan = new Scanner(System.in);
        boolean salir = false;
      do {
        System.out.println("Elige tu planeta destino: ");
        System.out.println("1. Marte");
        System.out.println("2. Jupiter");
        System.out.println("3. Saturno");
        System.out.println("0. volver al menu principal");

        var opcion = scan.nextInt();
        scan.nextLine();
        
        switch (opcion) {
            case 0:
            
            salir = true;
            System.out.println("Regresando al menu principal...");
            break;
            case 1:

                System.out.println("Has seleccionado el planeta " + getPlanet(opcion));
                System.out.println("Distancia desde la Tierra:\nPromedio: 225 millones de kilómetros.");
                System.out.println("Descripción:");
                System.out.println("Marte, conocido como el \"Planeta Rojo\" debido al óxido de hierro en su superficie, es el cuarto planeta desde el Sol. Es un mundo frío y desértico con una atmósfera delgada compuesta principalmente de dióxido de carbono.");
                planet = getPlanet(opcion); 
                distancePlanet = distance[ opcion - 1 ];
                break;
                case 2:

                System.out.println("Has seleccionado el planeta " + getPlanet(opcion));
                System.out.println("Distancia desde la Tierra:\nPromedio: 778 millones de kilómetros.");
                System.out.println("Descripción:");
                System.out.println("Júpiter es el gigante gaseoso más grande del sistema solar, con más del doble de masa que todos los demás planetas juntos.\nSu atmósfera está dominada por hidrógeno y helio, y presenta tormentas gigantes como la Gran Mancha Roja, \nuna tormenta que lleva más de 300 años activa.");
                planet = getPlanet(opcion);
                distancePlanet = distance[opcion - 1];

                        break;
            case 3:
                System.out.println("Has seleccionado el planeta " + getPlanet(opcion));
                System.out.println("Distancia desde la Tierra:\nPromedio: 1,429 millones de kilómetros.");
                System.out.println("Descripción:");
                System.out.println("Saturno es el segundo planeta más grande del sistema solar y es famoso por su sistema de anillos.\nCompuestos principalmente de partículas de hielo, rocas y polvo. \nSu atmósfera está compuesta principalmente de hidrógeno y helio, con vientos extremadamente rápidos.");
                planet = getPlanet(opcion);
                distancePlanet = distance[opcion - 1];

                break;
        
            default:
            System.err.println("Opcion invalida. Planeta no reconocido");
                break;
        }
        pressEnter(scan);
        
    } while (!salir);
    }
    
    public static void pressEnter(Scanner scanner) {
        System.out.println("Presione ENTER para continuar...");
        scanner.nextLine();
    } 
}; 
