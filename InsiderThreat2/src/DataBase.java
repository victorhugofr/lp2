import java.util.ArrayList;

public class DataBase {
	public ArrayList<Tree>users;
	
	public DataBase() {
		users=new ArrayList<Tree>();
	}
	
	public void verifica(Action teste) {
		Node aux;
		Node aux2;
		boolean existe= false;
		for(int i=0;i<users.size();i++) {
			aux=users.get(i).existe(users.get(i).root,teste.getUser());
			if(aux!=null) {//procura usuario
				existe=true;
				aux.hist[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
				aux=users.get(i).existe(aux,teste.getPc());
				if(aux!=null) {//procura PC
					aux.hist[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
					aux2=users.get(i).existe(aux,teste.getActivity());
					if(aux2!=null) {//procura atividade
						aux2.hist[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
					}else {
						Node activity=new Node(teste.getActivity());
						activity.hist[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
						aux.childs.add(activity);
					}
				}else {
					Node PC= new Node(teste.getPc());
					Node activity=new Node(teste.getActivity());
					PC.childs.add(activity);
					PC.hist[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
					users.get(i).existe(users.get(i).root,teste.getUser()).childs.add(PC);
				}
			}
			/**if(users.get(i).root.value==teste[2]) {
				users.get(i).root.hist[Integer.parseInt(teste[1].substring(11, 13))]++;
				existe=true;
			}*/
		}
		
		if(existe==false) {
			Node id= new Node(teste.getUser());
			Node PC= new Node(teste.getPc());
			Node activity=new Node(teste.getActivity());
			
			activity.hist[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
			
			PC.hist[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
			PC.childs.add(activity);
			
			id.hist[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
			id.childs.add(PC);
			
			Tree user = new Tree();
			user.root=id;
			users.add(user);
		}
	}
	public void print() {
		for(int i=0;i<users.size();i++) {
			System.out.println(users.get(i).root.value);
		}
	}
}
