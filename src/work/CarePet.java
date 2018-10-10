package work;
interface Care{
	public void feedPet();
	public void playWith();
}
class worker implements Care{
	public void feedPet(){
		System.out.println("rice is pretty good");
	}
	public void playWith(){
		System.out.println("you should get a shower");
	}
}
class peasant implements Care{
	public void feedPet(){
		System.out.println("bread is pretty good");
	}
	public void playWith(){
		System.out.println("I like you so much");
	}
}
class offical implements Care{
	public void feedPet(){
		System.out.println("cake is pretty delicious");
	}
	public void playWith(){
		System.out.println("when you will play with me next time");
	}
}
public class CarePet {

	public static void main(String[] args) {
		Care c = new worker();
		c.feedPet();
		peasant p = new peasant();
		p.feedPet();
		p.playWith();
		offical o = new offical();
		o.feedPet();
		o.playWith();
	}
	

}
