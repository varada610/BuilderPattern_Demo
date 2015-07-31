package builderPatternPackage;

public abstract class Chair 
{
	/**The chair count can be modified by setter function setCountPerTable*/
	protected int chairCount=4;
	
	/**The base price of a chair can be modified */
	protected int baseChairPrice=50;
	
	public Chair()
	{
		this.chairCount=4;
		this.baseChairPrice=50;
	}
	
	/**Abstract cost function overridden in the child classes*/
	public abstract int calculateCost();
	
	/** We can modify the count of chairs per table if ordered
	 * @param chairCount  count of modified chair items*/
	public void setCountPerTable(int chairCount)
	{
		this.chairCount = chairCount;
	}
	
	/**Can be invoked to modify base price*/
	public void modifyBasePrice(int baseChairPrice)
	{
		this.baseChairPrice = baseChairPrice;
	}
}
