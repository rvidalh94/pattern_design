public class AreaCirculo implements Area{

    private final float radio;

    public AreaCirculo(float radio){
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return (float)(Math.PI * Math.pow(radio, 2));
    }

    @Override
    public String obtenerResultado() {
        return "El area del circulo es: " + calcularArea();
    }
    
}
