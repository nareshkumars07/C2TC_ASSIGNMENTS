package assignment2;

public class Commision {
	private String name;
    private String address;
    private String phone;
    private double salesAmount;

    public Commision(String string, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
	}

	// Constructor
    public void Commission(String name, String address, String phone, double salesAmount) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salesAmount = salesAmount;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}
}
