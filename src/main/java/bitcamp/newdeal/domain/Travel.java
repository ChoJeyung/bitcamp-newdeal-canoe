package bitcamp.newdeal.domain;

import java.util.Date;

public class Travel {
	protected int		travelNo;
	protected int		startAirportNo;
	protected int		arriveAirportNo;
	protected String	startAirportName;
	protected String	arriveAirportName;
	protected Date		startTravelTime;
	protected Date		arriveTravelTime;
	protected Date		travelEntryDate;
	protected Date		travelModifyDate;

	public int getTravelNo() {
		return travelNo;
	}

	public void setTravelNo(int travelNo) {
		this.travelNo = travelNo;
	}

	public int getStartAirportNo() {
		return startAirportNo;
	}

	public void setStartAirportNo(int startAirportNo) {
		this.startAirportNo = startAirportNo;
	}

	public int getArriveAirportNo() {
		return arriveAirportNo;
	}

	public void setArriveAirportNo(int arriveAirportNo) {
		this.arriveAirportNo = arriveAirportNo;
	}

	public String getStartAirportName() {
		return startAirportName;
	}

	public void setStartAirportName(String startAirportName) {
		this.startAirportName = startAirportName;
	}

	public String getArriveAirportName() {
		return arriveAirportName;
	}

	public void setArriveAirportName(String arriveAirportName) {
		this.arriveAirportName = arriveAirportName;
	}

	public Date getStartTravelTime() {
		return startTravelTime;
	}

	public void setStartTravelTime(Date startTravelTime) {
		this.startTravelTime = startTravelTime;
	}

	public Date getArriveTravelTime() {
		return arriveTravelTime;
	}

	public void setArriveTravelTime(Date arriveTravelTime) {
		this.arriveTravelTime = arriveTravelTime;
	}

	public Date getTravelEntryDate() {
		return travelEntryDate;
	}

	public void setTravelEntryDate(Date travelEntryDate) {
		this.travelEntryDate = travelEntryDate;
	}

	public Date getTravelModifyDate() {
		return travelModifyDate;
	}

	public void setTravelModifyDate(Date travelModifyDate) {
		this.travelModifyDate = travelModifyDate;
	}

	@Override
	public String toString() {
		return "Travel [travelNo=" + travelNo + ", startAirportNo=" + startAirportNo + ", arriveAirportNo="
		        + arriveAirportNo + ", startAirportName=" + startAirportName + ", arriveAirportName="
		        + arriveAirportName + ", startTravelTime=" + startTravelTime + ", arriveTravelTime=" + arriveTravelTime
		        + ", travelEntryDate=" + travelEntryDate + ", travelModifyDate=" + travelModifyDate + "]";
	}
}
