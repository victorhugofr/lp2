
public class ClockDisplay{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;  

    public ClockDisplay(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplay(int hour, int minute){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    public void timeTick(){
        minutes.increment();
        if(minutes.getValue() == 0) { 
            hours.increment();
        }
        updateDisplay();
    }


    public void setTime(int hour, int minute){
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime(){
        return displayString;
    }
    
    private void updateDisplay(){
        if(hours.getDisplayValue().indexOf("am")!= -1){
            displayString = hours.getDisplayValue().substring(0,2) + ":" + minutes.getDisplayValue() + "am";
        }else{
            displayString = hours.getDisplayValue().substring(0,2) + ":" + minutes.getDisplayValue() + "pm";
        }
    }
}
