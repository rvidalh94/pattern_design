public class CuerpoGeometricoContext {
    
    private Area figura;
    private final float radio;
    private final int lados;
    private final float base;
    private final float altura;

    // Constructor para circulo
    public CuerpoGeometricoContext(float radio) {
        this.radio = radio;
        this.lados = (int) Float.POSITIVE_INFINITY;
        this.base = 0;
        this.altura = 0;
    }

    // Constructor para triangulo, rectangulo o cuadrado.
    public CuerpoGeometricoContext(float base, float altura, int lados) {
        this.radio = 0;
        this.lados = lados;
        this.base = base;
        this.altura = altura;
    }

    private boolean esCirculo(){
        return lados==(int)Float.POSITIVE_INFINITY && radio>0; 
    }

    private boolean esTriangulo(){
        return base>0 && altura>0 && lados==3;
    }

    private boolean esRectangulo(){
        return base>0 && altura>0 && lados==4;
    }

    // Establecer la estragegia a aplicar segun parametros
    public void establecerFigura(){
        if(esCirculo()){
            figura = new AreaCirculo(radio);
        }else if(esTriangulo()){
            figura = new AreaTriangulo(base, altura);
        }else if(esRectangulo()){
            figura = new AreaRectangulo(base, altura);
        }
    }

    public String obtenerResultadoAreaCuerpo(){
        return figura.obtenerResultado();
    }
}
