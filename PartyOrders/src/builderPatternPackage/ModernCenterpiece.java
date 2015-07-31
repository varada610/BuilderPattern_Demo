package builderPatternPackage;

public class ModernCenterpiece extends Centerpiece 
{
	private int modernCenterpieceCost;

	public ModernCenterpiece()
	{
	super();
	this.modernCenterpieceCost = this.baseCenterpiecePrice + 40;
	}
	
	/**Calculates cost of modern chair
	 * @return cost Cost of Modern Chairs in the Party*/
	@Override
	public int calculateCost() 
	{
		return (this.modernCenterpieceCost*this.centerpieceCount);
	}

}
