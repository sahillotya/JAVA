package animalshop
public class Dog
{
	private String name;
	private String breed;
	private String barkNoise="woof"
	private double weight;
	Dog(String name,String breed,double weight)
	{
		this.name=name;
		this.breed=breed;
		this.weight=weight;
	}
	Dog(String name,String breed,String noise,double weight)
	{
		this(name,breed,weight);
		/*this.name=name;
		this.breed=breed;
		this.weight=weight; */
		barkNoise=noise;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBreed(String breed)
	{
		this.breed=breed;
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	public String getName()
	{
		return this.name;
	}
	public String getBreed()
	{
		return this.breed;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public void bark()
	{
		System.out.println("THE BARKNOISE IS: "+barkNoise);
	}
	public void bark(String noise)
	{
		this.barkNoise=noise;
		System.out.println("THE BARKNOISE IS: "+barkNoise);
	}
}
class AnimalTester
{
	public static void main(String args[])
	{
		Dog d1=new Dog("Ace","beagle",45);
		Dog d2=new Dog("Bailey","boerboel","ruff-ruff",85.2);
		System.out.println("Dog name: "+d1.getName());
		System.out.println("Dog Breed: "+d1.getBreed());
		d1.bark();
		System.out.println("Dog Weight: "+d1.getWeight());
		System.out.println("\n\n*********************************************************");
		System.out.println("Dog name: "+d2.getName());
		System.out.println("Dog Breed: "+d2.getBreed());
		d2.bark("arf-arf");
		System.out.println("Dog Weight: "+d2.getWeight());
	}
}