package testPackage;
import builderPatternPackage.PartySetting;

/**Test class that orders party settings. Communicates only with PartySetting class
 * @author Varada*/
public class Client 
{
	public static void main(String[] args) 
	{
		PartySetting partyOrder = new PartySetting();
		partyOrder.placeOrder();
		//** ----------------------------------------------------------------------------------//
		PartySetting partyOrder2 = new PartySetting();
		// Gets the estimate for the client order entered from console
		partyOrder2.getEstimate();
		//**Instead of 4 , now 5 chairs will be considered per table and cost calculated.
		//** The client will not be again asked to enter styles./
		partyOrder2.setTableObjectCount(5, "chair");
		System.out.println("Now estimated cost with added chair per table is :");
		partyOrder2.getEstimate();
		//** ----------------------------------------------------------------------------------//
	}

}
