package Model;
public class Video {
private String title;
private boolean checkedOut;
private double average;
private int ratingCount;
private int ratingSumTotal;


public Video(String title) {
	this.title = title;
	this.checkedOut = false;
	this.average = 0;
	this.ratingCount = 0;
	this.ratingSumTotal = 0;
}

public String getTitle() {
	return title;
}

public boolean isCheckedOut() {
	return checkedOut;
}

public double getAverage() {
	return average;
}

public void setTitle(String title) {
	this.title = title;
}

public void beingCheckedOut() {
	this.checkedOut=true;
}

public void beingReturned() {
	this.checkedOut=false;
}

public void postRating(int rating) {
	this.ratingSumTotal+=rating;
	this.ratingCount++;
	this.average=ratingSumTotal/ratingCount;
}


public String toString() {
	return "Title: "+getTitle()+"\n Average Rating: "+getAverage()+"\n Check Out status: "+isCheckedOut()+".\n";
}


}
