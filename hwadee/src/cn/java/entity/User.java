package cn.java.entity;

import java.util.Date;

public class User {
    private Integer userId;
    
    private String password;
    
    private Integer userRole;

    private Integer memberId;

    private Integer basketId;

    private Integer balanceId;

    private String userName;

    private String userSex;

    private Date userBirthday;

    private String userEmail;

    private String userPhone;

    private String userProfile;

    private Float monetary;
    
    public User(String userName,String userPhone,String password) {
    	this.userName=userName;
    	this.userPhone=userPhone;
    	this.password=password;
    }
    public User() {
    	
    }

    public User(String phone, String getMD5Code2) {
		// TODO Auto-generated constructor stub
    	this.userPhone=phone;
    	this.password=getMD5Code2;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userLoginStatus) {
		this.userRole = userLoginStatus;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getBasketId() {
        return basketId;
    }

    public void setBasketId(Integer basketId) {
        this.basketId = basketId;
    }

    public Integer getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(Integer balanceId) {
        this.balanceId = balanceId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public Float getMonetary() {
        return monetary;
    }

    public void setMonetary(Float monetary) {
        this.monetary = monetary;
    }
}