package builderPatternPackage;

/**Constructs TableSetting components from the TableComponentBuilder supplied by PartySetting
 * 
 * Builder Pattern : Director*/
public class PartyDirector 
{	
private TableComponentBuilder tableBuilder=null;

/**Default table builder assumed contemporary*/
public PartyDirector()
{
	this.tableBuilder = new ContemporaryTableSettingBuilder(); 
}

/**Table builder of director set to party setting preference*/
public PartyDirector(TableComponentBuilder tableBuilder)
{
	this.tableBuilder = tableBuilder;
}

/**Construct the style and table components for the table setting.*/
public void constructTableSetting()
{
	this.tableBuilder.createStyle();
	this.tableBuilder.buildChair();
	this.tableBuilder.buildCenterpiece();
	this.tableBuilder.buildPlaceSetting();
}

/**Get the constructed table setting from the table builder*/
public TableSetting getTableSetting()
{
	return this.tableBuilder.getTableSetting();
}

}
