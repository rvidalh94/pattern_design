public class HockeyTeam implements SportTeam{

    @Override
    public void getSportName() {
        System.out.println("Hockey");
    }

    @Override
    public void getTeamName() {
        System.out.println("Toronto Maple Leafs");  
    }

    @Override
    public void getTeamValue() {
        System.out.println("5.000.000 USD");
    }

    @Override
    public void getTeamPlayerList() {
        System.out.println("Timothy Liljegren, Rasmus Sandin, Auston Matthews, Kyle Cliffod, Jake Muzzin");
    }
    
}
