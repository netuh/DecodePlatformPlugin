package br.ufpe.ines.decode.plugin.sandbox;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.ufpe.ines.decode.plugin.model.Experiment;
import br.ufpe.ines.decode.plugin.model.SourceCode;

public class GsonTest {

	public static void main(String[] args) {

		Experiment countryObj = new Experiment();
		countryObj.setId("NewExperiment2");
		countryObj.setDomain("br.ufpe.ines.decode.experiment2");
		countryObj.setLanguage("java");
		SourceCode sc = new SourceCode();
		sc.setFile("source2");
		sc.setSubPackage("pack2");
		countryObj.addSouce(sc);
		SourceCode sc2 = new SourceCode();
		sc2.setFile("source3");
		countryObj.addSouce(sc2);
		SourceCode sc3 = new SourceCode();
		sc3.setFile("source4");
		sc3.setSubPackage("pack4");
		countryObj.addSouce(sc3);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(countryObj);

		try {
			// write converted json data to a file named "CountryGSON.json"
			FileWriter writer = new FileWriter("/Users/netuh/Downloads/experiment2.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(json);

	}
}
