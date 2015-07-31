package builderPatternPackage;

/**Place Setting of type Modern. Extends PlaceSetting abstract class.*/
public class ModernPlaceSetting extends PlaceSetting 
{
	private int modernPlaceSettingCost;

	public ModernPlaceSetting()
	{
	super();
	this.modernPlaceSettingCost = this.basePlaceSettingPrice + 30;
	}

	/**Calculates cost of modern chair
	 * @return cost Cost of Modern place settings in the Party*/
	@Override
	public int calculateCost() 
	{
		return (this.modernPlaceSettingCost*this.placeSettingCount);
	}

}
