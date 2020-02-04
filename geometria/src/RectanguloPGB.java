/**
 * 
 * @author Pedro Guzman
 * @version 1.2
 *
 */
public class Rectangulo extends FiguraGeometrica {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase
	 * @param tipoFigura Descripcion de la figura
	 * @param lG valor numerico del tamaño del lado grande
	 * @param lP valor numerico del tamaño del lado pequeño
	 */
	public Rectangulo(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Clase que calcula el area del rectangulo.
	 *@return devuelve el area del rectangulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * calcula el perimetro.
	 * @return devuelve el perimetro.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
