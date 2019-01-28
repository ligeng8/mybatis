package com.dt.spring.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdrressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdrressExample() {
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

        public Criteria andDangProvinceIdIsNull() {
            addCriterion("dang_province_id is null");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdIsNotNull() {
            addCriterion("dang_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdEqualTo(Integer value) {
            addCriterion("dang_province_id =", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdNotEqualTo(Integer value) {
            addCriterion("dang_province_id <>", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdGreaterThan(Integer value) {
            addCriterion("dang_province_id >", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dang_province_id >=", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdLessThan(Integer value) {
            addCriterion("dang_province_id <", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("dang_province_id <=", value, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdIn(List<Integer> values) {
            addCriterion("dang_province_id in", values, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdNotIn(List<Integer> values) {
            addCriterion("dang_province_id not in", values, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("dang_province_id between", value1, value2, "dangProvinceId");
            return (Criteria) this;
        }

        public Criteria andDangProvinceIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andDangCityIdIsNull() {
            addCriterion("dang_city_id is null");
            return (Criteria) this;
        }

        public Criteria andDangCityIdIsNotNull() {
            addCriterion("dang_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andDangCityIdEqualTo(Integer value) {
            addCriterion("dang_city_id =", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdNotEqualTo(Integer value) {
            addCriterion("dang_city_id <>", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdGreaterThan(Integer value) {
            addCriterion("dang_city_id >", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dang_city_id >=", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdLessThan(Integer value) {
            addCriterion("dang_city_id <", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("dang_city_id <=", value, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdIn(List<Integer> values) {
            addCriterion("dang_city_id in", values, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdNotIn(List<Integer> values) {
            addCriterion("dang_city_id not in", values, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdBetween(Integer value1, Integer value2) {
            addCriterion("dang_city_id between", value1, value2, "dangCityId");
            return (Criteria) this;
        }

        public Criteria andDangCityIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andDangAreaIdIsNull() {
            addCriterion("dang_area_id is null");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdIsNotNull() {
            addCriterion("dang_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdEqualTo(Integer value) {
            addCriterion("dang_area_id =", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdNotEqualTo(Integer value) {
            addCriterion("dang_area_id <>", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdGreaterThan(Integer value) {
            addCriterion("dang_area_id >", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dang_area_id >=", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdLessThan(Integer value) {
            addCriterion("dang_area_id <", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("dang_area_id <=", value, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdIn(List<Integer> values) {
            addCriterion("dang_area_id in", values, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdNotIn(List<Integer> values) {
            addCriterion("dang_area_id not in", values, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("dang_area_id between", value1, value2, "dangAreaId");
            return (Criteria) this;
        }

        public Criteria andDangAreaIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andDangStreetIdIsNull() {
            addCriterion("dang_street_id is null");
            return (Criteria) this;
        }

        public Criteria andDangStreetIdIsNotNull() {
            addCriterion("dang_street_id is not null");
            return (Criteria) this;
        }

        public Criteria andDangStreetIdEqualTo(Integer value) {
            addCriterion("dang_street_id =", value, "dangStreetId");
            return (Criteria) this;
        }

        public Criteria andDangStreetIdNotEqualTo(Integer value) {
            addCriterion("dang_street_id <>", value, "dangStreetId");
            return (Criteria) this;
        }

        public Criteria andDangStreetIdGreaterThan(Integer value) {
            addCriterion("dang_street_id >", value, "dangStreetId");
            return (Criteria) this;
        }

        public Criteria andDangStreetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dang_street_id >=", value, "dangStreetId");
            return (Criteria) this;
        }

        public Criteria andDangStreetIdLessThan(Integer value) {
            addCriterion("dang_street_id <", value, "dangStreetId");
            return (Criteria) this;
        }

        public Criteria andDangStreetIdLessThanOrEqualTo(Integer value) {
            addCriterion("dang_street_id <=", value, "dangStreetId");
            return (Criteria) this;
        }

        public Criteria andDangStreetIdIn(List<Integer> values) {
            addCriterion("dang_street_id in", values, "dangStreetId");
            return (Criteria) this;
        }

        public Criteria andDangStreetIdNotIn(List<Integer> values) {
            addCriterion("dang_street_id not in", values, "dangStreetId");
            return (Criteria) this;
        }

        public Criteria andDangStreetIdBetween(Integer value1, Integer value2) {
            addCriterion("dang_street_id between", value1, value2, "dangStreetId");
            return (Criteria) this;
        }

        public Criteria andDangStreetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dang_street_id not between", value1, value2, "dangStreetId");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameIsNull() {
            addCriterion("dang_street_name is null");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameIsNotNull() {
            addCriterion("dang_street_name is not null");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameEqualTo(String value) {
            addCriterion("dang_street_name =", value, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameNotEqualTo(String value) {
            addCriterion("dang_street_name <>", value, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameGreaterThan(String value) {
            addCriterion("dang_street_name >", value, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameGreaterThanOrEqualTo(String value) {
            addCriterion("dang_street_name >=", value, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameLessThan(String value) {
            addCriterion("dang_street_name <", value, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameLessThanOrEqualTo(String value) {
            addCriterion("dang_street_name <=", value, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameLike(String value) {
            addCriterion("dang_street_name like", value, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameNotLike(String value) {
            addCriterion("dang_street_name not like", value, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameIn(List<String> values) {
            addCriterion("dang_street_name in", values, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameNotIn(List<String> values) {
            addCriterion("dang_street_name not in", values, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameBetween(String value1, String value2) {
            addCriterion("dang_street_name between", value1, value2, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andDangStreetNameNotBetween(String value1, String value2) {
            addCriterion("dang_street_name not between", value1, value2, "dangStreetName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andLastChangedDateIsNull() {
            addCriterion("last_changed_date is null");
            return (Criteria) this;
        }

        public Criteria andLastChangedDateIsNotNull() {
            addCriterion("last_changed_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastChangedDateEqualTo(Date value) {
            addCriterion("last_changed_date =", value, "lastChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastChangedDateNotEqualTo(Date value) {
            addCriterion("last_changed_date <>", value, "lastChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastChangedDateGreaterThan(Date value) {
            addCriterion("last_changed_date >", value, "lastChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastChangedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_changed_date >=", value, "lastChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastChangedDateLessThan(Date value) {
            addCriterion("last_changed_date <", value, "lastChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastChangedDateLessThanOrEqualTo(Date value) {
            addCriterion("last_changed_date <=", value, "lastChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastChangedDateIn(List<Date> values) {
            addCriterion("last_changed_date in", values, "lastChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastChangedDateNotIn(List<Date> values) {
            addCriterion("last_changed_date not in", values, "lastChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastChangedDateBetween(Date value1, Date value2) {
            addCriterion("last_changed_date between", value1, value2, "lastChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastChangedDateNotBetween(Date value1, Date value2) {
            addCriterion("last_changed_date not between", value1, value2, "lastChangedDate");
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