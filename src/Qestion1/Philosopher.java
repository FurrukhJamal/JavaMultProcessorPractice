package Qestion1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Philosopher {
	private int id;
	Fork forkOne = null;
	Fork forkTwo = null;
	
	List<Fork> avialableForks = new ArrayList<>();
	public Philosopher(int id, List<Fork> forks) {
		this.id = id;
		this.avialableForks = forks;
	}
	
	public void philosophersLifeStart() {
		while(true) {
			int randomNumber = new Random().nextInt(100);
			if (randomNumber < 50) {
				if(this.forkOne != null && this.forkTwo != null ) {
					this.forkOne.setForkNotInUse();
					this.forkTwo.setForkNotInUse();
					this.forkOne = null;
					this.forkTwo = null;
				}
				System.out.println("Philopher " +this.id + " is thinking");
			}
			else if (randomNumber > 50  && randomNumber < 95){
				while(true) {
					int counter = 0;
					for(int i = 0; i < 5; i++) {
						if(this.avialableForks.get(i).inUse == false) {
							if(this.forkOne == null && this.avialableForks.get(i).inUse == false){
								this.forkOne = this.avialableForks.get(i);
								this.avialableForks.get(i).inUse = true;
								counter++;
							}
							if(this.forkTwo == null && this.avialableForks.get(i).inUse == false){
								this.forkOne = this.avialableForks.get(i);
								this.avialableForks.get(i).inUse = true;
								counter++;
							}					
						}
					}
					
					if(counter == 2) {
						break;
					}
					
					if(this.forkOne != null) {
						this.forkOne.setForkNotInUse();
						this.forkOne = null;
					}
					if(this.forkTwo != null) {
						this.forkTwo.setForkNotInUse();
						this.forkTwo = null;
					}
				}
				System.out.println("Philopher " +this.id + " is eating");
			}
			else {
				break;
			}
			
		}
		System.out.println("Philopher " +this.id + " Finished!");
	}
	
	public void addAvialableForks(Fork f) {
		this.avialableForks.add(f);
	}
}
