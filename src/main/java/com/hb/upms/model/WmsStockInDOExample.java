package com.hb.upms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WmsStockInDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsStockInDOExample() {
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

        public Criteria andStockInIdIsNull() {
            addCriterion("stock_in_id is null");
            return (Criteria) this;
        }

        public Criteria andStockInIdIsNotNull() {
            addCriterion("stock_in_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockInIdEqualTo(Integer value) {
            addCriterion("stock_in_id =", value, "stockInId");
            return (Criteria) this;
        }

        public Criteria andStockInIdNotEqualTo(Integer value) {
            addCriterion("stock_in_id <>", value, "stockInId");
            return (Criteria) this;
        }

        public Criteria andStockInIdGreaterThan(Integer value) {
            addCriterion("stock_in_id >", value, "stockInId");
            return (Criteria) this;
        }

        public Criteria andStockInIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_in_id >=", value, "stockInId");
            return (Criteria) this;
        }

        public Criteria andStockInIdLessThan(Integer value) {
            addCriterion("stock_in_id <", value, "stockInId");
            return (Criteria) this;
        }

        public Criteria andStockInIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_in_id <=", value, "stockInId");
            return (Criteria) this;
        }

        public Criteria andStockInIdIn(List<Integer> values) {
            addCriterion("stock_in_id in", values, "stockInId");
            return (Criteria) this;
        }

        public Criteria andStockInIdNotIn(List<Integer> values) {
            addCriterion("stock_in_id not in", values, "stockInId");
            return (Criteria) this;
        }

        public Criteria andStockInIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_in_id between", value1, value2, "stockInId");
            return (Criteria) this;
        }

        public Criteria andStockInIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_in_id not between", value1, value2, "stockInId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIsNull() {
            addCriterion("material_id is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIsNotNull() {
            addCriterion("material_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdEqualTo(Integer value) {
            addCriterion("material_id =", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotEqualTo(Integer value) {
            addCriterion("material_id <>", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThan(Integer value) {
            addCriterion("material_id >", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_id >=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThan(Integer value) {
            addCriterion("material_id <", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThanOrEqualTo(Integer value) {
            addCriterion("material_id <=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIn(List<Integer> values) {
            addCriterion("material_id in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotIn(List<Integer> values) {
            addCriterion("material_id not in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdBetween(Integer value1, Integer value2) {
            addCriterion("material_id between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("material_id not between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andInStorageNumIsNull() {
            addCriterion("in_storage_num is null");
            return (Criteria) this;
        }

        public Criteria andInStorageNumIsNotNull() {
            addCriterion("in_storage_num is not null");
            return (Criteria) this;
        }

        public Criteria andInStorageNumEqualTo(Integer value) {
            addCriterion("in_storage_num =", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumNotEqualTo(Integer value) {
            addCriterion("in_storage_num <>", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumGreaterThan(Integer value) {
            addCriterion("in_storage_num >", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_storage_num >=", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumLessThan(Integer value) {
            addCriterion("in_storage_num <", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumLessThanOrEqualTo(Integer value) {
            addCriterion("in_storage_num <=", value, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumIn(List<Integer> values) {
            addCriterion("in_storage_num in", values, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumNotIn(List<Integer> values) {
            addCriterion("in_storage_num not in", values, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumBetween(Integer value1, Integer value2) {
            addCriterion("in_storage_num between", value1, value2, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageNumNotBetween(Integer value1, Integer value2) {
            addCriterion("in_storage_num not between", value1, value2, "inStorageNum");
            return (Criteria) this;
        }

        public Criteria andInStorageDateIsNull() {
            addCriterion("in_storage_date is null");
            return (Criteria) this;
        }

        public Criteria andInStorageDateIsNotNull() {
            addCriterion("in_storage_date is not null");
            return (Criteria) this;
        }

        public Criteria andInStorageDateEqualTo(Date value) {
            addCriterionForJDBCDate("in_storage_date =", value, "inStorageDate");
            return (Criteria) this;
        }

        public Criteria andInStorageDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("in_storage_date <>", value, "inStorageDate");
            return (Criteria) this;
        }

        public Criteria andInStorageDateGreaterThan(Date value) {
            addCriterionForJDBCDate("in_storage_date >", value, "inStorageDate");
            return (Criteria) this;
        }

        public Criteria andInStorageDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("in_storage_date >=", value, "inStorageDate");
            return (Criteria) this;
        }

        public Criteria andInStorageDateLessThan(Date value) {
            addCriterionForJDBCDate("in_storage_date <", value, "inStorageDate");
            return (Criteria) this;
        }

        public Criteria andInStorageDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("in_storage_date <=", value, "inStorageDate");
            return (Criteria) this;
        }

        public Criteria andInStorageDateIn(List<Date> values) {
            addCriterionForJDBCDate("in_storage_date in", values, "inStorageDate");
            return (Criteria) this;
        }

        public Criteria andInStorageDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("in_storage_date not in", values, "inStorageDate");
            return (Criteria) this;
        }

        public Criteria andInStorageDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("in_storage_date between", value1, value2, "inStorageDate");
            return (Criteria) this;
        }

        public Criteria andInStorageDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("in_storage_date not between", value1, value2, "inStorageDate");
            return (Criteria) this;
        }

        public Criteria andInStorageNameIsNull() {
            addCriterion("in_storage_name is null");
            return (Criteria) this;
        }

        public Criteria andInStorageNameIsNotNull() {
            addCriterion("in_storage_name is not null");
            return (Criteria) this;
        }

        public Criteria andInStorageNameEqualTo(String value) {
            addCriterion("in_storage_name =", value, "inStorageName");
            return (Criteria) this;
        }

        public Criteria andInStorageNameNotEqualTo(String value) {
            addCriterion("in_storage_name <>", value, "inStorageName");
            return (Criteria) this;
        }

        public Criteria andInStorageNameGreaterThan(String value) {
            addCriterion("in_storage_name >", value, "inStorageName");
            return (Criteria) this;
        }

        public Criteria andInStorageNameGreaterThanOrEqualTo(String value) {
            addCriterion("in_storage_name >=", value, "inStorageName");
            return (Criteria) this;
        }

        public Criteria andInStorageNameLessThan(String value) {
            addCriterion("in_storage_name <", value, "inStorageName");
            return (Criteria) this;
        }

        public Criteria andInStorageNameLessThanOrEqualTo(String value) {
            addCriterion("in_storage_name <=", value, "inStorageName");
            return (Criteria) this;
        }

        public Criteria andInStorageNameLike(String value) {
            addCriterion("in_storage_name like", value, "inStorageName");
            return (Criteria) this;
        }

        public Criteria andInStorageNameNotLike(String value) {
            addCriterion("in_storage_name not like", value, "inStorageName");
            return (Criteria) this;
        }

        public Criteria andInStorageNameIn(List<String> values) {
            addCriterion("in_storage_name in", values, "inStorageName");
            return (Criteria) this;
        }

        public Criteria andInStorageNameNotIn(List<String> values) {
            addCriterion("in_storage_name not in", values, "inStorageName");
            return (Criteria) this;
        }

        public Criteria andInStorageNameBetween(String value1, String value2) {
            addCriterion("in_storage_name between", value1, value2, "inStorageName");
            return (Criteria) this;
        }

        public Criteria andInStorageNameNotBetween(String value1, String value2) {
            addCriterion("in_storage_name not between", value1, value2, "inStorageName");
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

        public Criteria andInStorageMoneyIsNull() {
            addCriterion("in_storage_money is null");
            return (Criteria) this;
        }

        public Criteria andInStorageMoneyIsNotNull() {
            addCriterion("in_storage_money is not null");
            return (Criteria) this;
        }

        public Criteria andInStorageMoneyEqualTo(BigDecimal value) {
            addCriterion("in_storage_money =", value, "inStorageMoney");
            return (Criteria) this;
        }

        public Criteria andInStorageMoneyNotEqualTo(BigDecimal value) {
            addCriterion("in_storage_money <>", value, "inStorageMoney");
            return (Criteria) this;
        }

        public Criteria andInStorageMoneyGreaterThan(BigDecimal value) {
            addCriterion("in_storage_money >", value, "inStorageMoney");
            return (Criteria) this;
        }

        public Criteria andInStorageMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("in_storage_money >=", value, "inStorageMoney");
            return (Criteria) this;
        }

        public Criteria andInStorageMoneyLessThan(BigDecimal value) {
            addCriterion("in_storage_money <", value, "inStorageMoney");
            return (Criteria) this;
        }

        public Criteria andInStorageMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("in_storage_money <=", value, "inStorageMoney");
            return (Criteria) this;
        }

        public Criteria andInStorageMoneyIn(List<BigDecimal> values) {
            addCriterion("in_storage_money in", values, "inStorageMoney");
            return (Criteria) this;
        }

        public Criteria andInStorageMoneyNotIn(List<BigDecimal> values) {
            addCriterion("in_storage_money not in", values, "inStorageMoney");
            return (Criteria) this;
        }

        public Criteria andInStorageMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("in_storage_money between", value1, value2, "inStorageMoney");
            return (Criteria) this;
        }

        public Criteria andInStorageMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("in_storage_money not between", value1, value2, "inStorageMoney");
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

        public Criteria andFromOrderIsNull() {
            addCriterion("from_order is null");
            return (Criteria) this;
        }

        public Criteria andFromOrderIsNotNull() {
            addCriterion("from_order is not null");
            return (Criteria) this;
        }

        public Criteria andFromOrderEqualTo(String value) {
            addCriterion("from_order =", value, "fromOrder");
            return (Criteria) this;
        }

        public Criteria andFromOrderNotEqualTo(String value) {
            addCriterion("from_order <>", value, "fromOrder");
            return (Criteria) this;
        }

        public Criteria andFromOrderGreaterThan(String value) {
            addCriterion("from_order >", value, "fromOrder");
            return (Criteria) this;
        }

        public Criteria andFromOrderGreaterThanOrEqualTo(String value) {
            addCriterion("from_order >=", value, "fromOrder");
            return (Criteria) this;
        }

        public Criteria andFromOrderLessThan(String value) {
            addCriterion("from_order <", value, "fromOrder");
            return (Criteria) this;
        }

        public Criteria andFromOrderLessThanOrEqualTo(String value) {
            addCriterion("from_order <=", value, "fromOrder");
            return (Criteria) this;
        }

        public Criteria andFromOrderLike(String value) {
            addCriterion("from_order like", value, "fromOrder");
            return (Criteria) this;
        }

        public Criteria andFromOrderNotLike(String value) {
            addCriterion("from_order not like", value, "fromOrder");
            return (Criteria) this;
        }

        public Criteria andFromOrderIn(List<String> values) {
            addCriterion("from_order in", values, "fromOrder");
            return (Criteria) this;
        }

        public Criteria andFromOrderNotIn(List<String> values) {
            addCriterion("from_order not in", values, "fromOrder");
            return (Criteria) this;
        }

        public Criteria andFromOrderBetween(String value1, String value2) {
            addCriterion("from_order between", value1, value2, "fromOrder");
            return (Criteria) this;
        }

        public Criteria andFromOrderNotBetween(String value1, String value2) {
            addCriterion("from_order not between", value1, value2, "fromOrder");
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