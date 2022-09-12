package com.bridgelabz.addressbookfile;

public class Contacts {
	public String firstLastName;
	public String address;
	public String city;
	public String state;
	public long zip;
	public long phoneNum;
	public String email;
	public Contacts(String firstLastName,String address,String city,String state,long zip,long phoneNum,String email) {
		this.firstLastName=firstLastName;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phoneNum=phoneNum;
		this.email=email;
	}
	public String getName() {
		return firstLastName;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public long getZip() {
		return zip;
	}
	@Override
	public String toString() {
		return "Name="+this.firstLastName+",Address="+this.address+",City="+this.city+",State="+this.state+
				",Zip="+this.zip+",Mobile Number="+this.phoneNum+",Email="+this.email;
	}

}
