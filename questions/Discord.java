package questions;

import java.util.ArrayList;

public class Discord {

	ArrayList<Server> servers;
	
	/**
	 * 2 marks
	 * This method should print all servers stored within the
	 * servers ArrayList.
	 * 
	 * Hint: use viewServers
	 */
	public void viewDiscord() {
		// To be completed
	}
	
	/**
	 * 5 marks
	 * This method should search through the channels within each server
	 * and print the posts which contain the parameter String term.
	 * 
	 * @param term
	 */
	public void searchResults(String term) {
		// To be completed
	}
	
	/**
	 * 5 marks
	 * This method should print all the posts by
	 * the parameter User u throughout all servers.
	 * 
	 * Each post must be printed on a new line
	 * 
	 * @param u
	 */
	public void userPosts(User u) {
		// To be completed
	}
	
	/**
	 * 10 marks
	 * This method should remove the parameter user from all servers.
	 * It should also remove all posts made by the parameter user.
	 * 
	 * @param u
	 * @return a count of every user object and post object that was removed.
	 * 
	 */
	public int banUser(User u) {
		// To be completed
		return -1;
	}
	
	/**
	 * 10 marks
	 * This user should return an ArrayList which contains all the servers which
	 * the parameter users u1 and u2 have in common.
	 * 
	 * In other words, all the server in which u1 and u2 belong to.
	 * 
	 * @param u1
	 * @param u2
	 * @return an ArrayList of the Server objects both u1 and u2 belong to.
	 * 		   return an empty ArrayList if the users have no servers in common.
	 */
	public ArrayList<Server> serversInCommon(User u1, User u2){
		// To be completed
		return null;
	}
	
	/**
	 * 
	 * DO NOT EDIT THE BELOW CODE
	 * 
	 */
	public Discord() {
		servers = new ArrayList<Server>();
	}
	public ArrayList<Server> getServers() {
		return servers;
	}
	
	
}
