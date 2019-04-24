package com.shopping.website.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Car implements Serializable {
    private Integer goodsid;

    private Integer carid;

    private BigDecimal goodsprice;
    
    private String goodstitle;

    private Integer goodsnumber;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }
    
    public Integer getCarid() {
		return carid;
	}

	public void setCarid(Integer carid) {
		this.carid = carid;
	}

    public BigDecimal getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(BigDecimal goodsprice) {
        this.goodsprice = goodsprice;
    }
    

	public String getGoodstitle() {
		return goodstitle;
	}

	public void setGoodstitle(String goodstitle) {
		this.goodstitle = goodstitle;
	}

	public void setGoodsnumber(Integer goodsnumber) {
		this.goodsnumber = goodsnumber;
	}

	public Integer getGoodsnumber() {
        return goodsnumber;
    }
    
    


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsid=").append(goodsid);
        sb.append(", carid=").append(carid);
        sb.append(", goodsprice=").append(goodsprice);
        sb.append(", goodstitle=").append(goodstitle);
        sb.append(", goodsnumber=").append(goodsnumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}