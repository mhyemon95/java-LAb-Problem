package Hospital_Ranking_System;
import javax.swing.JOptionPane;
public class RankingApp {
	public static void main(String[] args) {
		Rank ranking = new Rank();
		String name,speciality,address,ran,noOfUserRank;
		int choice;
		
		while(true) {
			choice = getManu();
			switch(choice) {
			case 1:
				name = JOptionPane.showInputDialog("PLEASE ENTER HOSPITAL NAME");
				speciality = JOptionPane.showInputDialog("WHAT IS HOSPITAL SPECIALITY?");
				address = JOptionPane.showInputDialog("PLEASE ENTER HOSPITAL ADDRESS:");
				ran = JOptionPane.showInputDialog("HOSPITAL RANKING:");
				double rank = Double.parseDouble(ran);
				noOfUserRank = JOptionPane.showInputDialog("HOW MANY CLIENT RATED THIS HOSPITAL?");
				int noOfUserRanked = Integer.parseInt(noOfUserRank);
				ranking.addNewMovie(name, speciality, address, rank, noOfUserRanked);
				break;
				
			case 2:
				name = JOptionPane.showInputDialog("PLEASE ENTER HOSPITAL NAME");
				ran = JOptionPane.showInputDialog("HOSPITAL RANKING:");
				double rank1 = Double.parseDouble(ran);
				ranking.updateRank(name, rank1);
				break;
				
			case 3:
				name = JOptionPane.showInputDialog("PLEASE ENTER HOSPITAL NAME");
				System.out.println(ranking.getRank(name));
				break;
				
			case 4:
				speciality = JOptionPane.showInputDialog("WHAT IS HOSPITAL SPECIALITY?");
				ranking.listOfHospitalByCategory(speciality);
				break;
				
			case 5:
				ran = JOptionPane.showInputDialog("HOSPITAL RANKING:");
				double rank2 = Double.parseDouble(ran);
				ranking.listOfHospitalAboveRank(rank2);
				break;
				
			case 0:
				System.out.println("Thank you");
				System.exit(0);
				
			default:
				System.out.println("Invalid Input");
			
			}
		}
		
	}
	
	public static int getManu() {
		String pop = JOptionPane.showInputDialog("\n1.ADD NEW HOSPITAL\n2.RANK A HOSPITAL\n3.TO SHOW A HOSPITAL\n4.SEARCH A HOSPITAL BY SPECIALITY\n5.SEARCH HOSPITAL BY SPECIFIC RANKING\n0.EXIT\n");
		int choice = Integer.parseInt(pop);
		return choice;
	}

}



