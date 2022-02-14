
public class Romboide implements FiguraGeometrica {
	private float base;
	private float altura;
	private String nombre;
	
	public Romboide(float base, float altura, String nombre) {
		super();
		this.base = base;
		this.altura = altura;
		this.nombre = nombre;
	}//Constructor
	
	public float getBase() {
		return base;
	}//getBase
	public void setBase(float base) {
		this.base = base;
	}//setBase
	public float getAltura() {
		return altura;
	}//getAltura
	public void setAltura(float altura) {
		this.altura = altura;
	}//setAltura
	
	@Override
	public float area() {
		return (getBase() * getAltura());
	}//area
	
	@Override
	public float perimetro() {
		return ((getBase()*2)+(getAltura()*2));
	} //perimetro

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}//getNombre
	
	

}
