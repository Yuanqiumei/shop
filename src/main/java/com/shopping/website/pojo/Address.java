package com.shopping.website.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Address implements Serializable {
    private Integer addressid;

    private String username;
    
    private String addressdetail;

    private String phone;

    private static final long serialVersionUID = 1L;
    
    
    public Integer getAddressid() {
		return addressid;
	}

	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getAddressdetail() {
		return addressdetail;
	}


	public void setAddressdetail(String addressdetail) {
		this.addressdetail = addressdetail;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressid=").append(addressid);
        sb.append(", username=").append(username);
        sb.append(", addressdetail=").append(addressdetail);
        sb.append(", phone=").append(phone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}