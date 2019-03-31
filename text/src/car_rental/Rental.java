package car_rental;

public class Rental {
//	private int BMX6=800;
//	private int BM5=600;
//	private int BKL=300;
//	private int BKG=600;
//	private int BIGCAR_16=800;
//	private int BIGCAR_34=1500;
	
	private int[] smallprice= {800,600,300,600};
	private String[] smallcar_Name= {"京NY28588","京CNY3284","京NT37465","京NT96968"};
	private String[][] bigcar_Name={{"京6566754","京8696997"},{"京9696996","京8696998"}};
	private int[]bigprice= {800,1500};

	
	public  void rent_Smallcar(int singal,int day,double count)
	{
		
		System.out.println("分配给您的汽车牌号是："+smallcar_Name[singal-1]);
		System.out.println("您的租金为："+count*day*smallprice[singal-1]);
	}
	
	public  void rent_Bigcar(int singal,int seat,int day,double count)
	{
		
		System.out.println("分配给您的汽车牌号是："+bigcar_Name[singal-1][seat-1]);
		System.out.println("您的租金为："+count*day*bigprice[seat-1]);
		
		
//		if(singal==1&&seat==1)
//		{
//			System.out.println("分配给您的汽车牌号是："+bigcar_Name[0]);
//		System.out.println("您的租金为："+count*day*BIGCAR_16);
//		}
//		else if(singal==1&&seat==2)
//		{
//			System.out.println("分配给您的汽车牌号是："+bigcar_Name[1]);
//		System.out.println("您的租金为："+count*day*BIGCAR_16);
//		}
//		else if(singal==2&&seat==1)
//		{
//				System.out.println("分配给您的汽车牌号是："+bigcar_Name[2]);
//		System.out.println("您的租金为："+count*day*BIGCAR_34);
//		}
//		else if(singal==2&&seat==2)
//		{
//			System.out.println("分配给您的汽车牌号是："+bigcar_Name[3]);
//		System.out.println("您的租金为："+count*day*BIGCAR_34);
//		}
	
	}


}
