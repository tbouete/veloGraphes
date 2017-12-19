package noeud;

import java.util.ArrayList;
import java.util.List;

public class Graphe {

	private final int MAX_NODES_NUMBER = 280;
	private List<Noeud> noeuds = new ArrayList<>();
	
	public Graphe(String csvFileName){
		for(int i = 1; i < this.MAX_NODES_NUMBER; i++){
			Noeud node = Noeud.readNodeFromeCSV(csvFileName, i);
			if(node != null) this.noeuds.add(node);
		}
	}

	@Override
	public String toString() {
		String ret = "Number of nodes : " + this.noeuds.size() + "\n";
		
		for(Noeud n : this.noeuds){ ret += n.toString(); }
		
		return ret;
	}
	
	
}
