package Store;


import java.util.HashMap;

import Model.Video;

public class VideoStore {
private HashMap<String, Video> inventory=new HashMap<String, Video>();

public boolean addVideo(String title) {
	
		inventory.put(title, new Video(title));
		
		
		return true;
	
}

public boolean checkOut(String title) {
	
	Video video=inventory.get(title);
	if(video.isCheckedOut()) {
		return false;//already checked out.
	}
	else {
		video.beingCheckedOut();
		return true;//video avilable
	}
}

public boolean returnVideo(String title) {
	Video video=inventory.get(title);
	if(video.isCheckedOut()) {
		video.beingReturned();
		return true;
	}
	else {
		return false;
	}
	}


public boolean reciveRating(String title,int rating) {
	
	if(rating>5)
		return false;
	Video video=inventory.get(title);
	video.postRating(rating);
	return true;
}


public void listInventory() {
	for(String key : inventory.keySet()) {
		System.out.println(inventory.get(key).toString());
	}
}

}
