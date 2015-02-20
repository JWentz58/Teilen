package com.telien.kml;

public class KMLLoadTest {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Jacob\\workspace\\SENG691Z\\KML_Project\\Telien\\Test Data\\KMZ2.kmz";
		KMLLoader loader = new KMLLoader(filePath);
		String output = loader.loadFileFromDisk();
		System.out.println(output);
		KMLParser parser = new KMLParser(output);
		parser.loadPoints();
	}

}
