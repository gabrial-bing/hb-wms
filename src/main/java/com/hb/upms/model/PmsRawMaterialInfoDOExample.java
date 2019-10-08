package com.hb.upms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PmsRawMaterialInfoDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsRawMaterialInfoDOExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdIsNull() {
            addCriterion("big_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdIsNotNull() {
            addCriterion("big_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdEqualTo(Integer value) {
            addCriterion("big_type_id =", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdNotEqualTo(Integer value) {
            addCriterion("big_type_id <>", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdGreaterThan(Integer value) {
            addCriterion("big_type_id >", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("big_type_id >=", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdLessThan(Integer value) {
            addCriterion("big_type_id <", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("big_type_id <=", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdIn(List<Integer> values) {
            addCriterion("big_type_id in", values, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdNotIn(List<Integer> values) {
            addCriterion("big_type_id not in", values, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("big_type_id between", value1, value2, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("big_type_id not between", value1, value2, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdIsNull() {
            addCriterion("small_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdIsNotNull() {
            addCriterion("small_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdEqualTo(Integer value) {
            addCriterion("small_type_id =", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdNotEqualTo(Integer value) {
            addCriterion("small_type_id <>", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdGreaterThan(Integer value) {
            addCriterion("small_type_id >", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("small_type_id >=", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdLessThan(Integer value) {
            addCriterion("small_type_id <", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("small_type_id <=", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdIn(List<Integer> values) {
            addCriterion("small_type_id in", values, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdNotIn(List<Integer> values) {
            addCriterion("small_type_id not in", values, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("small_type_id between", value1, value2, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("small_type_id not between", value1, value2, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberIsNull() {
            addCriterion("pipeline_number is null");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberIsNotNull() {
            addCriterion("pipeline_number is not null");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberEqualTo(String value) {
            addCriterion("pipeline_number =", value, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberNotEqualTo(String value) {
            addCriterion("pipeline_number <>", value, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberGreaterThan(String value) {
            addCriterion("pipeline_number >", value, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pipeline_number >=", value, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberLessThan(String value) {
            addCriterion("pipeline_number <", value, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberLessThanOrEqualTo(String value) {
            addCriterion("pipeline_number <=", value, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberLike(String value) {
            addCriterion("pipeline_number like", value, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberNotLike(String value) {
            addCriterion("pipeline_number not like", value, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberIn(List<String> values) {
            addCriterion("pipeline_number in", values, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberNotIn(List<String> values) {
            addCriterion("pipeline_number not in", values, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberBetween(String value1, String value2) {
            addCriterion("pipeline_number between", value1, value2, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andPipelineNumberNotBetween(String value1, String value2) {
            addCriterion("pipeline_number not between", value1, value2, "pipelineNumber");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeIsNull() {
            addCriterion("specification_type is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeIsNotNull() {
            addCriterion("specification_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeEqualTo(String value) {
            addCriterion("specification_type =", value, "specificationType");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeNotEqualTo(String value) {
            addCriterion("specification_type <>", value, "specificationType");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeGreaterThan(String value) {
            addCriterion("specification_type >", value, "specificationType");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("specification_type >=", value, "specificationType");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeLessThan(String value) {
            addCriterion("specification_type <", value, "specificationType");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeLessThanOrEqualTo(String value) {
            addCriterion("specification_type <=", value, "specificationType");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeLike(String value) {
            addCriterion("specification_type like", value, "specificationType");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeNotLike(String value) {
            addCriterion("specification_type not like", value, "specificationType");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeIn(List<String> values) {
            addCriterion("specification_type in", values, "specificationType");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeNotIn(List<String> values) {
            addCriterion("specification_type not in", values, "specificationType");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeBetween(String value1, String value2) {
            addCriterion("specification_type between", value1, value2, "specificationType");
            return (Criteria) this;
        }

        public Criteria andSpecificationTypeNotBetween(String value1, String value2) {
            addCriterion("specification_type not between", value1, value2, "specificationType");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andSupplyIdIsNull() {
            addCriterion("supply_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplyIdIsNotNull() {
            addCriterion("supply_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyIdEqualTo(Integer value) {
            addCriterion("supply_id =", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdNotEqualTo(Integer value) {
            addCriterion("supply_id <>", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdGreaterThan(Integer value) {
            addCriterion("supply_id >", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supply_id >=", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdLessThan(Integer value) {
            addCriterion("supply_id <", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("supply_id <=", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdIn(List<Integer> values) {
            addCriterion("supply_id in", values, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdNotIn(List<Integer> values) {
            addCriterion("supply_id not in", values, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdBetween(Integer value1, Integer value2) {
            addCriterion("supply_id between", value1, value2, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supply_id not between", value1, value2, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyNameIsNull() {
            addCriterion("supply_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplyNameIsNotNull() {
            addCriterion("supply_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyNameEqualTo(String value) {
            addCriterion("supply_name =", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotEqualTo(String value) {
            addCriterion("supply_name <>", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameGreaterThan(String value) {
            addCriterion("supply_name >", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("supply_name >=", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameLessThan(String value) {
            addCriterion("supply_name <", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameLessThanOrEqualTo(String value) {
            addCriterion("supply_name <=", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameLike(String value) {
            addCriterion("supply_name like", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotLike(String value) {
            addCriterion("supply_name not like", value, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameIn(List<String> values) {
            addCriterion("supply_name in", values, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotIn(List<String> values) {
            addCriterion("supply_name not in", values, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameBetween(String value1, String value2) {
            addCriterion("supply_name between", value1, value2, "supplyName");
            return (Criteria) this;
        }

        public Criteria andSupplyNameNotBetween(String value1, String value2) {
            addCriterion("supply_name not between", value1, value2, "supplyName");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("`time` is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("`time` is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("`time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("`time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("`time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("`time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("`time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("`time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`time` not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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