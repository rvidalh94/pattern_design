public class AreaRectangulo implements Area{

    private String nombre;
    private final float base;
    private final float altura;

    public AreaRectangulo(float base, float altura){
        if (base == altura){
            this.nombre = "Cuadrado";
        }else{
            this.nombre = "Rectangulo";
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return (base * altura);
    }

    @Override
    public String obtenerResultado() {
        return "El area del " + this.nombre + " es: " + calcularArea();
    }
    
}
