package builderPatternPackage;

/**Chair of type Vintage. Extends Chair abstract class.*/
public class VintageChair extends Chair
{
	private int vintageChairCost;
	
	public VintageChair()
	{
	super();
	this.vintageChairCost = this.baseChairPrice + 50;
	}
	
	/**Calculates cost of vintage chair
	 * @return cost Cost of Vintage Chairs in the Party*/
	@Override
	public int calculateCost() 
	{
		return (this.vintageChairCost*this.chairCount);
	}

}
