package cn.java.vo;

/**
 * Created by geely
 */
public class ShippingVo {
    private String username;
    
    private String address;
    
    private String Zip;
    
    private Long phone;



	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}




	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}
    
  
    
}
