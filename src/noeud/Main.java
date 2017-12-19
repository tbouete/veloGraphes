package noeud;

public class Main {
	
	//see traveling salesman probelem
	
	public static void main(String args[]){
		
		final String csvFile = "..\\..\\docs\\Toulouse.csv";
		final String apikey  = "3259c8546589a48b226571195d3121e2fa24ce7b";
		
		for(int i = 1; i < 280; i++){
			Noeud toast = Noeud.readNodeFromeCSV(csvFile, i);
			System.out.println(toast);
		}
	}
}
