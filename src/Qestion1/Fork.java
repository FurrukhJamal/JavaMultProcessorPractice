package Qestion1;

public class Fork {
	private int id;
	boolean inUse = false;
	Philosopher usedBy;
	
	public Fork(int id) {
		this.id = id;
	}
	
	public synchronized void setUser(Philosopher p) {
		if(this.inUse == false) {
			this.inUse = true;
			this.usedBy = p;
		}
	}
	public void setForkNotInUse() {
		this.inUse = false;
	}
}
