
public class Tree {
	public Node root;
	
	public Node existe(Node root1,String el) {
		if(root1.value==el) 
			return root1;
		else
		for(int i=0;i<root1.childs.size();i++) {
			if(root1.childs.get(i).value==el) {
				return root1.childs.get(i);
			}else{
				existe(root1.childs.get(i),el);
			}
		}
		return null;
	}
}
