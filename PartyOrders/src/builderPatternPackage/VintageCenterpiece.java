package builderPatternPackage;

public class VintageCenterpiece extends Centerpiece
{
	private int vintageCenterpieceCost;
	
	public VintageCenterpiece()
	{
	super();
	this.vintageCenterpieceCost = this.baseCenterpiecePrice + 35;
	}

	/**Calculates cost of vintage centerpiece
	 * @return cost Cost of Vintage Centerpieces in the Party*/
	@Override
	public int calculateCost() 
	{
		return (this.vintageCenterpieceCost*this.centerpieceCount);
	}

}
