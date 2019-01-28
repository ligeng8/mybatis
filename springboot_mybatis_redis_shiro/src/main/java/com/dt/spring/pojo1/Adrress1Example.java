package com.dt.spring.pojo1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Adrress1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Adrress1Example() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdIsNull() {
            addCriterion("dang_area_id is null");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdIsNotNull() {
            addCriterion("dang_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdEqualTo(String value) {
            addCriterion("dang_area_id =", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdNotEqualTo(String value) {
            addCriterion("dang_area_id <>", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdGreaterThan(String value) {
            addCriterion("dang_area_id >", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("dang_area_id >=", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdLessThan(String value) {
            addCriterion("dang_area_id <", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdLessThanOrEqualTo(String value) {
            addCriterion("dang_area_id <=", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdLike(String value) {
            addCriterion("dang_area_id like", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdNotLike(String value) {
            addCriterion("dang_area_id not like", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdIn(List<String> values) {
            addCriterion("dang_area_id in", values, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdNotIn(List<String> values) {
            addCriterion("dang_area_id not in", values, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdBetween(String value1, String value2) {
            addCriterion("dang_area_id between", value1, value2, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdNotBetween(String value1, String value2) {
            addCriterion("dang_area_id not between", value1, value2, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameIsNull() {
            addCriterion("dang_area_name is null");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameIsNotNull() {
            addCriterion("dang_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameEqualTo(String value) {
            addCriterion("dang_area_name =", value, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameNotEqualTo(String value) {
            addCriterion("dang_area_name <>", value, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameGreaterThan(String value) {
            addCriterion("dang_area_name >", value, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("dang_area_name >=", value, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameLessThan(String value) {
            addCriterion("dang_area_name <", value, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameLessThanOrEqualTo(String value) {
            addCriterion("dang_area_name <=", value, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameLike(String value) {
            addCriterion("dang_area_name like", value, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameNotLike(String value) {
            addCriterion("dang_area_name not like", value, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameIn(List<String> values) {
            addCriterion("dang_area_name in", values, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameNotIn(List<String> values) {
            addCriterion("dang_area_name not in", values, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameBetween(String value1, String value2) {
            addCriterion("dang_area_name between", value1, value2, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangAreaNameNotBetween(String value1, String value2) {
            addCriterion("dang_area_name not between", value1, value2, "dangAreaName");
            return (Criteria) this;
        }

        public Criteria andDangCityIdIsNull() {
            addCriterion("dang_city_id is null");
            return (Criteria) this;
        }

        public Criteria andDangCityIdIsNotNull() {
            addCriterion("dang_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andDangCityIdEqualTo(String value) {
            addCriterion("dang_city_id =", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdNotEqualTo(String value) {
            addCriterion("dang_city_id <>", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdGreaterThan(String value) {
            addCriterion("dang_city_id >", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("dang_city_id >=", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdLessThan(String value) {
            addCriterion("dang_city_id <", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdLessThanOrEqualTo(String value) {
            addCriterion("dang_city_id <=", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdLike(String value) {
            addCriterion("dang_city_id like", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdNotLike(String value) {
            addCriterion("dang_city_id not like", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdIn(List<String> values) {
            addCriterion("dang_city_id in", values, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdNotIn(List<String> values) {
            addCriterion("dang_city_id not in", values, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdBetween(String value1, String value2) {
            addCriterion("dang_city_id between", value1, value2, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdNotBetween(String value1, String value2) {
            addCriterion("dang_city_id not between", value1, value2, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityNameIsNull() {
            addCriterion("dang_city_name is null");
            return (Criteria) this;
        }

        public Criteria andDangCityNameIsNotNull() {
            addCriterion("dang_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andDangCityNameEqualTo(String value) {
            addCriterion("dang_city_name =", value, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangCityNameNotEqualTo(String value) {
            addCriterion("dang_city_name <>", value, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangCityNameGreaterThan(String value) {
            addCriterion("dang_city_name >", value, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("dang_city_name >=", value, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangCityNameLessThan(String value) {
            addCriterion("dang_city_name <", value, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangCityNameLessThanOrEqualTo(String value) {
            addCriterion("dang_city_name <=", value, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangCityNameLike(String value) {
            addCriterion("dang_city_name like", value, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangCityNameNotLike(String value) {
            addCriterion("dang_city_name not like", value, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangCityNameIn(List<String> values) {
            addCriterion("dang_city_name in", values, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangCityNameNotIn(List<String> values) {
            addCriterion("dang_city_name not in", values, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangCityNameBetween(String value1, String value2) {
            addCriterion("dang_city_name between", value1, value2, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangCityNameNotBetween(String value1, String value2) {
            addCriterion("dang_city_name not between", value1, value2, "dangCityName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdIsNull() {
            addCriterion("dang_province_id is null");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdIsNotNull() {
            addCriterion("dang_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdEqualTo(String value) {
            addCriterion("dang_province_id =", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdNotEqualTo(String value) {
            addCriterion("dang_province_id <>", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdGreaterThan(String value) {
            addCriterion("dang_province_id >", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("dang_province_id >=", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdLessThan(String value) {
            addCriterion("dang_province_id <", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("dang_province_id <=", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdLike(String value) {
            addCriterion("dang_province_id like", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdNotLike(String value) {
            addCriterion("dang_province_id not like", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdIn(List<String> values) {
            addCriterion("dang_province_id in", values, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdNotIn(List<String> values) {
            addCriterion("dang_province_id not in", values, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdBetween(String value1, String value2) {
            addCriterion("dang_province_id between", value1, value2, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdNotBetween(String value1, String value2) {
            addCriterion("dang_province_id not between", value1, value2, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameIsNull() {
            addCriterion("dang_province_name is null");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameIsNotNull() {
            addCriterion("dang_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameEqualTo(String value) {
            addCriterion("dang_province_name =", value, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameNotEqualTo(String value) {
            addCriterion("dang_province_name <>", value, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameGreaterThan(String value) {
            addCriterion("dang_province_name >", value, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("dang_province_name >=", value, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameLessThan(String value) {
            addCriterion("dang_province_name <", value, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("dang_province_name <=", value, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameLike(String value) {
            addCriterion("dang_province_name like", value, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameNotLike(String value) {
            addCriterion("dang_province_name not like", value, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameIn(List<String> values) {
            addCriterion("dang_province_name in", values, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameNotIn(List<String> values) {
            addCriterion("dang_province_name not in", values, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameBetween(String value1, String value2) {
            addCriterion("dang_province_name between", value1, value2, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andDangProvinceNameNotBetween(String value1, String value2) {
            addCriterion("dang_province_name not between", value1, value2, "dangProvinceName");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creation_date is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creation_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("creation_date =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("creation_date <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("creation_date >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_date >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("creation_date <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("creation_date <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("creation_date in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("creation_date not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("creation_date between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("creation_date not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNull() {
            addCriterion("last_modified_date is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNotNull() {
            addCriterion("last_modified_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateEqualTo(Date value) {
            addCriterion("last_modified_date =", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotEqualTo(Date value) {
            addCriterion("last_modified_date <>", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThan(Date value) {
            addCriterion("last_modified_date >", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modified_date >=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThan(Date value) {
            addCriterion("last_modified_date <", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("last_modified_date <=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIn(List<Date> values) {
            addCriterion("last_modified_date in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotIn(List<Date> values) {
            addCriterion("last_modified_date not in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateBetween(Date value1, Date value2) {
            addCriterion("last_modified_date between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("last_modified_date not between", value1, value2, "lastModifiedDate");
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