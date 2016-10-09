package Test0;

public class SimpleLocation {
	private double latitude;
	private double longtitude;
	
	public SimpleLocation()
	{
		this.latitude = 0.0;
		this.longtitude = 0.0;
	}
	
	public SimpleLocation(double lat, double lon)
	{
		this.latitude = lat;
		this.longtitude = lon;
	}
//THE getter	
	public double getLatitude()
	{
		return this.latitude;
	}
	
	public double getLongtitude()
	{
		return this.longtitude;
	}
//THE setter	
	public void setLatitude(double lat)
	{
		if(lat < -180.0 || lat >180.0) {
			System.out.println("ƒ„¥Ì¡À£°");
		}
		else {
			this.latitude = lat;
		}
	}
	
	public void setLongtitude(double lon)
	{
		this.longtitude = lon;
	}
	
//	public double distance(SimpleLocation other)
	{
		
	}
}


