import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);
    private static Cortina cortina;

    public static void main(String[] args){
        int option;
        do {
            option = showCortinasMenu();
            switch(option){
                case 1:
                    cortina = new Persiana();
                    subirCortina();
                    bajrCortina();
                    break;
                case 2:
                    cortina = new Roller();
                    subirCortina();
                    bajrCortina();
                    break;
                case 3:
                    cortina = new RollerMotorAdapter();
                    subirCortina();
                    bajrCortina();
                    break;
            }
            System.out.print("\n");
        }while(option!=4);
    }

    public static int showCortinasMenu(){
        System.out.print(
            "Cortinas interactuar\n"
            + "1. Mover persiana.\n"
            + "2. Mover roller.\n"
            + "3. Mover roller a motor.\n"
            + "4. Salir.\n"
            + "Seleccione una opcion: "
        );
        return Integer.parseInt(sc.nextLine());
    }

    private static void subirCortina(){
        cortina.levantar();
    }

    private static void bajrCortina(){
        cortina.bajar();
    }
}
