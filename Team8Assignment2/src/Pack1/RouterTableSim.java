package Pack1;

import java.util.Scanner;

/**
 * Simulates a router table that updates to show an addition of a node,
 * a removal of a node, and the reconnection to some node.
 * @author Lovejit Hari
 * @author V
 * @author K
 *
 */
public class RouterTableSim {

	//Entry array of size 10
	private static Entry[] myEntryArr = new Entry[10];
	
	
	public static void main(String[] args) {

		//pritns out the initial entries
		initEntries();
		System.out.println("Port\tIP\t\tHops\tTime");
		for (int i = 0; i < 6; i++) {
			
			System.out.println(myEntryArr[i].getMyPortNum() + "\t" + myEntryArr[i].getMyIp() + "\t" +
					myEntryArr[i].getMyHops() + "\t" + myEntryArr[i].getMyTime());
			
		}
		
		//asks for update
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Update? Y/N");
		
		String potato = scan.nextLine();
		
		System.out.println("\n");
		myEntryArr[6] = new Entry("S0","140.0.0.0",4);
		myEntryArr[7] = new Entry("S1","140.0.0.0",2);
		
		//prints out new entries
		System.out.println("Port\tIP\t\tHops\tTime");
		for (int i = 0; i < 8; i++) {
			System.out.println(myEntryArr[i].getMyPortNum() + "\t" + myEntryArr[i].getMyIp() + "\t" +
					myEntryArr[i].getMyHops() + "\t" + myEntryArr[i].getMyTime());
		}
		
		
		
		System.out.println("Simulating IP 138.0.0.0 going offline");
		
		System.out.println("Update: Press any key");
		
		potato = scan.nextLine();
		
		myEntryArr[1] = myEntryArr[3];
		myEntryArr[2] = myEntryArr[7];
		
		//prints out updated router table after removing a node
		System.out.println("Port\tIP\t\tHops\tTime");

		for (int i = 0; i < 3; i++) {
			System.out.println(myEntryArr[i].getMyPortNum() + "\t" + myEntryArr[i].getMyIp() + "\t" +
					myEntryArr[i].getMyHops() + "\t" + myEntryArr[i].getMyTime());
		}
		
		System.out.println("Simulating adding a node");
		
		System.out.println("Update: Press any key");
		
		potato = scan.nextLine();
		
		myEntryArr[3] = new Entry("S0", "138.0.0.0", 2);
		myEntryArr[4] = new Entry("S1", "138.0.0.0", 2);
		myEntryArr[5] = new Entry("S0", "139.0.0.0", 3);
		myEntryArr[6] = new Entry("S0", "140.0.0.0", 4);
		myEntryArr[7] = new Entry("S1", "137.0.0.0", 3);
		
		//reconnects the removed node and prints out full table
		System.out.println("Port\tIP\t\tHops\tTime");
		for (int i = 0; i < 8; i++) {
			System.out.println(myEntryArr[i].getMyPortNum() + "\t" + myEntryArr[i].getMyIp() + "\t" +
					myEntryArr[i].getMyHops() + "\t" + myEntryArr[i].getMyTime());
		}
		
	}
	
	/**
	 * Initializes all the entries used in our router table
	 */
	private static void initEntries() {
		
		for (int i = 0; i < 3; i++) {
			myEntryArr[i] = new Entry("S0", (137+i) + ".0.0.0", i+1);
		}
		
		for (int i = 3; i < 6; i++) {
			myEntryArr[i] = new Entry("S1", (139-i+3) + ".0.0.0", i-2);
		}
		
	}

}
