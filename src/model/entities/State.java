package model.entities;

import java.io.Serializable;

public class State implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String acronymState;
	private Country country;
	
	public State() {
		
	}

	public State(Integer id, String name, String acronymState, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.acronymState = acronymState;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcronymState() {
		return acronymState;
	}

	public void setAcronymState(String acronymState) {
		this.acronymState = acronymState;
	}

	

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
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
		State other = (State) obj;
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
		builder.append("State [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", acronym=");
		builder.append(acronymState);
		builder.append(", country=");
		builder.append(country);
		builder.append("]");
		return builder.toString();
	}
}
