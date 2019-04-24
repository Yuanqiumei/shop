package com.shopping.website.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class TbGoods implements Serializable {
    private Integer goodsid;

    private String goodstitle;

    private BigDecimal goodsprice;
    
    private String goodscontent;
    
    private String goodsimg;
    

    private Integer goodsnumber;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodstitle() {
        return goodstitle;
    }

    public void setGoodstitle(String goodstitle) {
        this.goodstitle = goodstitle == null ? null : goodstitle.trim();
    }

    public BigDecimal getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(BigDecimal goodsprice) {
        this.goodsprice = goodsprice;
    }
    

    public String getGoodscontent() {
		return goodscontent;
	}

	public void setGoodscontent(String goodscontent) {
		this.goodscontent = goodscontent == null ? null : goodscontent.trim();
	}

	public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg == null ? null : goodsimg.trim();
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
        sb.append(", goodstitle=").append(goodstitle);
        sb.append(", goodsprice=").append(goodsprice);
        sb.append(", goodscontent=").append(goodscontent);
        sb.append(", goodsimg=").append(goodsimg);
        sb.append(", goodsnumber=").append(goodsnumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}