import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int option;
        do {
            option = showSportsMenu();
            switch(option){
                case 1:
                    useSportTeams(new FootbalTeamFactory());
                    break;
                case 2:
                    useSportTeams(new BasketballTeamFactory());
                    break;
                case 3:
                    useSportTeams(new HockeyTeamFactory());
            }
            System.out.print("\n");
        }while(option!=4);
    }

    public static void useSportTeams(SportTeamFactory factory){
        SportTeam team = factory.createSportTeam();
        System.out.print("The info about selected sport team: \n");
        team.getSportName();
        team.getTeamName();
        team.getTeamValue();
        team.getTeamPlayerList();
    }

    public static int showSportsMenu(){
        System.out.print(
            "Sports Menu\n"
            + "1. Show a Football team.\n"
            + "2. Show a Basketball team.\n"
            + "3. Show a Hockey team.\n"
            + "4. Salir.\n"
            + "Select an option: "
        );
        return Integer.parseInt(sc.nextLine());
    }
}
