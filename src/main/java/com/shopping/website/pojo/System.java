package com.shopping.website.pojo;

import java.io.Serializable;


import io.swagger.annotations.ApiModelProperty;

public class System implements Serializable {
    /**
     * 反馈内容
     */
	@ApiModelProperty("反馈信息")
    private String content;

    /**
     * id
     */
	@ApiModelProperty("信息id")
    private Integer sysid;

    private static final long serialVersionUID = 1L;
    
    

    public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public Integer getSysid() {
		return sysid;
	}

	public void setSysid(Integer sysid) {
		this.sysid = sysid;
	}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", content=").append(content);
        sb.append(", sysid=").append(sysid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}