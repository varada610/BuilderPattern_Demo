package builderPatternPackage;

import java.util.Scanner;

import stylePackage.Style;

/**This is the class that isolates taking orders from implementation of cost and display of order. 
 * PartySetting contains TableSetting array to store client order detail.
 * 
 * Builder Pattern : Client*/
public class PartySetting {
	/**Total number of tables*/
	private int numberOfTables;
	/**Array of table settings*/
	private TableSetting tableSetting[] = null;
	/**Total cost for a party setting*/
	private int cost;
	/**Table builder can be of any party style.TableComponentBuilder is an interface*/
	private TableComponentBuilder tableBuilder;
	/**The Director of the Builder design pattern used*/
	private PartyDirector partyDirector;
	/**Customer order details*/
	private int orderDetails[] = null;

	public PartySetting() 
	{
		this.numberOfTables = 0;
		this.cost = 0;
		 Style.displayStyles();
	}
	/**
	 * Client can place an order for a party setting. Inputs are taken from the console.
	 */
	public void placeOrder() {
		
		  this.getEstimate();
		  this.displayPartySetting();
		  
		  if(this.numberOfTables>1) System.out.print(" tables\n"); 
		  else
		  System.out.print(" table\n");
	}

	/**
	 * Client can get an estimate of party cost based on his requirements. Based
	 * on this estimate he can decide if he wishes to place an order using placeOrder()
	 */
	public void getEstimate() {

		Scanner input = new Scanner(System.in);
		
		if (this.orderDetails == null) {
			this.displayPartySetting();

			this.orderDetails = new int[3];

			for (int count = 0; count < 3; count++) 
			{
				System.out.println("How many tables of style " + (count + 1)
						+ " would you like?");
				this.orderDetails[count] = input.nextInt();
				this.numberOfTables = this.numberOfTables + this.orderDetails[count];
			}
		this.buildTableSetting();
		}
		this.calculateCost();
		System.out.println("The cost for your order is $" + this.cost);
	}

	/**
	 * Calculates the cost iteratively by invoking the table setting cost calculator
	 */
	public void calculateCost() 
	{
		this.cost =0;
		for(int index=0; index < this.numberOfTables; index++)
			this.cost = this.cost + this.tableSetting[index].calculateCost();
		 		
	}

	/**PartySetting class is the client for Builder pattern used. 
	 * PartySetting creates table builder it requires and passes it along to PartyDirector.*/
	private void buildTableSetting() 
	{
		int tableIndex = 0;
		this.tableSetting = new TableSetting[this.numberOfTables];
		
		for (int styleCount = 0; styleCount < 3; styleCount++) 
		{
			if(this.orderDetails[styleCount]>0)
			{
				for(int index = 0; index < orderDetails[styleCount]; index++) 
				{
				this.getTableBuilder(styleCount);
				this.partyDirector = new PartyDirector(this.tableBuilder);
				this.partyDirector.constructTableSetting();
				this.tableSetting[tableIndex] = this.partyDirector.getTableSetting();
				tableIndex++;
				}
			}
			
		}
	}

	/**Retrieves the table builder as against the style requested
	 * @param styleNumber The style builder requested. The number represents Vintage, Modern etc.*/
	private void getTableBuilder(int styleNumber)
	{
		if(styleNumber == 0)  this.tableBuilder = new VintageTableSettingBuilder();	
		if(styleNumber == 1)  this.tableBuilder = new ContemporaryTableSettingBuilder();	
		if(styleNumber == 2)  this.tableBuilder = new ModernTableSettingBuilder();	
	}
	/**
	 * Invokes the display function for table setting and in turn the placesetting
	 */
	public void displayPartySetting() 
	{
		  if(this.numberOfTables > 0) 
		  {System.out.print("Your order contains : "+this.numberOfTables + " ");}
		  else
		  {TableSetting.displayPartySetting();}
		 
	}
	
	/** Setter method to modify the table object count values of a table in a Party to user defined values. 
	 * VALID VALUES FOR 'String tableObject' are 'chair' , 'centerpiece' or 'PlaceSetting'.
	 * If this method is not invoked by client then default table object count values are set.
	 * Method delegation to TableSetting.
	 * @param objectCount count of a table objects 'say chair or centerpiece' per table as client per client request
	 * @param tableObject 'chair' or 'centerpiece' etc .Any subclass of TableObject*/
	public void setTableObjectCount(int objectCount, String tableObject)
	{
		for(int index=0; index < this.numberOfTables ; index++)
			this.tableSetting[index].setTableObjectCount(objectCount, tableObject);
	}

}
