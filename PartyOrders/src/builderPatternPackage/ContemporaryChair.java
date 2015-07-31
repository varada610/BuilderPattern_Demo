package builderPatternPackage;

/**Chair of type Contemporary. Extends Chair abstract class.*/
public class ContemporaryChair extends Chair 
{
	private int contemporaryChairCost;
	
	public ContemporaryChair()
	{
	super();
	this.contemporaryChairCost = this.baseChairPrice + 20;
	}

	/**Calculates cost of contemporary chair
	 * @return cost Cost of Contemporary Chairs in the Party*/
	@Override
	public int calculateCost() 
	{
		return (this.contemporaryChairCost*this.chairCount);
	}

}
