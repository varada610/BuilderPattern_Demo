package builderPatternPackage;
import stylePackage.Vintage;

/**Concrete builder that implements the builder interface. 
 * Sets every table setting to have vintage components and creates a TableSetting
 * 
 * Builder Pattern : Concrete Builder*/
public class VintageTableSettingBuilder implements TableComponentBuilder
{
private TableSetting tableSetting;

public VintageTableSettingBuilder()
{
	this.tableSetting = new TableSetting();
}

/**Create style for TableSetting*/
public void createStyle() 
{
	this.tableSetting.setStyle(new Vintage());
}

/**Build chair for TableSetting*/
public void buildChair() 
{
	this.tableSetting.setChair(new VintageChair());
}

/**Build centerpiece for TableSetting*/
public void buildCenterpiece() 
{
	this.tableSetting.setCenterpiece(new VintageCenterpiece());
}

/**Build place setting for TableSetting*/
public void buildPlaceSetting() 
{
	this.tableSetting.setPlaceSetting(new VintagePlaceSetting());
}

/**Retrieve the table setting object*/
public TableSetting getTableSetting() 
{
	return this.tableSetting;
}

}
