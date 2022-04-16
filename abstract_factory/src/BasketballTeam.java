public class BasketballTeam implements SportTeam{

    @Override
    public void getSportName() {
        System.out.println("Footbal");
    }

    @Override
    public void getTeamName() {
        System.out.println("Los Angeles Lakers");
    }

    @Override
    public void getTeamValue() {
        System.out.println("14.000.000 USD");
    }

    @Override
    public void getTeamPlayerList() {
        System.out.println("LeBron James, Russell Westbrook, Anthony Davis, Talen Horton-Tucker");
    }
    
}
