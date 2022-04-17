public class Girar implements Operacion{

    private Cuenta cuenta;
    private double monto;

    public Girar(Cuenta cuenta, double monto){
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void execute() {
        this.cuenta.girar(this.monto);
    }
    
}
