package car_rental;

public class SmallCar extends Car{

	@Override
	public double calRent(int days) {
		if(days<=7)
			return 1;
		else if(days<30)
			return 0.9;
		else if(days<150)
			return 0.8;
		else return 0.7;
		// TODO Auto-generated method stub
	
	}
	
	

}
