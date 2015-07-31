package builderPatternPackage;

/**Centerpiece of type Contemporary. Extends Centerpiece abstract class.*/
public class ContemporaryCenterpiece extends Centerpiece {

	private int contemporaryCenterpieceCost;
	
	public ContemporaryCenterpiece()
	{
	super();
	this.contemporaryCenterpieceCost = this.baseCenterpiecePrice + 25;
	}
	
	/**Calculates cost of contemporary centerpiece
	 * @return cost Cost of Contemporary Centerpieces in the Party*/
	@Override
	public int calculateCost() 
	{
		return (this.contemporaryCenterpieceCost*this.centerpieceCount);
	}

}
