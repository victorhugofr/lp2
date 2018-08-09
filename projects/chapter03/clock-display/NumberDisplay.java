
public class NumberDisplay
{
    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimit)
    {
        limit = rollOverLimit;
        value = 0;
    }

    public int getValue()
    {
        return value;
    }

    public String getDisplayValue(){
        if(value < 10 && limit == 24) {
            return "0" + value + "am";
        }
        else if(value<=12 && limit == 24) {
            return "" + value + "am";
        } 
        else if(value>12 && limit == 24){
            return "" + value/2 +"pm";
        }
        else if(value<10 && limit == 60){
            return "0" +value;
        }
        else{
            return "" + value;
        }
    }

    public void setValue(int replacementValue)
    {
        if((replacementValue >= 0) && (replacementValue < limit)) {
            value = replacementValue;
        }
    }


    public void increment()
    {
        value = (value + 1) % limit;
    }
}
