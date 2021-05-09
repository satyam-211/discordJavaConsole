package questions;

import java.util.ArrayList;

public class Channel {
	
	ArrayList<Post> posts; // An array to store all the posts in the channel
	String name; // The name of the channel
	int idIncr;
	
	/**
	 * 2 marks
	 * @param username - the username to search for
	 * @return true if a post has been made to this channel by the parameter user u
	 *         false otherwise
	 * 
	 */
	public boolean hasUser(User u) {
		// To be completed
		return false;
	}
	
	/**
	 * 2 marks
	 * This method should print the name of the channel followed by 
	 * all the messages posted to the channel.
	 * 
	 * The name should be printed first then each post should be printed 
	 * on a new line.
	 * 
	 */
	public void viewChannel() {
		// To be completed
	}
	
	/**
	 * 5 marks
	 * This method should update the message of the post 
	 * with id "postId" to the parameter message.
	 * 
	 * @param id the id of the post to edit
	 * @param message the new message to save
	 * 
	 */
	public void editPost(int postId, String message) {
		// To be completed
	}
	
	/**
	 * 5 marks
	 * This method should remove the post which has an id 
	 * equal to the parameter postId from the posts ArrayList 
	 * and return the removed post.
	 * 
	 * @param id the id of the post to remove
	 * @return the post object which was removed
	 * 		   return null if no post was removed
	 */
	public Post removePost(int postId) {
		// To be completed
		return null;
	}
	
	/**
	 * 5 marks
	 * This method should add a new post to the channel.
	 * 
	 * The postID should be set to the current value of idIncr.
	 * 
	 * After the post is added you should increment idIncr by 1.
	 * 
	 * @param poster - a User object which represents the poster
	 * @param message - the message to post
	 * 
	 */
	public void addPost(User poster, String message) {
		// To be completed
	}
	
	/**
	 * 5 marks
	 * @param u - the user to search for
	 * 
	 * @return an ArrayList which contains
	 * all of the posts within the Channel that were posted
	 * by the parameter user u.
	 * 
	 */
	public ArrayList<Post> getAllPostsByUser(User u) {
		// To be completed
		return null;
	}
	
	/**
	 * 5 marks
	 * This method should search through the posts ArrayList and return
	 * an ArrayList of Post objects whose message contains the parameter term.
	 * 
	 * @param term
	 * @return an ArrayList of Post objects whose message contains the parameter term.
	 * If no Post objects are found, the method should return an empty ArrayList.
	 * 
	 */
	public ArrayList<Post> searchPosts(String term) {
		// To be completed
		return null;
	}
	

	/**
	 * 10 marks
	 * This method should count the number of unique users who have
	 * posted within the channel.
	 * 
	 * @return the number of unique users who have posted within the channel
	 */
	public int uniqueUsers() {
		// To be completed
		return -1;
	}
	
	/**
	 * 
	 * DO NOT EDIT THE BELOW CODE
	 * 
	 */
	public Channel(String name){
		posts = new ArrayList<Post>();
		this.name = name;
		idIncr=0;
	}
	public String getName() {
		return name;
	}
	public ArrayList<Post> getPosts(){
		return posts;
	}
}
