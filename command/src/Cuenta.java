// Reciver
public class Cuenta{

    private int id;
    private double saldo;

    public Cuenta(int id, double saldo){
        this.id = id;
        this.saldo = saldo;
    }

    public void girar(double monto){
        this.saldo = this.saldo - monto;
        System.out.println("[GIRAR] Cuenta: " + this.id + " Saldo: " + this.saldo);
    }

    public void depositar(double monto){
        this.saldo = this.saldo + monto;
        System.out.println("[DEPOSITAR] Cuenta: " + this.id + " Saldo: " + this.saldo);
    }

    public String obtenerSaldo(){
        return "El saldo actual de la cuenta id: " + this.id + " es de $" + this.saldo;
    }
}