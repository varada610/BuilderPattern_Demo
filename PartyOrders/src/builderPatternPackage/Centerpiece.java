package builderPatternPackage;

public abstract class Centerpiece 
{
	/**The centerpiece count can be modified by setter function setCountPerTable*/
	protected int centerpieceCount;
	
	/**The base price of a centerpiece can be modified */
	protected int baseCenterpiecePrice ;
	
	public Centerpiece()
	{
		this.centerpieceCount=1;
		this.baseCenterpiecePrice=30;
	}
	
	/**Implemented by child classes of Chair*/
	public abstract int calculateCost();
	
	/** We can modify the count of centerpieces per table if ordered
	 * @param centerpieceCount  count of modified centerpiece items*/
	public void setCountPerTable(int centerpieceCount)
	{
		this.centerpieceCount = centerpieceCount;
	}
	
	/**Can be invoked to modify base price*/
	public void modifyBasePrice(int baseCenterpiecePrice)
	{
		this.baseCenterpiecePrice = baseCenterpiecePrice;
	}

}
