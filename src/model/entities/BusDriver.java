package model.entities;

import java.io.Serializable;

public class BusDriver implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String phone;
	private Company Company;
	
	public BusDriver() {
		
	}

	public BusDriver(Integer id, String name, String phone, model.entities.Company company) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		Company = company;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Company getCompany() {
		return Company;
	}

	public void setCompany(Company company) {
		Company = company;
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
		BusDriver other = (BusDriver) obj;
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
		builder.append("BusDriver [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", Company=");
		builder.append(Company);
		builder.append("]");
		return builder.toString();
	}
}
