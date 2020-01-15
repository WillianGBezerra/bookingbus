package model.entities;

import java.io.Serializable;

public class Country implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String acronymCountry;
	
	public Country() {
		
	}

	public Country(Integer id, String name, String acronymCountry) {
		super();
		this.id = id;
		this.name = name;
		this.acronymCountry = acronymCountry;
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

	public String getAcronymCountry() {
		return acronymCountry;
	}

	public void setAcronymCountry(String acronymCountry) {
		this.acronymCountry = acronymCountry;
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
		Country other = (Country) obj;
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
		builder.append("Country [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", acronymCountry=");
		builder.append(acronymCountry);
		builder.append("]");
		return builder.toString();
	}
}
