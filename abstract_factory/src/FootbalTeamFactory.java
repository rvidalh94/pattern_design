public class FootbalTeamFactory implements SportTeamFactory{

    @Override
    public SportTeam createSportTeam() {
        return new FootbalTeam();
    }
    
}
