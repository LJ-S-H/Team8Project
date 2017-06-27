package Pack1;

import java.sql.Time;

/**
 * Object that holds the information of an entry within a routing table
 * 
 * @author Lovejit Hari
 * @version 1.0
 */
public class Entry {
	
	private long myTime;
	
	private String myIp;
	
	private int myHops;
	
	private String myPortNum;

	/**
	 * Entry is an object that contains a port number, ip address, and the number
	 * of hops it takes to get from one node to another.
	 * @param thePortNum port number associated with this entry
	 * @param theIp the ip address of this entry
	 * @param theHops number of hops it takes to get from this entry to another entry
	 */
	public Entry(String thePortNum, String theIp, int theHops) {
		super();
		this.myTime = System.currentTimeMillis(); //time of creation 
		this.myIp = theIp;
		this.myHops = theHops;
		this.myPortNum = thePortNum;
	}

	public long getMyTime() {
		return myTime;
	}

	public void setMyTime(long myTime) {
		this.myTime = myTime;
	}

	public String getMyIp() {
		return myIp;
	}

	public void setMyIp(String myIp) {
		this.myIp = myIp;
		setMyTime(System.currentTimeMillis());
	}

	public int getMyHops() {
		return myHops;
	}

	public void setMyHops(int myHops) {
		this.myHops = myHops;
		setMyTime(System.currentTimeMillis());
	}

	public String getMyPortNum() {
		return myPortNum;
	}

	public void setMyPortNum(String myPortNum) {
		this.myPortNum = myPortNum;
		setMyTime(System.currentTimeMillis());
	}
	
	
}
