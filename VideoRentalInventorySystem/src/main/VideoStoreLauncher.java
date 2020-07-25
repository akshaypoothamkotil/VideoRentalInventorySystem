package main;

import Store.VideoStore;

public class VideoStoreLauncher {
public static void main(String[] args) {
	VideoStore vs=new VideoStore();
	vs.addVideo("The Matrix");
	vs.addVideo("GF II");
	vs.addVideo("Star Wars");
	
	vs.reciveRating("The Matrix",4);
	vs.reciveRating("The Matrix",3);
	vs.reciveRating("The Matrix",5);
	vs.reciveRating("The Matrix",5);
	
	
	vs.reciveRating("GF II", 5);
	vs.reciveRating("GF II", 5);
	vs.reciveRating("GF II", 5);
	
	vs.reciveRating("Star Wars", 1);
	vs.reciveRating("Star Wars", 2);
	vs.reciveRating("Star Wars", 1);
	
	
	vs.checkOut("GF II");
	vs.checkOut("The Matrix");
	vs.checkOut("Star Wars");
	
	
	vs.returnVideo("GF II");
	vs.returnVideo("The Matrix");
	vs.returnVideo("Star Wars");
	
	
	vs.listInventory();
	
	
	vs.checkOut("GF II");
	vs.listInventory();
}
}
