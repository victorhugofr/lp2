import java.util.ArrayList;

public class DataBase {
	public ArrayList<Tree>users;
	
	public DataBase() {
		users=new ArrayList<Tree>();
	}
	
	public void verifica(Action teste) {
		Node aux;
		Node aux2;
		Node aux3;
		boolean existe= false;
		for(int i=0;i<users.size();i++) {
		//	System.out.println(teste.getUser());
			aux=users.get(i).existe(users.get(i).getRoot(),teste.getUser()); 
			if(aux!=null) {//procura usuario
				existe=true;
				aux.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
				aux2=users.get(i).existe(aux,teste.getPc()); 
				if(aux2!=null) {//procura PC
					aux.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
					aux3=users.get(i).existe(aux,teste.getActivity());
					if(aux3!=null) {//procura atividade
						aux3.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
					}else {
						Node activity=new Node(teste.getActivity());
						activity.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
						aux2.getChilds().add(activity);
					}
				}else {
					Node PC= new Node(teste.getPc());
					Node activity=new Node(teste.getActivity());
					PC.getChilds().add(activity);
					PC.getHist()[Integer.parseInt(teste.getDateString().substring(11, 13))]++;
					aux.getChilds().add(PC);
				}
			}
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
		Node aux,aux2,aux3;
		int i,j,z;
		for(i=0;i<users.size();i++) {
			aux=users.get(i).getRoot();
			System.out.println(aux.getValue());
			for(z=0;z<aux.getChilds().size();z++) {
				aux2=aux.getChildAt(z);
				System.out.println(aux2.getValue());
				for(j=0;j<aux2.getChilds().size();j++) {
					aux3=aux2.getChildAt(j);
					System.out.println(aux3.getValue());
				}
			}
		}
	}
}
