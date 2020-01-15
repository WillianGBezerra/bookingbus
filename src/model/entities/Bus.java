package model.entities;

import java.io.Serializable;

public class Bus implements Serializable {

	private static final long serialVersionUID = 1L;
	private String placa;
	private Integer id, capacity;
	private Company company;

	public Bus() {

	}

	public Bus(Integer id, String placa, Integer capacity, Company company) {
		super();
		this.id = id;
		this.placa = placa;
		this.capacity = capacity;
		this.company = company;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	

	public Company getCompany() {
		return company;
	}

	public void setBuscompany(Company company) {
		this.company = company;
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
		Bus other = (Bus) obj;
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
		builder.append(", id=");
		builder.append(id);
		builder.append("Bus [placa=");
		builder.append(placa);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append(", company=");
		builder.append(company);
		builder.append("]");
		return builder.toString();
	}
}
