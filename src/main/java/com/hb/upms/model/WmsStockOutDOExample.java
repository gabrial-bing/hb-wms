package com.hb.upms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WmsStockOutDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsStockOutDOExample() {
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

        public Criteria andStockOutIdIsNull() {
            addCriterion("stock_out_id is null");
            return (Criteria) this;
        }

        public Criteria andStockOutIdIsNotNull() {
            addCriterion("stock_out_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockOutIdEqualTo(Integer value) {
            addCriterion("stock_out_id =", value, "stockOutId");
            return (Criteria) this;
        }

        public Criteria andStockOutIdNotEqualTo(Integer value) {
            addCriterion("stock_out_id <>", value, "stockOutId");
            return (Criteria) this;
        }

        public Criteria andStockOutIdGreaterThan(Integer value) {
            addCriterion("stock_out_id >", value, "stockOutId");
            return (Criteria) this;
        }

        public Criteria andStockOutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_out_id >=", value, "stockOutId");
            return (Criteria) this;
        }

        public Criteria andStockOutIdLessThan(Integer value) {
            addCriterion("stock_out_id <", value, "stockOutId");
            return (Criteria) this;
        }

        public Criteria andStockOutIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_out_id <=", value, "stockOutId");
            return (Criteria) this;
        }

        public Criteria andStockOutIdIn(List<Integer> values) {
            addCriterion("stock_out_id in", values, "stockOutId");
            return (Criteria) this;
        }

        public Criteria andStockOutIdNotIn(List<Integer> values) {
            addCriterion("stock_out_id not in", values, "stockOutId");
            return (Criteria) this;
        }

        public Criteria andStockOutIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_out_id between", value1, value2, "stockOutId");
            return (Criteria) this;
        }

        public Criteria andStockOutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_out_id not between", value1, value2, "stockOutId");
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

        public Criteria andOutStorageNumIsNull() {
            addCriterion("out_storage_num is null");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumIsNotNull() {
            addCriterion("out_storage_num is not null");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumEqualTo(Integer value) {
            addCriterion("out_storage_num =", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumNotEqualTo(Integer value) {
            addCriterion("out_storage_num <>", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumGreaterThan(Integer value) {
            addCriterion("out_storage_num >", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_storage_num >=", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumLessThan(Integer value) {
            addCriterion("out_storage_num <", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumLessThanOrEqualTo(Integer value) {
            addCriterion("out_storage_num <=", value, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumIn(List<Integer> values) {
            addCriterion("out_storage_num in", values, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumNotIn(List<Integer> values) {
            addCriterion("out_storage_num not in", values, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumBetween(Integer value1, Integer value2) {
            addCriterion("out_storage_num between", value1, value2, "outStorageNum");
            return (Criteria) this;
        }

        public Criteria andOutStorageNumNotBetween(Integer value1, Integer value2) {
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