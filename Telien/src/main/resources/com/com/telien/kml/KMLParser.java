package com.telien.kml;

import java.util.ArrayList;
import java.util.List;

import de.micromata.opengis.kml.v_2_2_0.Boundary;
import de.micromata.opengis.kml.v_2_2_0.Coordinate;
import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Feature;
import de.micromata.opengis.kml.v_2_2_0.Geometry;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.LinearRing;
import de.micromata.opengis.kml.v_2_2_0.Placemark;
import de.micromata.opengis.kml.v_2_2_0.Point;
import de.micromata.opengis.kml.v_2_2_0.Polygon;

public class KMLParser {

	Kml kml;
	String kmlContent;
	public KMLParser(String kmlContent){
		this.kmlContent = kmlContent;
	}
	
	
	public void loadPoints(){
		this.kml = Kml.unmarshal(kmlContent);
		System.out.println("KML FILE:"+kml.toString());
		Feature feature = kml.getFeature();
		System.out.println("Feature:"+feature.toString());
		parseFeature(feature);
	}
	
	private void parseFeature(Feature feature) {
	    if(feature != null) {
	        if(feature instanceof Document) {
	            Document document = (Document) feature;
	            List<Feature> featureList = document.getFeature();
	            for(Feature documentFeature : featureList) {
	                if(documentFeature instanceof Placemark) {
	                	System.out.println("PL Found");
	                    Placemark placemark = (Placemark) documentFeature;
	                    Geometry geometry = placemark.getGeometry();
	                    String urlStyle = placemark.getStyleUrl();
	                    System.out.println("urlStyle:"+urlStyle);
	                    parseGeometry(geometry);
	                }
	            }
	        }
	    }
	}
	
	private void parseGeometry(Geometry geometry) {
	    if(geometry != null) {
	        if(geometry instanceof Polygon) {
	            Polygon polygon = (Polygon) geometry;
	            Boundary outerBoundaryIs = polygon.getOuterBoundaryIs();
	            if(outerBoundaryIs != null) {
	                LinearRing linearRing = outerBoundaryIs.getLinearRing();
	                if(linearRing != null) {
	                    List<Coordinate> coordinates = linearRing.getCoordinates();
	                    if(coordinates != null) {
	                        for(Coordinate coordinate : coordinates) {
	                            parseCoordinate(coordinate);
	                        }
	                    }
	                }
	            }
	        }
	        if(geometry instanceof Point){
	        	Point point = (Point) geometry;
	        	List<Coordinate> coordinates = point.getCoordinates();
	        	for(Coordinate cord : coordinates)
	        		parseCoordinate(cord);
	        }
	    }
	}
	
	private void parseCoordinate(Coordinate coordinate) {
	    if(coordinate != null) {
	        System.out.println("Longitude: " +  coordinate.getLongitude());
	        System.out.println("Latitude : " +  coordinate.getLatitude());
	        System.out.println("Altitude : " +  coordinate.getAltitude());
	        System.out.println("");
	    }
	}
	
}
