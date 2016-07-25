import java.util.Random;
public class GetRandom {
	public void getRandom(int max)
	{
		Random r=new Random();
		int val = r.nextInt(max);
		System.out.println("Random Value between 0 and "+max+" is "+val);
	}
}
