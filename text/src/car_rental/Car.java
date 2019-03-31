package car_rental;

abstract public class Car {
	
	public String model;//型号
	public String singal;//品牌
	public String number;//车牌号\
	public String money;//租金
	abstract public double calRent(int days);//计算租金
	
	
	
	

}
