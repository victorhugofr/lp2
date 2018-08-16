import java.util.HashMap
public class Room 
{
    public String description;
    public HashMap<String,Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<String,Room>();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(String direction, Room neighbor) 
    {
        exits.put(direction,neighbor);
    }
    public Room getExit(String direction){
    	return exits.get(direction);
    }
   // public String getExitString(){
    	
   // }
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
