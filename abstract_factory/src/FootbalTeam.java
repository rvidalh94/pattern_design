public class FootbalTeam implements SportTeam {


    @Override
    public void getSportName() {
        System.out.println("Footbal");
    }

    @Override
    public void getTeamName() {
        System.out.println("All Stars");
    }

    @Override
    public void getTeamValue() {
        System.out.println("1.000.000 USD");
    }

    @Override
    public void getTeamPlayerList() {
        System.out.println("Cristiano Ronaldo, Karim Benzema, Alexis Sánchez, Arturo Vidal");
    }
    
}
