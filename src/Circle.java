
public class Circle {
	
	private double rayon;
	
	

	public Circle() {
		this.rayon = 1;
	}

	public Circle(double rayon) {
		this.rayon = rayon;
	}
	
	//A function is used to return the area of circle
	public double getArea(){
		
		//calcul la surface d'un cercle
		double surface = Math.PI * (rayon *rayon) ;
		//affiche la surface et le rayon d' un cercle
		System.out.println("le rayon du cercle est : " + rayon + " et son aire est : " + surface);
				
		return surface	;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle rayon1 = new Circle(2.0);
		Circle rayon2 = new Circle(12);
		Circle rayon3 = new Circle(24);
		rayon1.getArea();
		rayon2.getArea();
		rayon3.getArea();
	}

}
