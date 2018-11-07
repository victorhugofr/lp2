
public class Tree {
	private Node root;
	
	public Node existe(Node root1,String el) {
		if(root1.getValue()==el) 
			return root1;
		else
		for(int i=0;i<root1.getChilds().size();i++) {
			if(root1.getChilds().get(i).getValue()==el) {
				return root1.getChilds().get(i);
			}
		}
		for(int i=0;i<root1.getChilds().size();i++) {
			existe(root1.getChilds().get(i),el);
		}
		return null;
	}
	public void setRoot(Node root) {
		this.root=root;
	}
	public Node getRoot() {
		return root;
	}
}
