package functions;
import java.util.Scanner;
public class SelectNave { 
        public static String nave = null;
        public static int maxSpeedNave = 0;
        public static int crewNave = 0;
        public static void getAllNaves(){
            var scan = new Scanner(System.in);
            boolean salir = false;
            String[] naves = {
                "Viajero Estelar",
                "Coloso Celestial",
                "Eclipse Eterno",
                "Nova Titan",
                "Serpiente Cósmica"
            }; 
            int[] maxSpeed = {
                25000,
                70000,
                120000,
                150000,
                200000
            };

            int[] crew = {15,300,20,100,50};

            String[] description ={
                "Una nave pequeña diseñada para viajes cortos dentro del sistema solar.\nIdeal para exploradores solitarios o pequeñas tripulaciones científicas.",
                "Nave de gran tamaño diseñada para transportar grandes grupos de colonos \ny equipos hacia planetas habitables.",
                "Nave rápida y altamente maniobrable. \nIdeal para misiones de reconocimiento en terrenos hostiles y peligrosos.",
                "La joya de la exploración espacial. \nDiseñada para largas expediciones con grandes tripulaciones. \nIncluye laboratorios y zonas de recreación.",
                "Nave ágil y silenciosa, \nutilizada principalmente para misiones de exploración encubiertas y de bajo perfil."
            }; 

            do {
                System.out.println("Elige la nave que deseas para viajar:");

                for (int i = 0; i < naves.length; i++) {
                    System.out.println((i + 1)+". " + naves[i]);
                }
                System.out.println("0. volver al menu principal");
                
                int opcion = scan.nextInt();
                scan.nextLine();

                switch (opcion) {
                    case 0:
                    salir = true;
                    System.out.println("Regresando al menu principal...");
                    break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Has seleccionado la nave: " + naves[opcion - 1]);
                        System.out.println("Nombre -> " + naves[opcion - 1]);
                        System.out.println("Velocidad máxima: "+ maxSpeed[opcion - 1] +"km/h");
                        System.out.println("Capacidad de pasajeros: " + crew[opcion - 1]);
                        System.out.println("Descripción: ");
                        System.out.println(description[opcion - 1]);
                        nave = naves[opcion - 1];
                        maxSpeedNave = maxSpeed[opcion - 1];
                        crewNave = crew[opcion - 1];
                        
                        break;
                
                    default:
                    System.err.println("Error información no encontrada");
                        break;
                }
                SelectPlanet.pressEnter(scan);
            } while (!salir);


        }
   
        
}
