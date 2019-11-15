package com.sonder.interview;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

import com.google.gson.Gson;

public class App {
	
	public static void main(String args[]) {
		Gson gson = new Gson();
        // Replace the name with the actual path on your file system		
        try (Reader reader = new FileReader("/Users/sonder/eclipse-workspace/interview/src/main/resources/sample.json")) {

            // Convert JSON File to Java Object
        	Type listType = new TypeToken<List<Sample>>() {}.getType();
            List<Sample> sample = gson.fromJson(reader, listType);
			
			// print sample 
            System.out.println(sample);
            
            //convert Java object to json string

            Sample sampleOne = createSampleObject();
            String json = gson.toJson(sampleOne);
            System.out.println(json);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
	
	private static Sample createSampleObject() {

		Sample sample = new Sample();
		sample.setName("Foobar");
		sample.setAge(35);
		sample.setPosition(new String[] { "SWE", "Architect", "Designer" });
		sample.setSkills(Arrays.asList("java", "python", "ruby", "kotlin"));
		return sample;

	}
}
