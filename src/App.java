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
                System.out.println("Ingresa el numero de tripulantes para despegar");
                int tripulantes = scan.nextInt();
                scan.nextLine();
                if (chechNegative(tripulantes)) {
                    if (tripulantes <= SelectNave.crewNave) {

                        simulacionViaje(scan);
                    } else {
                        System.out.println("el numero de tripulantes supera la capacidad de la nave,");
                        System.out.println("capacidad maxima de la nave " + SelectNave.crewNave + " tripulantes");
                    }
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

    }public static boolean chechNegative(int tripulantes) {
        if (tripulantes > 0) {
            return true;
        }
        System.out.println("valor no permitido, recuerda insertar un valor mayor que cero");
                return false;
    }



    private static void simulacionViaje(Scanner scan) throws InterruptedException {
        if (readyViaje(scan)) {
            System.out.println("El viaje comenzara en breve...");
            System.out.println("Iniciando el viaje progreso: ");
            for (int i = 0; i <= 100; i++) {
                System.out.print(i + "% ...");
                Thread.sleep(1000);
                System.out.print("\r");
                if (i == 50) {
                    System.out.println("Estamos a mitad de camino ");
                }
                if (i == 100) {
                    System.out.println("El viaje ha finalizado. Gracias por participar!");
                }

            }
        }
    }

    private static boolean readyViaje(Scanner scan) {
        if (SelectNave.nave == null) {
            System.err.println("No se ha seleccionado una nave. Por favor, elige una nave antes de continuar.");
            scan.nextLine();
            if (SelectPlanet.planet == null) {
            System.err.println("No se ha seleccionado un planeta destino. Por favor, elige un destino antes de continuar.");
            }
            return false;
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
            return true;
        }
    }

}