package dvd;

public class Tool {
	public static Dvd lastdvdindex(Dvd dvd){
		
		while(dvd.getIndex()!=null) {
			
			dvd=dvd.getIndex();
		}
			
		return dvd;
	}
	
	
	

}
