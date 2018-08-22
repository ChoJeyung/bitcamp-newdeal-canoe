package bitcamp.newdeal.canoe.domain;

import java.util.Date;

public class Travel {
	protected int	travelNo;
	protected int	startAirportNo;
	protected int	arriveAirportNo;
	protected Date	startTravelTime;
	protected Date	arriveTravelTime;
	protected int	seatClass;
	protected int	price;
	protected Date	travelEntryDate;
	protected Date	travelModifyDate;
	protected int	seatQuantity;

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

	public int getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(int seatClass) {
		this.seatClass = seatClass;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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

	public int getSeatQuantity() {
		return seatQuantity;
	}

	public void setSeatQuantity(int seatQuantity) {
		this.seatQuantity = seatQuantity;
	}

	@Override
	public String toString() {
		return "Travel [travelNo=" + travelNo + ", startAirportNo=" + startAirportNo + ", arriveAirportNo="
		        + arriveAirportNo + ", startTravelTime=" + startTravelTime + ", arriveTravelTime=" + arriveTravelTime
		        + ", seatClass=" + seatClass + ", price=" + price + ", travelEntryDate=" + travelEntryDate
		        + ", travelModifyDate=" + travelModifyDate + ", seatQuantity=" + seatQuantity + "]";
	}
}
