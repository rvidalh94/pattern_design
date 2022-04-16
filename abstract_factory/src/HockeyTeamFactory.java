public class HockeyTeamFactory implements SportTeamFactory{

    @Override
    public SportTeam createSportTeam() {
        return new HockeyTeam();
    }
    
}
