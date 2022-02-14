
public class Trapecio implements FiguraGeometrica {
	private float lado1;
	private float lado2;
	private float lado3;
	private float lado4;
	private float BaseMenor;
	private float BaseMayor;
	private float altura;
	private String nombre;
	
	public Trapecio(float lado1, float lado2, float lado3, float lado4, float baseMenor, float baseMayor, float altura,
			String nombre) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.BaseMenor = baseMenor;
		this.BaseMayor = baseMayor;
		this.altura = altura;
		this.nombre = nombre;
	}//Constructor
	
	public float getLado1() {
		return lado1;
	}//getLado1
	
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}//setLado1
	
	public float getLado2() {
		return lado2;
	}//getLado2
	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}//setBaseMayor
	public float getLado3() {
		return lado3;
	}//setBaseMayor
	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}//setBaseMayor
	public float getLado4() {
		return lado4;
	}//setBaseMayor
	public void setLado4(float lado4) {
		this.lado4 = lado4;
	}//setBaseMayor
	public float getBaseMenor() {
		return BaseMenor;
	}//setBaseMayor
	public void setBaseMenor(float baseMenor) {
		BaseMenor = baseMenor;
	}//setBaseMayor
	public float getBaseMayor() {
		return BaseMayor;
	}//setBaseMayor
	public void setBaseMayor(float baseMayor) {
		BaseMayor = baseMayor;
	}//setBaseMayor
	
	public float getAltura() {
		return altura;
	}//getAltura
	
	public void setAltura(float altura) {
		this.altura = altura;
	}//setAltura
	
	@Override
	public float area() {
		return (getAltura()*(getBaseMayor() + getBaseMenor())/2);
	}//area
	
	@Override
	public float perimetro() {
		return getLado1() + getLado2() + getLado3() + getLado4();
	}//perimetro
	
	@Override
	public String getNombre() {
		return nombre;
	}//getNombre
	
	
	

}
