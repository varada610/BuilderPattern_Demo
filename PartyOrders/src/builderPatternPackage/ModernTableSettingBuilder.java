package builderPatternPackage;

import stylePackage.Modern;
/**Concrete builder that implements the builder interface. 
 * Sets every table setting to have modern components and creates a TableSetting
 * 
 * Builder Pattern : Concrete Builder*/
public class ModernTableSettingBuilder implements TableComponentBuilder
{
	private TableSetting tableSetting;
	
	public ModernTableSettingBuilder()
	{
		this.tableSetting = new TableSetting();
	}

	/**Create style for TableSetting*/
	public void createStyle() 
	{
		this.tableSetting.setStyle(new Modern());
	}

	/**Build chair for TableSetting*/
	public void buildChair() 
	{
		this.tableSetting.setChair(new ModernChair());
	}

	/**Build centerpiece for TableSetting*/
	public void buildCenterpiece() 
	{
		this.tableSetting.setCenterpiece(new ModernCenterpiece());
	}

	/**Build place setting for TableSetting*/
	public void buildPlaceSetting() 
	{
		this.tableSetting.setPlaceSetting(new ModernPlaceSetting());
	}

	/**Retrieve the table setting object*/
	public TableSetting getTableSetting() 
	{
		return this.tableSetting;
	}

}
