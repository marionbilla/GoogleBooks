
package javaapplication5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class JavaApplication5 {
    public static void main(String[] args) throws IOException {

	HashMap<Integer, Integer> hash = new HashMap<>();

	// Load this text file.
	BufferedReader reader = new BufferedReader(new FileReader(
		"google-books-common-words.txt"));
       
        
	while (true) {
	    String line = reader.readLine();
	    if (line == null) {
		break;
             
	    }
	    for (int i = 0; i < line.length(); i++) {
		char c = line.charAt(i);              
		if (c!=' ') {
		    // Increment existing value in HashMap.
		    // ... Start with zero if no key exists.
		    int value = hash.get(c);
		    hash.put((int)c, value+1);
		}
	    }
	}

	// Close object.
	reader.close();

	// Display values of all keys.
	for (int key : hash.keySet()) {
	    System.out.println((char) key + ": " + hash.get(key));
	}
    }
}