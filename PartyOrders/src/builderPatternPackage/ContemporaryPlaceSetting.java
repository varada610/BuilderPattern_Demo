package builderPatternPackage;

/**PlaceSetting of type Contemporary. Extends PlaceSetting abstract class.*/
public class ContemporaryPlaceSetting extends PlaceSetting 
{
	private int contemporaryPlaceSettingCost;
	
	public ContemporaryPlaceSetting()
	{
	super();
	this.contemporaryPlaceSettingCost = this.basePlaceSettingPrice + 20;
	}
	
	/**Calculates cost of contemporary place setting 
	 * @return cost Cost of Contemporary placesettings in the Party*/
	@Override
	public int calculateCost() 
	{
		return (this.contemporaryPlaceSettingCost*this.placeSettingCount);
	}

}
