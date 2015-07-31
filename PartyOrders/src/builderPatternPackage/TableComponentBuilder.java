package builderPatternPackage;

/**Builder interface with guidelines to build a table setting.
 * 
 * Builder Pattern : Builder*/
public interface TableComponentBuilder 
{
	public void createStyle();
	
	public void buildChair();
	
	public void buildCenterpiece();
	
	public void buildPlaceSetting();
	
	public TableSetting getTableSetting();
	
}
