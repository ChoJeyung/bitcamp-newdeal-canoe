package bitcamp.newdeal.domain;

public class Grade {
	protected int	travelNo;
	protected int	seatClass;
	protected int	price;
	protected int	seatQnt;

	public int getTravelNo() {
		return travelNo;
	}

	public void setTravelNo(int travelNo) {
		this.travelNo = travelNo;
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

	public int getSeatQnt() {
		return seatQnt;
	}

	public void setSeatQnt(int seatQnt) {
		this.seatQnt = seatQnt;
	}

	@Override
	public String toString() {
		return "Grade [travelNo=" + travelNo + ", seatClass=" + seatClass + ", price=" + price + ", seatQnt=" + seatQnt
		        + "]";
	}
}
