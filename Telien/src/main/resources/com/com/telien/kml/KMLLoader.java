package com.telien.kml;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.commons.io.IOUtils;

public class KMLLoader {
		
		String filePath;
		
		public KMLLoader(String filePath){
			this.filePath= filePath;
		}
		
		public String loadFileFromDisk(){
			System.out.println("Loading File From Disk.");
			if(filePath.endsWith(".kml")){
				System.out.println("File is of KML Format");
				return readKML();
			}
			else if(filePath.endsWith(".kmz")){
				System.out.println("File is of KMZ Format");
				return readKMZ();
			}
			return "ERROR";
		}
		
		private String readKML(){
			BufferedReader br = null; 
			try {
				String sCurrentLine;
				String output="";
				br = new BufferedReader(new FileReader(filePath));
				while ((sCurrentLine = br.readLine()) != null) {
					output+=sCurrentLine;
				}
	 
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
					return "Error Loading KML";
				}
			}
			return "ERROR";
		}
		
		public String readKMZ(){
	    	try {
				ZipFile zipFile = new ZipFile(filePath);
			    Enumeration<? extends ZipEntry> entries = zipFile.entries();
			    while(entries.hasMoreElements()){
			        ZipEntry entry = entries.nextElement();
					System.out.println("Zip Entry"+entry.getName());
			        if (entry.getName().startsWith("Directions") && entry.getName().endsWith(".kml")){
			        	System.out.println("Loading KML File"+entry.getName());
			        	InputStream stream = zipFile.getInputStream(entry);
			        	StringWriter writer = new StringWriter();
			        	IOUtils.copy(stream, writer, "UTF-8");
			        	String output = writer.toString();
			        	System.out.println("Loaded File:"+output);
			        	return output;
			        }
			    }
			} catch (IOException e) {
				e.printStackTrace();
				 return "ERROR";
			}
	    	
	    	return "ERROR";
		}
		
		public String loadFileFromUrl(){
			URL url;
			try {
					url = new URL(filePath);
				BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
				String inputLine;
				String output="";
				while ((inputLine = in.readLine()) != null){
					output+=(inputLine);
			    }
			        in.close();
			        
			    return output;
			    
			} catch (Exception e) {
				e.printStackTrace();
				return "ERROR";
			}
		}
}
