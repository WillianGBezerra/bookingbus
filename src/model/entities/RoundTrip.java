package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Timer;

public class RoundTrip implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date departureDate;
	private Timer departureHour;
	private Date returnDate;
	private Bus bus;
	private Integer busCapacity;
	private BusDriver busDriver;
	private City destinyCity;
	
	public RoundTrip() {
		
	}

	public RoundTrip(Integer id, Date departureDate, Timer departureHour, Date returnDate, Bus bus, Integer busCapacity,
			BusDriver busDriver, City destinyCity) {
		super();
		this.id = id;
		this.departureDate = departureDate;
		this.departureHour = departureHour;
		this.returnDate = returnDate;
		this.bus = bus;
		this.busCapacity = busCapacity;
		this.busDriver = busDriver;
		this.destinyCity = destinyCity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Timer getDepartureHour() {
		return departureHour;
	}

	public void setDepartureHour(Timer departureHour) {
		this.departureHour = departureHour;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Integer getBusCapacity() {
		return busCapacity;
	}

	public void setBusCapacity(Integer busCapacity) {
		this.busCapacity = busCapacity;
	}

	public BusDriver getBusDriver() {
		return busDriver;
	}

	public void setBusDriver(BusDriver busDriver) {
		this.busDriver = busDriver;
	}

	public City getDestinyCity() {
		return destinyCity;
	}

	public void setDestinyCity(City destinyCity) {
		this.destinyCity = destinyCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoundTrip other = (RoundTrip) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RoundTrip [id=");
		builder.append(id);
		builder.append(", departureDate=");
		builder.append(departureDate);
		builder.append(", departureHour=");
		builder.append(departureHour);
		builder.append(", returnDate=");
		builder.append(returnDate);
		builder.append(", bus=");
		builder.append(bus);
		builder.append(", busCapacity=");
		builder.append(busCapacity);
		builder.append(", busDriver=");
		builder.append(busDriver);
		builder.append(", destinyCity=");
		builder.append(destinyCity);
		builder.append("]");
		return builder.toString();
	}
}
