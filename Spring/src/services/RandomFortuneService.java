package services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneServices{
	private Random rnd = new Random();
	private String textUri = "C:\\Users\\Adam\\eclipse-workspace\\Spring\\src\\files\\fortunes";
	private List<String> fortunes;
	private File theFile = new File(textUri);
	
	
	public RandomFortuneService(){
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("The file exists: " + theFile.exists());
		
		fortunes = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				fortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	@Override
	public String getFortune() {
		return fortunes.get(rnd.nextInt(fortunes.size()));
	}
	

}
