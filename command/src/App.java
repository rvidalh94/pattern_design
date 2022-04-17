public class App {
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta(1, 200000);

        Depositar operacionDepositar = new Depositar(cuenta, 50000);
        Girar operacionGirar = new Girar(cuenta, 150000);

        Invoker invoker = new Invoker();
        invoker.recibirOperacion(operacionDepositar);
        invoker.recibirOperacion(operacionGirar);
        invoker.ejecutarOperaciones();
        
        System.out.println(cuenta.obtenerSaldo());
    }
}
