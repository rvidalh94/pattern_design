public class AreaTriangulo implements Area{

    private final float base;
    private final float altura;

    public AreaTriangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String obtenerResultado() {
        return "El area del triangulo es: " + calcularArea();
    }
    
}
