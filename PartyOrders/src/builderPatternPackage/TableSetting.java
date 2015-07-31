package builderPatternPackage;
import stylePackage.Style;

/**Contains components like chair, centerpiece etc. Delegates the cost calculation to table components.
 * Modifies the count per table of table objects.Contains Style as a data member 
 * @author Varada*/
public class TableSetting 
{
	private Style style=null;
	
	private PlaceSetting placeSetting=null;
	private Chair chair=null;	
	private Centerpiece centerpiece=null;
	
	private int cost;
	
	public TableSetting()
	{
		this.cost=0;
	}
	
	/**Sets the style type of the TableSetting using passed parameter.
	 * @param style Style of the table*/
	public void setStyle(Style style)
	{
		this.style = style;
	}
	
	/**Sets the chair type of the TableSetting using passed parameter.
	 * @param chair Chair type of the table*/
	public void setChair(Chair chair)
	{
		this.chair = chair;
	}
	
	/**Sets the centerpiece type of the TableSetting using passed parameter.
	 * @param centerpiece Centerpiece type of the table*/
	public void setCenterpiece(Centerpiece centerpiece)
	{
		this.centerpiece = centerpiece;
	}
	
	/**Sets the place setting type of the TableSetting using passed parameter.
	 * @param placeSetting PlaceSetting type of the table*/
	public void setPlaceSetting(PlaceSetting placeSetting)
	{
		this.placeSetting = placeSetting;
	}
	
	/**Calculates the total cost of the table setting*/
	public int calculateCost()
	{
		cost = this.centerpiece.calculateCost() + this.chair.calculateCost() + this.placeSetting.calculateCost();
		return cost;
	}

	/**Modifies the object count per table of the table objects. If not invoked default values used.
	 * VALID VALUES FOR 'String tableObject' are 'chair' , 'centerpiece' or 'PlaceSetting'.
	 * @param objectCount count of a table objects 'say chair or centerpiece' per table as client per client request
	 * @param tableObject 'chair' or 'centerpiece' etc .*/
	public void setTableObjectCount(int objectCount, String tableObject)
	{
		
		if(tableObject == "chair") this.chair.setCountPerTable(objectCount);
		if(tableObject == "centerpiece") this.centerpiece.setCountPerTable(objectCount);
		if(tableObject == "PlaceSetting") this.placeSetting.setCountPerTable(objectCount);
	}
	
	/**Displays table setting and invokes the place setting party setting.*/
	public static void displayPartySetting() 
	{
		System.out.println("\tEach Table Setting contains a centerpiece, 4 chairs and 4 placesettings");
		PlaceSetting.displayPartySetting();
		
	}
}
