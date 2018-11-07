import java.util.ArrayList;

public class Node {
	public String value;
	public int hist[];
    public ArrayList<Node> childs;
    
    public Node(String value) {
    	this.value=value;
    	hist=new int[24];
    	childs=new ArrayList<Node>();
    }
    public Node() {
    //	this.value=value;
    	hist=new int[24];
    	childs=new ArrayList<Node>();
    }
    public void print() {
    	System.out.println(value);
    }
    
}
