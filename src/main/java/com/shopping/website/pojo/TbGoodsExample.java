package com.shopping.website.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public TbGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodstitleIsNull() {
            addCriterion("goodsTitle is null");
            return (Criteria) this;
        }

        public Criteria andGoodstitleIsNotNull() {
            addCriterion("goodsTitle is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstitleEqualTo(String value) {
            addCriterion("goodsTitle =", value, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodstitleNotEqualTo(String value) {
            addCriterion("goodsTitle <>", value, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodstitleGreaterThan(String value) {
            addCriterion("goodsTitle >", value, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodstitleGreaterThanOrEqualTo(String value) {
            addCriterion("goodsTitle >=", value, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodstitleLessThan(String value) {
            addCriterion("goodsTitle <", value, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodstitleLessThanOrEqualTo(String value) {
            addCriterion("goodsTitle <=", value, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodstitleLike(String value) {
            addCriterion("goodsTitle like", value, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodstitleNotLike(String value) {
            addCriterion("goodsTitle not like", value, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodstitleIn(List<String> values) {
            addCriterion("goodsTitle in", values, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodstitleNotIn(List<String> values) {
            addCriterion("goodsTitle not in", values, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodstitleBetween(String value1, String value2) {
            addCriterion("goodsTitle between", value1, value2, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodstitleNotBetween(String value1, String value2) {
            addCriterion("goodsTitle not between", value1, value2, "goodstitle");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(BigDecimal value) {
            addCriterion("goodsPrice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(BigDecimal value) {
            addCriterion("goodsPrice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(BigDecimal value) {
            addCriterion("goodsPrice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsPrice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(BigDecimal value) {
            addCriterion("goodsPrice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsPrice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<BigDecimal> values) {
            addCriterion("goodsPrice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<BigDecimal> values) {
            addCriterion("goodsPrice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsPrice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsPrice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }
        
        
        public Criteria andGoodscontentIsNull() {
            addCriterion("goodsContent is null");
            return (Criteria) this;
        }

        public Criteria andGoodscontentIsNotNull() {
            addCriterion("goodsContent is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscontentEqualTo(BigDecimal value) {
            addCriterion("goodsContent =", value, "goodscontent");
            return (Criteria) this;
        }

        public Criteria andGoodscontentNotEqualTo(BigDecimal value) {
            addCriterion("goodsContent <>", value, "goodscontent");
            return (Criteria) this;
        }

        public Criteria andGoodscontentGreaterThan(BigDecimal value) {
            addCriterion("goodsContent >", value, "goodscontent");
            return (Criteria) this;
        }

        public Criteria andGoodscontentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsContent >=", value, "goodscontent");
            return (Criteria) this;
        }

        public Criteria andGoodscontentThan(BigDecimal value) {
            addCriterion("goodsContent <", value, "goodscontent");
            return (Criteria) this;
        }

        public Criteria andGoodscontentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goodsContent <=", value, "goodscontent");
            return (Criteria) this;
        }

        public Criteria andGoodscontentIn(List<BigDecimal> values) {
            addCriterion("goodsContent in", values, "goodscontent");
            return (Criteria) this;
        }

        public Criteria andGoodscontentNotIn(List<BigDecimal> values) {
            addCriterion("goodsContent not in", values, "goodscontent");
            return (Criteria) this;
        }

        public Criteria andGoodscontentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsContent between", value1, value2, "goodscontent");
            return (Criteria) this;
        }

        public Criteria andGoodscontentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodsContent not between", value1, value2, "goodscontent");
            return (Criteria) this;
        }

        

        public Criteria andGoodsimgIsNull() {
            addCriterion("goodsImg is null");
            return (Criteria) this;
        }

        public Criteria andGoodsimgIsNotNull() {
            addCriterion("goodsImg is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsimgEqualTo(String value) {
            addCriterion("goodsImg =", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotEqualTo(String value) {
            addCriterion("goodsImg <>", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgGreaterThan(String value) {
            addCriterion("goodsImg >", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgGreaterThanOrEqualTo(String value) {
            addCriterion("goodsImg >=", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLessThan(String value) {
            addCriterion("goodsImg <", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLessThanOrEqualTo(String value) {
            addCriterion("goodsImg <=", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLike(String value) {
            addCriterion("goodsImg like", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotLike(String value) {
            addCriterion("goodsImg not like", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgIn(List<String> values) {
            addCriterion("goodsImg in", values, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotIn(List<String> values) {
            addCriterion("goodsImg not in", values, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgBetween(String value1, String value2) {
            addCriterion("goodsImg between", value1, value2, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotBetween(String value1, String value2) {
            addCriterion("goodsImg not between", value1, value2, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNull() {
            addCriterion("goodsNumber is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNotNull() {
            addCriterion("goodsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberEqualTo(Integer value) {
            addCriterion("goodsNumber =", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotEqualTo(Integer value) {
            addCriterion("goodsNumber <>", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThan(Integer value) {
            addCriterion("goodsNumber >", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsNumber >=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThan(Integer value) {
            addCriterion("goodsNumber <", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThanOrEqualTo(Integer value) {
            addCriterion("goodsNumber <=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIn(List<Integer> values) {
            addCriterion("goodsNumber in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotIn(List<Integer> values) {
            addCriterion("goodsNumber not in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberBetween(Integer value1, Integer value2) {
            addCriterion("goodsNumber between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsNumber not between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }
        

    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}