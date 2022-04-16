public class RollerMotorAdapter implements Cortina{

    private RollerMotor rollerMotor;

    public RollerMotorAdapter(){
        super();
        this.rollerMotor = new RollerMotor();
    }

    @Override
    public void levantar() {
        this.rollerMotor.encenderMotor();
        this.rollerMotor.subirRoller();
        System.out.println("La cortina se esta levantando."); 
        this.rollerMotor.apagarMotor();
    }

    @Override
    public void bajar() {
        this.rollerMotor.encenderMotor();
        this.rollerMotor.bajarRoller();
        System.out.println("La cortina se esta bajando."); 
        this.rollerMotor.apagarMotor();
    }
    
}
