package com.bridgelabz.util;

import java.util.Date;

public class Appointment {
	static Integer didappointment;
	static Date date;
	//constructor
	public Appointment(int did,Date date)
	{ 
		Appointment.didappointment=did;
		Appointment.date=date;
	}
	//getter and setter methods
	public int getDid() 
	{
		return didappointment;
	}
	public void setDid(int did) 
	{
		this.didappointment = did;
	}

	public Date getDate() 
	{
		return date;
	}
	public void setDate(Date date) 
	{
		this.date = date;
	}

	public String toString() 
	{
		return "Appointment [did=" + didappointment + ", date=" + date +  "]";
	}

	public int hashCode()
	{
    	return this.didappointment.hashCode()+this.date.hashCode();
	}
	//checking for equality
	public boolean equals(Object object)
	{
    	if (object == null) 
			return false;
    	if (object == this) 
			return true;
    	if (!(object instanceof Appointment))
			return false;
    	
    	Appointment dA = (Appointment) object;

		if((this.didappointment==dA.didappointment) && (this.date.equals(dA.date)))
			return true;
		else
			return false;
	}
}

