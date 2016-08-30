package my.osgi.ds.example.common;

public class DebugOutputHelper {

	public static void logConstructor(Class<?> serviceClass)
	{
		System.out.println(serviceClass.getSimpleName() + " constructed.");
	}
	
	public static void logStart(Class<?> serviceClass)
	{
		System.out.println(serviceClass.getSimpleName() + " started.");
	}
	
	public static void logStop(Class<?> serviceClass)
	{
		System.out.println(serviceClass.getSimpleName() + " stopped.");
	}
	
	public static void logBind(Class<?> serviceClass, Class<?> referenceClass)
	{
		System.out.println(referenceClass.getSimpleName() + " --> " + serviceClass.getSimpleName());
	}
	
	public static void logUnbind(Class<?> serviceClass, Class<?> referenceClass)
	{
		System.out.println(referenceClass.getSimpleName() + " x-> " + serviceClass.getSimpleName());
	}
	
}
