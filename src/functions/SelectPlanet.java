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
        var planetSelected = planetas.get(opcion - 1);
        return planetSelected;
    }

    public static void getAllPlanets(){
        var scan = new Scanner(System.in);
        boolean salir = false;
      do {
        System.out.println("Elige tu planeta destino: ");
        System.out.println("1. Marte");
        System.out.println("2. Jupiter");
        System.out.println("3. Saturno");
        System.out.println("0. salir");

        var opcion = scan.nextInt();
        scan.nextLine();

        switch (opcion) {
            case 0:
                salir = true;
                System.out.println("Regresando al menu principal");
                break;
            case 1:
                System.out.println("el planeta seleccionado es " + getPlanet(opcion));
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
        
            default:
            System.err.println("Opcion invalida. Elija un planeta correcto");
                break;
        }
        pressEnter(scan);
      } while (!salir);
    }
    
    private static void pressEnter(Scanner scanner) {
        System.out.println("Presione ENTER para continuar...");
        scanner.nextLine();
    }
}; 
