package model.entities;

import java.io.Serializable;

public class TicketBus implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Employee passenger;
	private RoundTrip roundTrip;
	
	public TicketBus() {
		
	}

	public TicketBus(Integer id, Employee passenger, RoundTrip roundTrip) {
		super();
		this.id = id;
		this.passenger = passenger;
		this.roundTrip = roundTrip;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee getPassenger() {
		return passenger;
	}

	public void setPassenger(Employee passenger) {
		this.passenger = passenger;
	}

	public RoundTrip getRoundTrip() {
		return roundTrip;
	}

	public void setRoundTrip(RoundTrip roundTrip) {
		this.roundTrip = roundTrip;
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
		TicketBus other = (TicketBus) obj;
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
		builder.append("Passenger [id=");
		builder.append(id);
		builder.append(", passenger=");
		builder.append(passenger);
		builder.append(", roundTrip=");
		builder.append(roundTrip);
		builder.append("]");
		return builder.toString();
	}	
}
