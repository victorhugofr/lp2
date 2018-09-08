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
    /**
     * Return the status of this vehicle.
     * @return The status.
     */
    public String getStatus()
    {
   	 if(destination == null){
   	 	return id+ " is available!";
   	 }else{
   	     return id + " at " + location + " headed for " +
               destination;
         }
    }
    /**
     * Return the ID of the vehicle.
     * @return The ID of the vehicle.
     */
    public String getID()
    {
        return id;
    }
    /**
     * Return the location of the vehicle.
     * @return The location of the vehicle.
     */
    public String getLocation()
    {
        return location;
    }
    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination()
    {
        return destination;
    }
    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    protected void setDestination(String destination)
    {
        this.destination = destination;
    }
    /**
     * Set the location of the vehicle.
     * @param The location.
     */
    protected void setLocation(String location)
    {
        this.location = location;
    }
    /**
     * Indicate that this vehicle has arrived at its destination.
     * 
     */
    public void arrived()
    {
        location = destination;
    }

 }
