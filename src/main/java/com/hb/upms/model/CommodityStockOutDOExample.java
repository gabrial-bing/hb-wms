package com.hb.upms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommodityStockOutDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityStockOutDOExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Integer value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Integer value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Integer value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Integer value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Integer> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Integer> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutIsNull() {
            addCriterion("inland_or_out is null");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutIsNotNull() {
            addCriterion("inland_or_out is not null");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutEqualTo(Boolean value) {
            addCriterion("inland_or_out =", value, "inlandOrOut");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutNotEqualTo(Boolean value) {
            addCriterion("inland_or_out <>", value, "inlandOrOut");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutGreaterThan(Boolean value) {
            addCriterion("inland_or_out >", value, "inlandOrOut");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutGreaterThanOrEqualTo(Boolean value) {
            addCriterion("inland_or_out >=", value, "inlandOrOut");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutLessThan(Boolean value) {
            addCriterion("inland_or_out <", value, "inlandOrOut");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutLessThanOrEqualTo(Boolean value) {
            addCriterion("inland_or_out <=", value, "inlandOrOut");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutIn(List<Boolean> values) {
            addCriterion("inland_or_out in", values, "inlandOrOut");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutNotIn(List<Boolean> values) {
            addCriterion("inland_or_out not in", values, "inlandOrOut");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutBetween(Boolean value1, Boolean value2) {
            addCriterion("inland_or_out between", value1, value2, "inlandOrOut");
            return (Criteria) this;
        }

        public Criteria andInlandOrOutNotBetween(Boolean value1, Boolean value2) {
            addCriterion("inland_or_out not between", value1, value2, "inlandOrOut");
            return (Criteria) this;
        }

        public Criteria andInventoryNumIsNull() {
            addCriterion("inventory_num is null");
            return (Criteria) this;
        }

        public Criteria andInventoryNumIsNotNull() {
            addCriterion("inventory_num is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryNumEqualTo(Integer value) {
            addCriterion("inventory_num =", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumNotEqualTo(Integer value) {
            addCriterion("inventory_num <>", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumGreaterThan(Integer value) {
            addCriterion("inventory_num >", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory_num >=", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumLessThan(Integer value) {
            addCriterion("inventory_num <", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumLessThanOrEqualTo(Integer value) {
            addCriterion("inventory_num <=", value, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumIn(List<Integer> values) {
            addCriterion("inventory_num in", values, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumNotIn(List<Integer> values) {
            addCriterion("inventory_num not in", values, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumBetween(Integer value1, Integer value2) {
            addCriterion("inventory_num between", value1, value2, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNumNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory_num not between", value1, value2, "inventoryNum");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIsNull() {
            addCriterion("storage_location is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIsNotNull() {
            addCriterion("storage_location is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationEqualTo(String value) {
            addCriterion("storage_location =", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotEqualTo(String value) {
            addCriterion("storage_location <>", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationGreaterThan(String value) {
            addCriterion("storage_location >", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("storage_location >=", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLessThan(String value) {
            addCriterion("storage_location <", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLessThanOrEqualTo(String value) {
            addCriterion("storage_location <=", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLike(String value) {
            addCriterion("storage_location like", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotLike(String value) {
            addCriterion("storage_location not like", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIn(List<String> values) {
            addCriterion("storage_location in", values, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotIn(List<String> values) {
            addCriterion("storage_location not in", values, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBetween(String value1, String value2) {
            addCriterion("storage_location between", value1, value2, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotBetween(String value1, String value2) {
            addCriterion("storage_location not between", value1, value2, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumIsNull() {
            addCriterion("out_storage_num is null");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumIsNotNull() {
            addCriterion("out_storage_num is not null");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumEqualTo(String value) {
            addCriterion("out_storage_num =", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumNotEqualTo(String value) {
            addCriterion("out_storage_num <>", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumGreaterThan(String value) {
            addCriterion("out_storage_num >", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumGreaterThanOrEqualTo(String value) {
            addCriterion("out_storage_num >=", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumLessThan(String value) {
            addCriterion("out_storage_num <", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumLessThanOrEqualTo(String value) {
            addCriterion("out_storage_num <=", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumLike(String value) {
            addCriterion("out_storage_num like", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumNotLike(String value) {
            addCriterion("out_storage_num not like", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumIn(List<String> values) {
            addCriterion("out_storage_num in", values, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumNotIn(List<String> values) {
            addCriterion("out_storage_num not in", values, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumBetween(String value1, String value2) {
            addCriterion("out_storage_num between", value1, value2, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumNotBetween(String value1, String value2) {
            addCriterion("out_storage_num not between", value1, value2, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateIsNull() {
            addCriterion("out_storage_date is null");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateIsNotNull() {
            addCriterion("out_storage_date is not null");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateEqualTo(Date value) {
            addCriterionForJDBCDate("out_storage_date =", value, "outStorageDate");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("out_storage_date <>", value, "outStorageDate");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateGreaterThan(Date value) {
            addCriterionForJDBCDate("out_storage_date >", value, "outStorageDate");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("out_storage_date >=", value, "outStorageDate");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateLessThan(Date value) {
            addCriterionForJDBCDate("out_storage_date <", value, "outStorageDate");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("out_storage_date <=", value, "outStorageDate");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateIn(List<Date> values) {
            addCriterionForJDBCDate("out_storage_date in", values, "outStorageDate");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("out_storage_date not in", values, "outStorageDate");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("out_storage_date between", value1, value2, "outStorageDate");
            return (Criteria) this;
        }

        public Criteria andOutStorageDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("out_storage_date not between", value1, value2, "outStorageDate");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameIsNull() {
            addCriterion("out_storage_name is null");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameIsNotNull() {
            addCriterion("out_storage_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameEqualTo(String value) {
            addCriterion("out_storage_name =", value, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameNotEqualTo(String value) {
            addCriterion("out_storage_name <>", value, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameGreaterThan(String value) {
            addCriterion("out_storage_name >", value, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameGreaterThanOrEqualTo(String value) {
            addCriterion("out_storage_name >=", value, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameLessThan(String value) {
            addCriterion("out_storage_name <", value, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameLessThanOrEqualTo(String value) {
            addCriterion("out_storage_name <=", value, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameLike(String value) {
            addCriterion("out_storage_name like", value, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameNotLike(String value) {
            addCriterion("out_storage_name not like", value, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameIn(List<String> values) {
            addCriterion("out_storage_name in", values, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameNotIn(List<String> values) {
            addCriterion("out_storage_name not in", values, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameBetween(String value1, String value2) {
            addCriterion("out_storage_name between", value1, value2, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andOutStorageNameNotBetween(String value1, String value2) {
            addCriterion("out_storage_name not between", value1, value2, "outStorageName");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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