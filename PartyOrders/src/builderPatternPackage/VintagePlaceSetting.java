package builderPatternPackage;

public class VintagePlaceSetting extends PlaceSetting
{
	private int vintagePlaceSettingCost;
	
	public VintagePlaceSetting()
	{
	super();
	this.vintagePlaceSettingCost = this.basePlaceSettingPrice + 40;
	}
	
	/**Calculates cost of vintage place setting
	 * @return cost Cost of Vintage place settings in the Party*/
	@Override
	public int calculateCost() 
	{
		return (this.vintagePlaceSettingCost*this.placeSettingCount);
	}
}
