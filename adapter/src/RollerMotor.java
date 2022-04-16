public class RollerMotor {
    private boolean motorEncendido = false;

    public RollerMotor(){
        this.motorEncendido = false;
    }

    public void encenderMotor(){
        System.out.println("Encendiendo motor");
        this.motorEncendido = true;
    }

    public void apagarMotor(){
        System.out.println("Apagando motor");
        this.motorEncendido = false;
    }

    public void subirRoller(){
        if(!this.motorEncendido){
            System.out.println("No se puede subir la cortina, el motor está apagado.");
        }else{
            System.out.println("Motor encendido, disponible para subir.");
        }
    }

    public void bajarRoller(){
        if(!this.motorEncendido){
            System.out.println("No se puede bajar la cortina, el motor está apagado.");
        }else{
            System.out.println("Motor encendido, disponible para bajar.");
        }
    }
}
