package builderPatternPackage;

/**Chair of type Modern. Extends Chair abstract class.*/
public class ModernChair extends Chair 
{
	private int modernChairCost;

	public ModernChair()
	{
	super();
	this.modernChairCost = this.baseChairPrice + 100;
	}
	
	/**Calculates cost of vintage chair
	 * @return cost Cost of Vintage Chairs in the Party*/
	@Override
	public int calculateCost() 
	{
		return (this.modernChairCost*this.chairCount);
	}

}
