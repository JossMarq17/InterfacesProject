
public class Rombo implements FiguraGeometrica {
	private float lado;
	private float DiagMenor;
	private float DiagMayor;
	private String nombre;
	
	public Rombo(float lado, float diagMenor, float diagMayor, String nombre) {
		super();
		this.lado = lado;
		this.DiagMenor = diagMenor;
		this.DiagMayor = diagMayor;
		this.nombre = nombre;
	}//constructor

	public float getLado() {
		return lado;
	}//getLado

	public void setLado(float lado) {
		this.lado = lado;
	}//setLado

	public float getDiagMenor() {
		return DiagMenor;
	}//getDiagMenor

	public void setDiagMenor(float diagMenor) {
		DiagMenor = diagMenor;
	}//setDiagMenor

	public float getDiagMayor() {
		return DiagMayor;
	}//getDiagMayor

	public void setDiagMayor(float diagMayor) {
		DiagMayor = diagMayor;
	}//setDiagMayor

	@Override
	public float area() {
		return (getDiagMayor() * getDiagMenor()) /2;
	}//area
	
	@Override
	public float perimetro() {
		return (getLado()*4);
	} //perimetro
	
	@Override
	public String toString() {
		return "Rombo [lado=" + lado + ", DiagMenor=" + DiagMenor + ", DiagMayor=" + DiagMayor + ", nombre=" + nombre
				+ "]";
	}//toString

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}//getNombre
	
}//class Rombo
