package builderPatternPackage;
import stylePackage.Contemporary;
/**Concrete builder that implements the builder interface. 
 * Sets every table setting to have contemporary components and creates a TableSetting
 * 
 * Builder Pattern : Concrete Builder*/
public class ContemporaryTableSettingBuilder implements TableComponentBuilder
{
	private TableSetting tableSetting;

	public ContemporaryTableSettingBuilder()
	{
		this.tableSetting = new TableSetting();
	}

	/**Create style for TableSetting*/
	public void createStyle() 
	{
		this.tableSetting.setStyle(new Contemporary());		
	}

	/**Build chair for TableSetting*/
	public void buildChair() 
	{
		this.tableSetting.setChair(new ContemporaryChair());
	}

	/**Build centerpiece for TableSetting*/
	public void buildCenterpiece() 
	{
		this.tableSetting.setCenterpiece(new ContemporaryCenterpiece());
	}

	/**Build place setting for TableSetting*/
	public void buildPlaceSetting() 
	{
		this.tableSetting.setPlaceSetting(new ContemporaryPlaceSetting());
	}
	
	/**Retrieve the table setting object*/
	public TableSetting getTableSetting() 
	{
		return this.tableSetting;
	}	

}
