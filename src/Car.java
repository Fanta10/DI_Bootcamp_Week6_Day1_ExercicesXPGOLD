public class Car {
	
	private String make;
	private String model;
	private int year;
	private String color;
	private double price;
	
	
	//constructeur par defaut
	public Car() {
	
	}
	//constructeur avec trois parametres
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public Car(String make, String model, int year, String color, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}
	
	public void displayCarInfoMake(){
		System.out.println("Marke : " + this.make + " , Model : " + this.model + 
				" , Year : " + this.year + " , Color : " + this.color  + " , Price : " + 
				this.price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car("toyota" , "4x4", 5);
		Car car3 = new Car("toyota" , "4x4", 5, "noir", 800000.57);
		
		car1.displayCarInfoMake();
		car2.displayCarInfoMake();
		car3.displayCarInfoMake();

	}

}
