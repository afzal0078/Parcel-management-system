package com.parcelmanagesystem.bean;

/**
 * 
 * @author 2733488
 *	Booking Class 
 */
public class Booking {
	private long bookingid;
	private String recName;
	private String recAddressLine1;
	private String recAddressLine2;
	private String recLandmark;
	private String recCity;
	private String recStateProvienceRegion;
	private String recPinPostalCode;
	private String recCountry;
	private String recMobileNumber;
	private double parWeight;
	private String parContentsDescription;
	private String parDeliveryType;
	private String parPackingPreference;
	private String parPickupTime;
	private String parDropoffTime;
	private double parServiceCost;
	private String parPaymentTime;
	private String parStatus;
	private String userid;
	private String bookingtime;
	private String updatetime;
	
	public Booking() {
		super();
	}

	public Booking(long bookingid,String recName, String recAddressLine1, String recAddressLine2, String recLandmark, String recCity,
			String recStateProvienceRegion, String recPinPostalCode, String recCountry, String recMobileNumber,
			double parWeight, String parContentsDescription, String parDeliveryType, String parPackingPreference,
			String parPickupTime, String parDropoffTime, double parServiceCost, String parPaymentTime, String parStatus,
			String userid, String bookingtime, String updatetime) {
		super();
		this.bookingid = bookingid;
		this.recName = recName;
		this.recAddressLine1 = recAddressLine1;
		this.recAddressLine2 = recAddressLine2;
		this.recLandmark = recLandmark;
		this.recCity = recCity;
		this.recStateProvienceRegion = recStateProvienceRegion;
		this.recPinPostalCode = recPinPostalCode;
		this.recCountry = recCountry;
		this.recMobileNumber = recMobileNumber;
		this.parWeight = parWeight;
		this.parContentsDescription = parContentsDescription;
		this.parDeliveryType = parDeliveryType;
		this.parPackingPreference = parPackingPreference;
		this.parPickupTime = parPickupTime;
		this.parDropoffTime = parDropoffTime;
		this.parServiceCost = parServiceCost;
		this.parPaymentTime = parPaymentTime;
		this.parStatus = parStatus;
		this.userid = userid;
		this.bookingtime = bookingtime;
		this.updatetime = updatetime;
	}

	public long getBookingid() {
		return bookingid;
	}

	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}
	
	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public String getRecAddressLine1() {
		return recAddressLine1;
	}

	public void setRecAddressLine1(String recAddressLine1) {
		this.recAddressLine1 = recAddressLine1;
	}

	public String getRecAddressLine2() {
		return recAddressLine2;
	}

	public void setRecAddressLine2(String recAddressLine2) {
		this.recAddressLine2 = recAddressLine2;
	}

	public String getRecLandmark() {
		return recLandmark;
	}

	public void setRecLandmark(String recLandmark) {
		this.recLandmark = recLandmark;
	}

	public String getRecCity() {
		return recCity;
	}

	public void setRecCity(String recCity) {
		this.recCity = recCity;
	}

	public String getRecStateProvienceRegion() {
		return recStateProvienceRegion;
	}

	public void setRecStateProvienceRegion(String recStateProvienceRegion) {
		this.recStateProvienceRegion = recStateProvienceRegion;
	}

	public String getRecPinPostalCode() {
		return recPinPostalCode;
	}

	public void setRecPinPostalCode(String recPinPostalCode) {
		this.recPinPostalCode = recPinPostalCode;
	}

	public String getRecCountry() {
		return recCountry;
	}

	public void setRecCountry(String recCountry) {
		this.recCountry = recCountry;
	}

	public String getRecMobileNumber() {
		return recMobileNumber;
	}

	public void setRecMobileNumber(String recMobileNumber) {
		this.recMobileNumber = recMobileNumber;
	}

	public double getParWeight() {
		return parWeight;
	}

	public void setParWeight(double parWeight) {
		this.parWeight = parWeight;
	}

	public String getParContentsDescription() {
		return parContentsDescription;
	}

	public void setParContentsDescription(String parContentsDescription) {
		this.parContentsDescription = parContentsDescription;
	}

	public String getParDeliveryType() {
		return parDeliveryType;
	}

	public void setParDeliveryType(String parDeliveryType) {
		this.parDeliveryType = parDeliveryType;
	}

	public String getParPackingPreference() {
		return parPackingPreference;
	}

	public void setParPackingPreference(String parPackingPreference) {
		this.parPackingPreference = parPackingPreference;
	}

	public String getParPickupTime() {
		return parPickupTime;
	}

	public void setParPickupTime(String parPickupTime) {
		this.parPickupTime = parPickupTime;
	}

	public String getParDropoffTime() {
		return parDropoffTime;
	}

	public void setParDropoffTime(String parDropoffTime) {
		this.parDropoffTime = parDropoffTime;
	}

	public double getParServiceCost() {
		return parServiceCost;
	}

	public void setParServiceCost(double parServiceCost) {
		this.parServiceCost = parServiceCost;
	}

	public String getParPaymentTime() {
		return parPaymentTime;
	}

	public void setParPaymentTime(String parPaymentTime) {
		this.parPaymentTime = parPaymentTime;
	}

	public String getParStatus() {
		return parStatus;
	}

	public void setParStatus(String parStatus) {
		this.parStatus = parStatus;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getBookingtime() {
		return bookingtime;
	}

	public void setBookingtime(String bookingtime) {
		this.bookingtime = bookingtime;
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", recName=" + recName + ", recAddressLine1=" + recAddressLine1
				+ ", recAddressLine2=" + recAddressLine2 + ", recLandmark=" + recLandmark + ", recCity=" + recCity
				+ ", recStateProvienceRegion=" + recStateProvienceRegion + ", recPinPostalCode=" + recPinPostalCode
				+ ", recCountry=" + recCountry + ", recMobileNumber=" + recMobileNumber + ", parWeight=" + parWeight
				+ ", parContentsDescription=" + parContentsDescription + ", parDeliveryType=" + parDeliveryType
				+ ", parPackingPreference=" + parPackingPreference + ", parPickupTime=" + parPickupTime
				+ ", parDropoffTime=" + parDropoffTime + ", parServiceCost=" + parServiceCost + ", parPaymentTime="
				+ parPaymentTime + ", parStatus=" + parStatus + ", userid=" + userid + ", bookingtime=" + bookingtime
				+ ", updatetime=" + updatetime + "]";
	}

	
	
	
}
