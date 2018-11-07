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
		//	System.out.println(teste.getUser());
			aux=users.get(i).existe(users.get(i).getRoot(),teste.getUser());
			if(aux!=null) {//procura usuario
				existe=true;
				System.out.println(existe);
				aux.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
				aux=users.get(i).existe(aux,teste.getPc());
				if(aux!=null) {//procura PC
					aux.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
					aux2=users.get(i).existe(aux,teste.getActivity());
					if(aux2!=null) {//procura atividade
						aux2.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
					}else {
						Node activity=new Node(teste.getActivity());
						activity.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
						aux.getChilds().add(activity);
					}
				}else {
					Node PC= new Node(teste.getPc());
					Node activity=new Node(teste.getActivity());
					PC.getChilds().add(activity);
					PC.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
					users.get(i).existe(users.get(i).getRoot(),teste.getUser()).getChilds().add(PC);
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
			
			activity.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
			
			PC.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
			PC.getChilds().add(activity);
			
			id.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
			id.getChilds().add(PC);
			
			Tree user = new Tree();
			user.setRoot(id);
			users.add(user);
		}
	}
	public void print() {
		for(int i=0;i<users.size();i++) {
			System.out.println(users.get(i).getRoot().getValue());
		}
	}
}
