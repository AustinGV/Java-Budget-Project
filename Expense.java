public class Expense
{
	private Category category;
	private double amount;

	public Expense(Category category, double amount)
	{
		this.category = category;
		this.amount = amount;
	}

	public Category getCategory()
	{
		return category;
	}

	public double getAmount()
	{
		return amount;
	}

	public String toString()
	{
		String s = amount + " " + category.getName();
		return s;
	}

	public static void main(String[] args)
	{
		Category cat = new Category("Rent", 1000);
		Expense expense = new Expense(cat,5);
		System.out.println(expense);
	}
}