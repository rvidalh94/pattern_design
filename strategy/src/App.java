public class App {
    private static CuerpoGeometricoContext figura;
    public static void main(String[] args){

        // Estableciendo tipo para circulo
        figura = new CuerpoGeometricoContext(3);
        figura.establecerFigura();
        System.out.println(figura.obtenerResultadoAreaCuerpo());

        // Estableciendo tipo para triangulo
        figura = new CuerpoGeometricoContext(8, 10, 3);
        figura.establecerFigura();
        System.out.println(figura.obtenerResultadoAreaCuerpo());

        // Estableciendo tipo para cuadrado
        figura = new CuerpoGeometricoContext(9, 9, 4);
        figura.establecerFigura();
        System.out.println(figura.obtenerResultadoAreaCuerpo());

        // Estableciendo tipo para rectangulo
        figura = new CuerpoGeometricoContext(16, 8, 4);
        figura.establecerFigura();
        System.out.println(figura.obtenerResultadoAreaCuerpo());
    }
}
