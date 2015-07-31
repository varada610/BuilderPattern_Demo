package builderPatternPackage;

public abstract class PlaceSetting 
{
	/**The place setting count can be modified by setter function setCountPerTable*/
	protected int placeSettingCount;
	
	/**The base price of a place setting can be modified */
	protected int basePlaceSettingPrice;
	
	public PlaceSetting()
	{
		this.placeSettingCount=4;
		this.basePlaceSettingPrice=20;
	}
	
	/**Abstract cost function overridden in the child classes*/
	public abstract int calculateCost();
	
	/** We can modify the count of PlaceSettings per table if ordered
	 * @param placeSettingCount  count of modified PlaceSetting items*/
	public void setCountPerTable(int placeSettingCount)
	{
		this.placeSettingCount = placeSettingCount;
	}
	
	/**Can be invoked to modify base price*/
	public void modifyBasePrice(int basePlaceSettingPrice)
	{
		this.basePlaceSettingPrice = basePlaceSettingPrice;
	}
	/**Displays place setting.*/
	public static void displayPartySetting() 
	{
		System.out.println("\tEach Place Setting contains plates, silver and napkins ");
		
	}
}
