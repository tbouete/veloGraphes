package noeud;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Noeud {

	private int number;
	private String name;
	private String address;
	private double latitude;
	private double longitude;
	
	
	
	public Noeud(String number, String name, String address, String latitude, String longitude){
		this.number = Integer.parseInt(number);
		this.name = name;
		this.address = address;
		this.latitude = Double.parseDouble(latitude);
		this.longitude = Double.parseDouble(longitude);
	}

	public static Noeud readNodeFromeCSV(String csvFile, int nodeNumber){
		Noeud noeudRet = null;
		
		BufferedReader br = null;
        String cvsSplitBy = ";";
        String[] line = { "", "", "", "", "" };
        
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while(!line[0].equals(new Integer(nodeNumber).toString())){
            	line = br.readLine().split(cvsSplitBy);
            }
            noeudRet = new Noeud(line[0],
            					 line[1],
            					 line[2],
            					 line[3],
            					 line[4]);
          

        }catch (NumberFormatException e){
        	e.printStackTrace();
        	System.out.println("Champ invalide pour le point " + nodeNumber + ".");
        }catch (NullPointerException e) {
        	e.printStackTrace();
        	System.out.println("Le point " + nodeNumber + " n'est pas présent dans ce fichier.");
        	return null;
		}catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erreur : Fichier non valide");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		return noeudRet;
		
	}
	
	
	
	@Override
	public String toString() {
		String ret = "Node n°" + this.number + " " + this.name + " " + this.address + "\nLatitude : " + this.latitude + "\nLongitude : " + this.longitude;
		
		return ret;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
	
}
