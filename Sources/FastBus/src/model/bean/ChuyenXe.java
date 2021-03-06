/**
 * @FileName	: ChuyenXe.java
 *
 * @Version		: 1.0
 *
 * @Copyright
 *
 * @Modification Logs:
 *
 * DATE				AUTHOR				DESCRIPTION
 * -------------------------------------------------
 * Sep 21, 2019			QuocLH				Create
 */

package model.bean;

public class ChuyenXe {

	private int idTrip;
	private int idBus;
	private int idBusiness;
	private String nameBusiness;
	private String startPlace;
	private String endPlace;
	private String startDate;
	private String startTime;
	private String endTime;
	private int totalTime;
	private String price;
	private int status;
	private int totalTip;

	public int getIdTrip() {
		return idTrip;
	}

	public void setIdTrip(int idTrip) {
		this.idTrip = idTrip;
	}

	public int getIdBus() {
		return idBus;
	}

	
	public int getIdBusiness() {
		return idBusiness;
	}

	public void setIdBusiness(int idBusiness) {
		this.idBusiness = idBusiness;
	}

	public void setIdBus(int idBus) {
		this.idBus = idBus;
	}

	public String getNameBusiness() {
		return nameBusiness;
	}

	public void setNameBusiness(String nameBusiness) {
		this.nameBusiness = nameBusiness;
	}

	public String getStartPlace() {
		return startPlace;
	}

	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}

	public String getEndPlace() {
		return endPlace;
	}

	public void setEndPlace(String endPlace) {
		this.endPlace = endPlace;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	public int getTotalTip() {
		return totalTip;
	}

	public void setTotalTip(int totalTip) {
		this.totalTip = totalTip;
	}

	public ChuyenXe(int idTrip, int idBus,int idBusiness, String nameBusiness, String startPlace, String endPlace, String startDate,
			String startTime, String endTime,int totalTime, String price,int status) {
		super();
		this.idTrip = idTrip;
		this.idBus = idBus;
		this.idBusiness=idBusiness;
		this.nameBusiness = nameBusiness;
		this.startPlace = startPlace;
		this.endPlace = endPlace;
		this.startDate = startDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.price = price;
		this.status=status;
		this.totalTime=totalTime;
	}
	
	
	public ChuyenXe(int idTrip, String nameBusiness, String startPlace, String endPlace, String startDate,
			String startTime, String endTime,int totalTime, String price) {
		super();
		this.idTrip = idTrip;
		this.nameBusiness = nameBusiness;
		this.startPlace = startPlace;
		this.endPlace = endPlace;
		this.startDate = startDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.price = price;
		this.totalTime=totalTime;
	}
	
	

	public ChuyenXe(int idBusiness,String nameBusiness, String startPlace, String endPlace, int totalTip) {
		super();
		this.idBusiness=idBusiness;
		this.nameBusiness = nameBusiness;
		this.startPlace = startPlace;
		this.endPlace = endPlace;
		this.totalTip = totalTip;
	}
	
	public ChuyenXe(int idBus, String startPlace, String endPlace, String startTime, String endTime, String price,
			int status) {
		super();
		this.idBus = idBus;
		this.startPlace = startPlace;
		this.endPlace = endPlace;
		this.startTime = startTime;
		this.endTime = endTime;
		this.price = price;
		this.status = status;
	}

	public ChuyenXe() {
		super();
	}

}
