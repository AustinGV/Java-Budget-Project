public class Category
{
	private String name = "Misc";
	private double amount = 0.0;

	public Category(String name, double amount)
	{
		this.name = name;
		this.amount = amount;
	}

	public Category()
	{

	}

	public String getName()
	{
		return name;
	}

	public double getAmount()
	{
		return amount;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAmount(double amount)
	{
		this.amount = amount;
	}

	public String toString()
	{
		String s = name + " " + amount;
		return s;
	}

	public static void main(String[] args)
	{
		Category cat = new Category("Rent", 1000);
		System.out.println(cat);
		Category cate = new Category();
		cate.setName("Food");
		cate.setAmount(100);
		System.out.println(cate);
	}
}