package day7;

public class Student {
	Student(String name,float score)
	{
		this.name=name;
		this.score=score;
	}
	private String name;
	private float score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public void allbig60()
	{
		this.score+=2;
	}
	

}
