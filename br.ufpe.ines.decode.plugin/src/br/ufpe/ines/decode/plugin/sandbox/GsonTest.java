package br.ufpe.ines.decode.plugin.sandbox;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.ufpe.ines.decode.plugin.model.Experiment;

public class GsonTest {

	// public static void main2(String[] args) {
	// Gson gson = new Gson();
	// try {
	// System.out.println("Reading JSON from a file");
	// System.out.println("----------------------------");
	// BufferedReader br = new BufferedReader( new FileReader("E:\\file.json"));
	// //convert the json string back to object
	// Experiment countryObj = gson.fromJson(br, Country.class);
	// System.out.println("Name Of Country: "+countryObj.getName());
	// System.out.println("Population: "+countryObj.getPopulation());
	// System.out.println("States are :");
	// List<String> listOfStates = countryObj.getListOfStates();
	// for (int i = 0; i < listOfStates.size(); i++) {
	// System.out.println(listOfStates.get(i));
	// }
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	public static void main(String[] args) {

		Experiment countryObj = new Experiment();
		countryObj.setId("NewExperiment1");
		countryObj.setDomain("br.ufpe.ines.decode.experiment1");
		countryObj.setLanguage("java");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(countryObj);

		try {
			// write converted json data to a file named "CountryGSON.json"
			FileWriter writer = new FileWriter("/Users/netuh/Downloads/experiment1.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(json);

	}
}
