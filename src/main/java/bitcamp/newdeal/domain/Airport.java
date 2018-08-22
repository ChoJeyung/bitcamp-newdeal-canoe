package bitcamp.newdeal.domain;

import java.util.Date;

public class Airport {
	protected int		airportNo;
	protected String	airportName;
	protected Date		airportEntryDate;
	protected Date		airportModifyDate;

	public int getAirportNo() {
		return airportNo;
	}

	public void setAirportNo(int airportNo) {
		this.airportNo = airportNo;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public Date getAirportEntryDate() {
		return airportEntryDate;
	}

	public void setAirportEntryDate(Date airportEntryDate) {
		this.airportEntryDate = airportEntryDate;
	}

	public Date getAirportModifyDate() {
		return airportModifyDate;
	}

	public void setAirportModifyDate(Date airportModifyDate) {
		this.airportModifyDate = airportModifyDate;
	}

	@Override
	public String toString() {
		return "Airport [airportNo=" + airportNo + ", airportName=" + airportName + ", airportEntryDate="
		        + airportEntryDate + ", airportModifyDate=" + airportModifyDate + "]";
	}
}
