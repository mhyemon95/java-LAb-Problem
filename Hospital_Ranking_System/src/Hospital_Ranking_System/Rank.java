package Hospital_Ranking_System;
import java.util.ArrayList;
public class Rank {
ArrayList<Hospital> HL = new ArrayList<>();
	
	private void addNewMovie(Hospital m) {
		HL.add(m);
	}
	
	public void addNewMovie(String name, String speciality, String address, double rank, int noOfUserRanked) {
		addNewMovie(new Hospital(name, speciality, address,rank,noOfUserRanked));
	}
	
	public Hospital findHospital(String name) {
		for(Hospital h : HL) {
			if(h.getNme().equals(name)) {
				return h;
			}
		}
		
		return null;
	}
	
	public void updateRank(String name, double rate) {
		Hospital h = findHospital(name);
		if(h!= null) {
			h.updaterank(rate);
		}
		else {
			System.out.println("Hospital not found");
		}
	}
	
	public double getRank(String name) {
		Hospital h = findHospital(name);
		if(h!= null) {
			return h.getRank();
			}
		else {
			System.out.println("Hospital not found");
			return 0;
		}
	}
	
	public void listOfHospitalByCategory(String speciality) {
		int temp = 0;
		for(int i=0; i<HL.size();i++) {
			if(HL.get(i).getSpeciality().equals(speciality)) {
				HL.get(i).display();
				temp++;
			}
		}
		if(temp == 0) {
			System.out.println("Movie not found");
		}

	}
	
	public void listOfHospitalAboveRank(double rank) {
		int temp = 0;
		for(int i=0; i<HL.size();i++) {
			if(HL.get(i).getRank()>=rank) {
				HL.get(i).display();
				temp++;
			}
		}
		if(temp == 0) {
			System.out.println("Movie not found");
		}
		
	}

}


