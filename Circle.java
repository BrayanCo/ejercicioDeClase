public class Circle extends Figure{
	

	public static final double PI = 3.14159;

	private double radio;

	public Circle(double radio){
		this.radio = radio;
	}

	@Override
	public double getArea(){
		return PI * (radio * radio);
	}

	@Override 
	public double takePerimetro(){
		return 2*PI;
	}
}

