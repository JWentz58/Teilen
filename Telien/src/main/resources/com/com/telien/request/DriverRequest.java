package com.telien.request;
import java.util.Date;
import java.util.UUID;

import de.micromata.opengis.kml.v_2_2_0.Coordinate;

public class DriverRequest extends Request {
	String kmlPath;
	Coordinate startCord;
	Coordinate endCord; 
	int searchMileRadius;
	int endMileRadius;
	int passanagerCount;
	Date startTime;
	Date endTime;


	DriverRequest(String userUUID,String kmlPath,
			Coordinate startCord,Coordinate endCord,int searchMileRadius, 
			int endMileRadius,int passanagerCount,Date startTime,Date endTime){
		requestUUID=UUID.randomUUID().toString();;
		this.kmlPath=kmlPath;
		this.startCord=startCord;
		this.endCord=endCord; 
		this.userUUID=userUUID;
		this.searchMileRadius=searchMileRadius;
		this.endMileRadius=endMileRadius;
		this.passanagerCount=passanagerCount;
		this.startTime=startTime;
		this.endTime=endTime;
		this.activeFlag=true;	
	}


	public String getRequestUUID() {
		return requestUUID;
	}


	public void setRequestUUID(String requestUUID) {
		this.requestUUID = requestUUID;
	}


	public String getKmlPath() {
		return kmlPath;
	}


	public void setKmlPath(String kmlPath) {
		this.kmlPath = kmlPath;
	}


	public Coordinate getStartCord() {
		return startCord;
	}


	public void setStartCord(Coordinate startCord) {
		this.startCord = startCord;
	}


	public Coordinate getEndCord() {
		return endCord;
	}


	public void setEndCord(Coordinate endCord) {
		this.endCord = endCord;
	}


	public String getUserUUID() {
		return userUUID;
	}


	public void setUserUUID(String userUUID) {
		this.userUUID = userUUID;
	}


	public int getSearchMileRadius() {
		return searchMileRadius;
	}


	public void setSearchMileRadius(int searchMileRadius) {
		this.searchMileRadius = searchMileRadius;
	}


	public int getEndMileRadius() {
		return endMileRadius;
	}


	public void setEndMileRadius(int endMileRadius) {
		this.endMileRadius = endMileRadius;
	}


	public int getPassanagerCount() {
		return passanagerCount;
	}


	public void setPassanagerCount(int passanagerCount) {
		this.passanagerCount = passanagerCount;
	}


	public Date getStartTime() {
		return startTime;
	}


	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	public Date getEndTime() {
		return endTime;
	}


	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	public boolean isActiveFlag() {
		return activeFlag;
	}


	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	
}
