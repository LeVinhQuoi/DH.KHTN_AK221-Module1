package model;

public class Customer {
	private String id;
	private String name;
	private  boolean  gen;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String id, String name, boolean gen) {
		super();
		this.id = id;
		this.name = name;
		this.gen = gen;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGen() {
		return gen;
	}
	public void setGen(boolean gen) {
		this.gen = gen;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gen=" + gen + "]";
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
		Customer other = (Customer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
