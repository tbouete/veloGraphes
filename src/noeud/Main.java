package noeud;

public class Main {
	
	//see traveling salesman probelem
	
	public static void main(String args[]){
		
		final String csvFile = "././docs/Toulouse.csv";
		final String apikey  = "3259c8546589a48b226571195d3121e2fa24ce7b";
		
		Graphe myGraph = new Graphe(csvFile);
		System.out.println(myGraph.toString());
	}
}
