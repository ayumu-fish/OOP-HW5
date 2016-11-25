package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1,Pokemon p2)
	{
		int rad=(int)(Math.random()*2);
		
		if(rad==0)
		{
			System.out.println("Winner is ["+p1.getname()+"].");
			p1.setcp(p1.getcp()+500);
		}
		else
		{
			System.out.println("Winner is ["+p2.getname()+"].");
			p2.setcp(p2.getcp()+500);
		}
	}

}
