public class Vehicle
{
    private String id;
    private String destination;
    private String location;
	
	public Vehicle(String id, String base){
		this.id = id;
        location = base;
        destination = null;
	} 

    public String getStatus()
    {
   	 if(destination == null){
   	 	return id+ " is available!";
   	 }else{
   	     return id + " at " + location + " headed for " +
               destination;
         }
    }
    public String getID()
    {
        return id;
    }
    public String getLocation()
    {
        return location;
    }
    public String getDestination()
    {
        return destination;
    }
    protected void setDestination(String destination)
    {
        this.destination = destination;
    }
    protected void setLocation(String location)// pode?
    {
        this.location = location;
    }
    public void arrived()
    {
        location = destination;
    }

 }
