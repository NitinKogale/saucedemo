package utils;


public class SharedDataManager {

	static SharedData sharedData;
	
	public static void setSharedData()
	{
		sharedData = new SharedData();
	}
	public static void updateSharedData(SharedData sharedDataUpdate)
	{
		sharedData = sharedDataUpdate;
	}
	
	public static SharedData getSharedData()
	{
		return sharedData;
	}
	
	
	
}
