package com.shopping.website.pojo;

import java.io.Serializable;


import io.swagger.annotations.ApiModelProperty;

public class User implements Serializable {
    /**
     * 用户名
     */
	@ApiModelProperty("用户名")
    private String username;

    /**
     * 密码
     */
	@ApiModelProperty("密码")
    private String password;

    private static final long serialVersionUID = 1L;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}