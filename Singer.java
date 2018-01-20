

public class Singer {

	private String name;
	private int id;


	private static int counter;
	public static Singer[] singers = new Singer[10];

	public Singer(String name)
	{

		this.name = name;
		counter++;

		this.id = counter;
		singers[counter-1] = this;

	}

	public String getName()
	{
		return name;
	}

	public int getID()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setID(int id)
	{
		this.id = id;
	}

	public String toString()
	{
		int id = this.getID();
		String name = this.getName();

		String toPrint = "Singer [ID: " + id + "], [Name: " + name + "]";
		return toPrint;
	}
}
