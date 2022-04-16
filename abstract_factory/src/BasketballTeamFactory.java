public class BasketballTeamFactory implements SportTeamFactory {

    @Override
    public SportTeam createSportTeam() {
        return new BasketballTeam();
    }
    
}
