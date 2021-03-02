public class Square extends Figure{

	private double lado;

	public Square(double lado){
		this.lado = lado;
	}

	@Override
	public double getArea(){
		return lado * lado;
	}

	@Override
	public double takePerimetro(){
		return lado * 4;
	}


}