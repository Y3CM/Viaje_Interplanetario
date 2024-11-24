import java.util.Scanner;
import functions.*;
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
                    SelectNave.getAllNaves();
                    break;

                case 3:
                    if (SelectNave.nave == null) {
                        System.err.println("No se ha seleccionado una nave. Por favor, elige una nave antes de continuar.");
                        scan.nextLine();
                        if (SelectPlanet.planet == null) {
                        System.err.println("No se ha seleccionado un planeta destino. Por favor, elige un destino antes de continuar.");
                        }
                    }else{
                        var distance = SelectPlanet.distancePlanet;
                        var maxSpeed = SelectNave.maxSpeedNave;
                        var maxSpeedDay = maxSpeed * 24;
                        var time = distance / maxSpeedDay;
                        System.out.println("Destino: " + SelectPlanet.planet );
                        System.out.println("Nave Seleccionada: " + SelectNave.nave);
                        System.out.println("Distancia: " + distance + " Kilómetros");
                        System.out.println("Tiempo estimado de viaje: "+ time + " dias" );
                        scan.nextLine();
                    }
                    break;

                case 0:
                    salir = true;
                    System.out.print("Saliendo del programa...");
                    break;
                
            
                default:
                System.err.println("Opción invalida. Por favor elija una opción valida");
                    break;
            }
            
           SelectPlanet.pressEnter(scan);

        }while(!salir);

    }
    

}