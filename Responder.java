import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * Write a description of class CinemaBookingSystem here.
 *
 * Damian, Caio, Michael
 * Professor Crosbie
 * Object Oriented Programming
 * Project 4
 * May 1, 2023
 */

public class Responder
{
    // Used to map key words to responses.
    private HashMap<String, String> responseMap;
    // Default responses to use if we don't recognise a word.
    private ArrayList<String> defaultResponses;
    // The name of the file containing the default responses.
    private static final String FILE_OF_DEFAULT_RESPONSES = "default2.txt";
    
    // The name of the file containing the keys and values for the response map.
    private static final String FILE_OF_KEYS_AND_VALUES = "keyvalue.txt";
    
    private Random randomGenerator;

    /**
     * Construct a Responder
     */
    public Responder()
    {
        responseMap = new HashMap<String, String>();
        defaultResponses = new ArrayList<String>();
        fillResponseMap2(); //new method
        fillDefaultResponses2(); //new method
        randomGenerator = new Random();
    }

    /**
     * Generate a response from a given set of input words.
     * 
     * @param words  A set of words entered by the user
     * @return       A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> words)
    {
        Iterator<String> it = words.iterator();
        while(it.hasNext()) 
        {
            String word = it.next();
            String response = responseMap.get(word);
            if(response != null) 
            {
                return response;
            }
        }
        // If we get here, none of the words from the input line was recognized.
        // In this case we pick one of our default responses (what we say when
        // we cannot think of anything else to say...)
        return pickDefaultResponse();
    }

    /**
     * Enter all the known keywords and their associated responses
     * into our response map.
     */
    private void fillResponseMap()
    {
        responseMap.put("showing", 
                        "As of May 1, 2023 our movie listing are.... /n" +
                        "Object Oriented Programming The Movie /n"+ "Nightmare on Criosbie's Street");
        
        responseMap.put("time", 
                        "Object Oriented Programming The Movie /n5:00PM.-6:30PM. /n7:00PM.-8:30PM. /n9:00PM.-10:30PM"
                        + "/nNightmare on Criosbie's Street /n1:00PM.-2:30PM. /n3:00Pm.-4:30PM.");
                        
        responseMap.put("Object", 
                        "Title: Object Oriented Programming The Movie /nRated: PG /nLength: 1 hour and 35 minutes.");
                        
        responseMap.put("Nightmare", 
                        "Title: Nightmare on Criosbie's Street /nRated: R /nLength: 1 hour and 42 minutes.");
    }
    
    private void fillResponseMap2()
    {
        // for reference in populating a map:
        responseMap.put("showing", 
                        "As of May 1, 2023 our movie listing are...." + "\n------------------------------------" +
                        "\n1.)Nightmare on Criosbie's Street" + "\n2.)Object Oriented Programming The Movie"
                        + "\n\nType 'object' or 'nightmare' for more info on movies");
                        
        responseMap.put("time", 
                        "Object Oriented Programming The Movie" + "\n5:00PM.-6:30PM." + "\n7:00PM.-8:30PM." 
                        + "\n9:00PM.-10:30PM"
                        + "\nNightmare on Criosbie's Street" + "\n1:00PM.-2:30PM." + "\n3:00Pm.-4:30PM.");
                        
        responseMap.put("object", 
                        "Title: Object Oriented Programming The Movie \nRated: PG \nLength: 1 hour and 35 minutes.");
                        
        responseMap.put("nightmare", 
                        "Title: Nightmare on Criosbie's Street \nRated: R \nLength: 1 hour and 42 minutes.");
        
        Charset charset = Charset.forName("US-ASCII");
        Path path = Paths.get(FILE_OF_KEYS_AND_VALUES);
        try (Stream<String> stringStream = Files.lines(path, charset))
        {
            // convert the Stream of lines into a List
            ArrayList<String> dataFromFile = new ArrayList<String>(stringStream.collect(Collectors.toList()));
            
            // the population procedure depends on the list ending with an empty String
            // but the Stream would have eliminated any empty String line at the
            // end of the file. Therefore, make sure the list ends with an empty String
            dataFromFile.add("");
            
            // create an Iterator
            Iterator<String> it = dataFromFile.iterator();
            
            // initialize a newValue variable to the empty String
            String newValue = "";
            
            // initialize a keyList variable to hold key Strings
            List<String> keyList = new ArrayList<String>();
            
            // initialize a flag variable to aid in the iteration process
            boolean gotKeys = false;
            
            while(it.hasNext())
            {
                String text = it.next();
                
                if(!gotKeys)    // we are at a key element
                {
                    // separate the string into individual values, using the comma
                    // as the delimeter
                    String keyArray[] = text.split(",");
                    
                    // convert the array to an ArrayList
                    keyList = Arrays.asList(keyArray);
                    
                    // set the flag
                    gotKeys = true;
                }
                
                else        // we are not at a key element
                {
                    if(!text.equals(""))    // the element is NOT the empty String
                    {
                        // concatenete the next list element to the newValue String
                        newValue += text + "\n";
                    }
                    else        // the element IS the empty String
                    {
                        // make sure the newValue String isn't empty
                        if(newValue.length() > 0)
                        {
                            // add the value to the responseMap for each key in 
                            // the keyList, trimming any whitespace from the
                            // key(s) and the value
                            for(String key : keyList)
                            {
                                responseMap.put(key.trim(), newValue.trim());
                            }
                        }
                        
                        // reset the newValue String to empty
                        newValue = "";
                        
                        // reset the flag
                        gotKeys = false;
                    }
                }
            }
        }
        catch(FileNotFoundException e) 
        {
            System.err.println("Cannot open " + FILE_OF_KEYS_AND_VALUES);
        }
        catch(IOException e) 
        {
            System.err.println("Cannot read " +
                               FILE_OF_KEYS_AND_VALUES);
        }
    }
    
    /**
     * Build up a list of default responses from which we can pick
     * if we don't know what else to say.
     * 
     * This is the original version of the method written by Barnes and Kölling.
     * It is here for reference.
     */
    private void fillDefaultResponses()
    {
        Charset charset = Charset.forName("US-ASCII");
        Path path = Paths.get(FILE_OF_DEFAULT_RESPONSES);
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) 
        {
            String response = reader.readLine();
            while(response != null) 
            {
                defaultResponses.add(response);
                response = reader.readLine();
            }
        }
        catch(FileNotFoundException e) 
        {
            System.err.println("Cannot open " + FILE_OF_DEFAULT_RESPONSES);
        }
        catch(IOException e) 
        {
            System.err.println("Cannot read " +
                               FILE_OF_DEFAULT_RESPONSES);
        }
        // Make sure we have at least one response.
        if(defaultResponses.size() == 0) 
        {
            defaultResponses.add("Please elaborate?");
        }
    }
    
    /**
     * Build up a list of default responses from which we can pick
     * if we don't know what else to say.
     * This method parses an input text file in which responses are 
     * separated by a blank line in the file. A single response may 
     * take up multiple lines in the file.
     */
    private void fillDefaultResponses2()
    {
        Charset charset = Charset.forName("US-ASCII");
        Path path = Paths.get(FILE_OF_DEFAULT_RESPONSES);
        
        try (Stream<String> stringStream = Files.lines(path, charset))
        {
            // convert the Stream of lines into a List
            ArrayList<String> dataFromFile = new ArrayList<String>(
                stringStream.collect(Collectors.toList()));
            
            // the population procedure depends on the list ending with an empty String
            // but the Stream would have eliminated any empty String line at the
            // end of the file. Therefore, make sure the list ends with an empty String
            dataFromFile.add("");
            
            // create an Iterator
            Iterator<String> it = dataFromFile.iterator();
            
            // initialize a newResponse variable to the empty String
            String newResponse = "";
            
            while(it.hasNext())
            {
                String text = it.next();
                if(!text.equals(""))    // the next list element IS NOT the empty String
                {
                    // concatenate the next list element to the newResponse String
                    newResponse += text + " ";
                }
                else    // the next list element IS the empty String
                {
                    // this is where the method depends on the list ending with
                    // the empty String
                    // make sure the newResponse String isn't empty
                    if(newResponse.length() > 0)
                    {
                        // trim any trailing whitespace from the local String
                        // and add the local String to defaultResponses
                        defaultResponses.add(newResponse.trim());
                    }
                    
                    // reset the newResponse String to empty
                    newResponse = "";
                    
                    // move the pointer to the next element in the list
                    // the nature of the while loop handles this movement
                }
            }
        }
        catch(FileNotFoundException e) 
        {
            System.err.println("Cannot open " + FILE_OF_DEFAULT_RESPONSES);
        }
        catch(IOException e) {
            System.err.println("Cannot read " +
                               FILE_OF_DEFAULT_RESPONSES);
        }
        // Make sure we have at least one response.
        if(defaultResponses.size() == 0) 
        {
            defaultResponses.add("Please Elaborate?");
        }
    }
    
    /**
     * Build up a list of default responses from which we can pick
     * if we don't know what else to say.
     * This method explores the use of streams and lambdas and is not 
     * properly functional. It remains here for future code exploration
     * and debugging.
     */
    private void fillDefaultResponsesLambdaVersion()
    {
        Charset charset = Charset.forName("US-ASCII");
        Path path = Paths.get(FILE_OF_DEFAULT_RESPONSES);
        
        try (Stream<String> responseStream = Files.lines(path, charset))
        {
            responseStream.forEach(
                (response) -> 
                {
                    String nextResponse = new String("");
                    if(!response.equals(""))
                    {
                        nextResponse += response + " ";
                    }
                    if(!nextResponse.equals(""))
                    {
                        if(!nextResponse.equals(null))
                        {
                            defaultResponses.add(nextResponse);
                        }
                    }
                    nextResponse = "";
                }
            );
            // the arrayList should now have all the responses from the file
            // this works for single line responses only
            // I will explore this more in my own time where there isn't the pressure
            // to make a deadline
        }
        catch(FileNotFoundException e) 
        {
            System.err.println("Cannot open " + FILE_OF_DEFAULT_RESPONSES);
        }
        catch(IOException e) 
        {
            System.err.println("Cannot read " +
                               FILE_OF_DEFAULT_RESPONSES);
        }
        // Make sure we have at least one response.
        if(defaultResponses.size() == 0) 
        {
            defaultResponses.add("Please Elaborate?");
        }
    }

    /**
     * Randomly select and return one of the default responses.
     * @return     A random default response
     */
    
     private String pickDefaultResponse()
    {
        // Pick a random number for the index in the default response list.
        // The number will be between 0 (inclusive) and the size of the list (exclusive).
        int index = randomGenerator.nextInt(defaultResponses.size());
        return defaultResponses.get(index);
    }

}