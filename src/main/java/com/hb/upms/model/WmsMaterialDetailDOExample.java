package com.hb.upms.model;

import java.util.ArrayList;
import java.util.List;

public class WmsMaterialDetailDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsMaterialDetailDOExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andModelMumIsNull() {
            addCriterion("model_mum is null");
            return (Criteria) this;
        }

        public Criteria andModelMumIsNotNull() {
            addCriterion("model_mum is not null");
            return (Criteria) this;
        }

        public Criteria andModelMumEqualTo(String value) {
            addCriterion("model_mum =", value, "modelMum");
            return (Criteria) this;
        }

        public Criteria andModelMumNotEqualTo(String value) {
            addCriterion("model_mum <>", value, "modelMum");
            return (Criteria) this;
        }

        public Criteria andModelMumGreaterThan(String value) {
            addCriterion("model_mum >", value, "modelMum");
            return (Criteria) this;
        }

        public Criteria andModelMumGreaterThanOrEqualTo(String value) {
            addCriterion("model_mum >=", value, "modelMum");
            return (Criteria) this;
        }

        public Criteria andModelMumLessThan(String value) {
            addCriterion("model_mum <", value, "modelMum");
            return (Criteria) this;
        }

        public Criteria andModelMumLessThanOrEqualTo(String value) {
            addCriterion("model_mum <=", value, "modelMum");
            return (Criteria) this;
        }

        public Criteria andModelMumLike(String value) {
            addCriterion("model_mum like", value, "modelMum");
            return (Criteria) this;
        }

        public Criteria andModelMumNotLike(String value) {
            addCriterion("model_mum not like", value, "modelMum");
            return (Criteria) this;
        }

        public Criteria andModelMumIn(List<String> values) {
            addCriterion("model_mum in", values, "modelMum");
            return (Criteria) this;
        }

        public Criteria andModelMumNotIn(List<String> values) {
            addCriterion("model_mum not in", values, "modelMum");
            return (Criteria) this;
        }

        public Criteria andModelMumBetween(String value1, String value2) {
            addCriterion("model_mum between", value1, value2, "modelMum");
            return (Criteria) this;
        }

        public Criteria andModelMumNotBetween(String value1, String value2) {
            addCriterion("model_mum not between", value1, value2, "modelMum");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("`standard` is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("`standard` is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("`standard` =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("`standard` <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("`standard` >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("`standard` >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("`standard` <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("`standard` <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("`standard` like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("`standard` not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("`standard` in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("`standard` not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("`standard` between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("`standard` not between", value1, value2, "standard");
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

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Double value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Double value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Double value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Double value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Double> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Double> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Double value1, Double value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
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