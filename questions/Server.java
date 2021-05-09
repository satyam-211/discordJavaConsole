package questions;

import java.util.ArrayList;

public class Server {
	ArrayList<Channel> channels;
	ArrayList<User> users;
	String name;
	
	/**
	 * 2 marks
	 * @param username - the username to search for
	 * @return true if the user has posted within any of the Channel objects 
	 * 		   in the channels ArrayList.
	 *         return false otherwise.
	 * 
	 */
	public boolean hasPosted(User u) {
		// To be completed
		return false;
	}
	
	/**
	 * 2 marks
	 * This method should print the server name followed by all of the channels
	 * within the server and their messages.
	 * 
	 * Hint: use viewChannel
	 */
	public void viewServer() {
		// To be completed
	}
	
	/**
	 * 
	 * @param u - the user to search for
	 * 
	 * @return an ArrayList which contains
	 * all of the posts within the Servers Channel objects that were posted
	 * by the parameter user u.
	 * 
	 */
	public ArrayList<Post> getAllPostsByUser(User u) {
		// To be completed
		return null;
	}
	
	/**
	 * 
	 * This method should delete all Posts made by the parameter
	 * user u throughout the Server. The method should then
	 * return the number of posts that were removed.
	 * 
	 * @param u
	 * @return the number of posts removed.
	 */
	public int deletePostsByUser(User u) {
		// To be completed
		return -1;
	}
	
	/**
	 * This method should return the Channel object
	 * in the ArrayList channels which has the most Posts.
	 * @return
	 */
	public Channel getChannelMostPosts() {
		// To be completed
		return null;
	}
	
	/**
	 * This method should return the Channel object
	 * in the ArrayList channels which has the most unique Users.
	 * @return
	 */
	public Channel getChannelMostUsers() {
		// To be completed
		return null;
	}
	/**
	 * 
	 * DO NOT EDIT THE BELOW CODE
	 * 
	 */
	public Server(String name) {
		this.name = name;
		channels = new ArrayList<Channel>();
		users = new ArrayList<User>();
	}
	public ArrayList<Channel> getChannels() {
		return channels;
	}
	public ArrayList<User> getUsers() {
		return users;
	}
	public String getName() {
		return name;
	}
	
}
