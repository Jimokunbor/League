/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package league;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jimok
 */
public class Main {
public static void main(String[] args) throws FileNotFoundException {
    
    // // Create a list to store all the person's information
    List personList = new ArrayList<>();
    
    // Read the text file and load all the data onto memory
    
    try {
        File file = new File("MOCK_DATA.csv"); // Create a file object
        Scanner scanner = new Scanner(file); // Create a scanner object to read the file
        
        // Loop through each line in the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine(); // Read the line
            String[] data = line.split(","); // Split the line by comma
            
            // Create a person object with the data from the line
            Person person = new Person(Integer.parseInt(data[0]), data[1], data[2], data[3]);
            
            // Add the person object to the personList
            personList.add(person);
        }
        scanner.close(); // Close the scanner
        } catch (FileNotFoundException e) {
            System.out.println("File not found!"); // Print error message if file is not found


    }
    // Create a map to store league names and their members
    Map> leagueMap = new HashMap<>();
    
    // Create a list to store all the league names
     List leagueNames = new ArrayList<String>();
     
     // Loop through each leagues name in the enum
     for (LeagueNames leagueName : LeagueNames.values()) {
         leagueNames.add(leagueName.toString()); // Add the league name to the leagueNames list

     }
     // Shuffle the personList to randomize the order
      Collections.shuffle(personList);
      
      // Loop through each person in the personList
      for (Object person : personList) {
          
          // Check if the leagueMap already contains 20 leagues
          if (leagueMap.size() == 20) {
              break; // If yes, break out of the loop

          }
          
          // Generate a random number between 0 and 19
          Random random = new Random();
          int index = random.nextInt(20);
          
          // Check if the Names list is empty
          if (leagueNames.isEmpty()) {
              break; // If yes, break out of the loop
          }
          
          // Get the league name at the generated index
          Object leagueName = leagueNames.get(index);
          
          // Check if the leagueMap already contains the league name
          if (leagueMap.containsKey(leagueName)) {
              continue; // If yes, continue to the next iteration
          }
          
          // Create a list to store the league members
          List leagueMembers = new ArrayList<String>();
          
          // Add the person's first name and last name to the leagueMembers list
          leagueMembers.add(person.getFirstName() + " " + person.getLastName());
          
          // Add the league name and league members to the leagueMap
          leagueMap.put(leagueName, leagueMembers);
          
          // Remove the league name from the leagueNames list
          leagueNames.remove(index);

      }
      // Create a list to store all the leagues
      List leagueList = new ArrayList<>();

      // Loop through each league name and members in the leagueMap
      for (Map.Entry> entry : leagueMap.entrySet()) {
    
    // Create a league object with the league name and members
    League league = new League(entry.getKey(), entry.getValue());
    
    // Add the league object to the leagueList
    leagueList.add(league);
    }
     // Print each league (name and members) to the console
     for (League league : leagueList) {
         league.printLeague();
     }
  }
}
