package com.clesun.web.skyland.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZhnyNsglXqExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected int offset = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected int limit = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public ZhnyNsglXqExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void setOffset(int offset) {
        this.offset=offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public int getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void setLimit(int limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public int getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
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

        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
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

        public Criteria andNsglIdIsNull() {
            addCriterion("NSGL_ID is null");
            return (Criteria) this;
        }

        public Criteria andNsglIdIsNotNull() {
            addCriterion("NSGL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNsglIdEqualTo(Integer value) {
            addCriterion("NSGL_ID =", value, "nsglId");
            return (Criteria) this;
        }

        public Criteria andNsglIdNotEqualTo(Integer value) {
            addCriterion("NSGL_ID <>", value, "nsglId");
            return (Criteria) this;
        }

        public Criteria andNsglIdGreaterThan(Integer value) {
            addCriterion("NSGL_ID >", value, "nsglId");
            return (Criteria) this;
        }

        public Criteria andNsglIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NSGL_ID >=", value, "nsglId");
            return (Criteria) this;
        }

        public Criteria andNsglIdLessThan(Integer value) {
            addCriterion("NSGL_ID <", value, "nsglId");
            return (Criteria) this;
        }

        public Criteria andNsglIdLessThanOrEqualTo(Integer value) {
            addCriterion("NSGL_ID <=", value, "nsglId");
            return (Criteria) this;
        }

        public Criteria andNsglIdIn(List<Integer> values) {
            addCriterion("NSGL_ID in", values, "nsglId");
            return (Criteria) this;
        }

        public Criteria andNsglIdNotIn(List<Integer> values) {
            addCriterion("NSGL_ID not in", values, "nsglId");
            return (Criteria) this;
        }

        public Criteria andNsglIdBetween(Integer value1, Integer value2) {
            addCriterion("NSGL_ID between", value1, value2, "nsglId");
            return (Criteria) this;
        }

        public Criteria andNsglIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NSGL_ID not between", value1, value2, "nsglId");
            return (Criteria) this;
        }

        public Criteria andCzrIsNull() {
            addCriterion("CZR is null");
            return (Criteria) this;
        }

        public Criteria andCzrIsNotNull() {
            addCriterion("CZR is not null");
            return (Criteria) this;
        }

        public Criteria andCzrEqualTo(String value) {
            addCriterion("CZR =", value, "czr");
            return (Criteria) this;
        }

        public Criteria andCzrNotEqualTo(String value) {
            addCriterion("CZR <>", value, "czr");
            return (Criteria) this;
        }

        public Criteria andCzrGreaterThan(String value) {
            addCriterion("CZR >", value, "czr");
            return (Criteria) this;
        }

        public Criteria andCzrGreaterThanOrEqualTo(String value) {
            addCriterion("CZR >=", value, "czr");
            return (Criteria) this;
        }

        public Criteria andCzrLessThan(String value) {
            addCriterion("CZR <", value, "czr");
            return (Criteria) this;
        }

        public Criteria andCzrLessThanOrEqualTo(String value) {
            addCriterion("CZR <=", value, "czr");
            return (Criteria) this;
        }

        public Criteria andCzrLike(String value) {
            addCriterion("CZR like", value, "czr");
            return (Criteria) this;
        }

        public Criteria andCzrNotLike(String value) {
            addCriterion("CZR not like", value, "czr");
            return (Criteria) this;
        }

        public Criteria andCzrIn(List<String> values) {
            addCriterion("CZR in", values, "czr");
            return (Criteria) this;
        }

        public Criteria andCzrNotIn(List<String> values) {
            addCriterion("CZR not in", values, "czr");
            return (Criteria) this;
        }

        public Criteria andCzrBetween(String value1, String value2) {
            addCriterion("CZR between", value1, value2, "czr");
            return (Criteria) this;
        }

        public Criteria andCzrNotBetween(String value1, String value2) {
            addCriterion("CZR not between", value1, value2, "czr");
            return (Criteria) this;
        }

        public Criteria andCzlxIsNull() {
            addCriterion("CZLX is null");
            return (Criteria) this;
        }

        public Criteria andCzlxIsNotNull() {
            addCriterion("CZLX is not null");
            return (Criteria) this;
        }

        public Criteria andCzlxEqualTo(String value) {
            addCriterion("CZLX =", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotEqualTo(String value) {
            addCriterion("CZLX <>", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxGreaterThan(String value) {
            addCriterion("CZLX >", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxGreaterThanOrEqualTo(String value) {
            addCriterion("CZLX >=", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLessThan(String value) {
            addCriterion("CZLX <", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLessThanOrEqualTo(String value) {
            addCriterion("CZLX <=", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLike(String value) {
            addCriterion("CZLX like", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotLike(String value) {
            addCriterion("CZLX not like", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxIn(List<String> values) {
            addCriterion("CZLX in", values, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotIn(List<String> values) {
            addCriterion("CZLX not in", values, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxBetween(String value1, String value2) {
            addCriterion("CZLX between", value1, value2, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotBetween(String value1, String value2) {
            addCriterion("CZLX not between", value1, value2, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlbIsNull() {
            addCriterion("CZLB is null");
            return (Criteria) this;
        }

        public Criteria andCzlbIsNotNull() {
            addCriterion("CZLB is not null");
            return (Criteria) this;
        }

        public Criteria andCzlbEqualTo(String value) {
            addCriterion("CZLB =", value, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzlbNotEqualTo(String value) {
            addCriterion("CZLB <>", value, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzlbGreaterThan(String value) {
            addCriterion("CZLB >", value, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzlbGreaterThanOrEqualTo(String value) {
            addCriterion("CZLB >=", value, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzlbLessThan(String value) {
            addCriterion("CZLB <", value, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzlbLessThanOrEqualTo(String value) {
            addCriterion("CZLB <=", value, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzlbLike(String value) {
            addCriterion("CZLB like", value, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzlbNotLike(String value) {
            addCriterion("CZLB not like", value, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzlbIn(List<String> values) {
            addCriterion("CZLB in", values, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzlbNotIn(List<String> values) {
            addCriterion("CZLB not in", values, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzlbBetween(String value1, String value2) {
            addCriterion("CZLB between", value1, value2, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzlbNotBetween(String value1, String value2) {
            addCriterion("CZLB not between", value1, value2, "czlb");
            return (Criteria) this;
        }

        public Criteria andCzkssjIsNull() {
            addCriterion("CZKSSJ is null");
            return (Criteria) this;
        }

        public Criteria andCzkssjIsNotNull() {
            addCriterion("CZKSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCzkssjEqualTo(Date value) {
            addCriterion("CZKSSJ =", value, "czkssj");
            return (Criteria) this;
        }

        public Criteria andCzkssjNotEqualTo(Date value) {
            addCriterion("CZKSSJ <>", value, "czkssj");
            return (Criteria) this;
        }

        public Criteria andCzkssjGreaterThan(Date value) {
            addCriterion("CZKSSJ >", value, "czkssj");
            return (Criteria) this;
        }

        public Criteria andCzkssjGreaterThanOrEqualTo(Date value) {
            addCriterion("CZKSSJ >=", value, "czkssj");
            return (Criteria) this;
        }

        public Criteria andCzkssjLessThan(Date value) {
            addCriterion("CZKSSJ <", value, "czkssj");
            return (Criteria) this;
        }

        public Criteria andCzkssjLessThanOrEqualTo(Date value) {
            addCriterion("CZKSSJ <=", value, "czkssj");
            return (Criteria) this;
        }

        public Criteria andCzkssjIn(List<Date> values) {
            addCriterion("CZKSSJ in", values, "czkssj");
            return (Criteria) this;
        }

        public Criteria andCzkssjNotIn(List<Date> values) {
            addCriterion("CZKSSJ not in", values, "czkssj");
            return (Criteria) this;
        }

        public Criteria andCzkssjBetween(Date value1, Date value2) {
            addCriterion("CZKSSJ between", value1, value2, "czkssj");
            return (Criteria) this;
        }

        public Criteria andCzkssjNotBetween(Date value1, Date value2) {
            addCriterion("CZKSSJ not between", value1, value2, "czkssj");
            return (Criteria) this;
        }

        public Criteria andCzjssjIsNull() {
            addCriterion("CZJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andCzjssjIsNotNull() {
            addCriterion("CZJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCzjssjEqualTo(Date value) {
            addCriterion("CZJSSJ =", value, "czjssj");
            return (Criteria) this;
        }

        public Criteria andCzjssjNotEqualTo(Date value) {
            addCriterion("CZJSSJ <>", value, "czjssj");
            return (Criteria) this;
        }

        public Criteria andCzjssjGreaterThan(Date value) {
            addCriterion("CZJSSJ >", value, "czjssj");
            return (Criteria) this;
        }

        public Criteria andCzjssjGreaterThanOrEqualTo(Date value) {
            addCriterion("CZJSSJ >=", value, "czjssj");
            return (Criteria) this;
        }

        public Criteria andCzjssjLessThan(Date value) {
            addCriterion("CZJSSJ <", value, "czjssj");
            return (Criteria) this;
        }

        public Criteria andCzjssjLessThanOrEqualTo(Date value) {
            addCriterion("CZJSSJ <=", value, "czjssj");
            return (Criteria) this;
        }

        public Criteria andCzjssjIn(List<Date> values) {
            addCriterion("CZJSSJ in", values, "czjssj");
            return (Criteria) this;
        }

        public Criteria andCzjssjNotIn(List<Date> values) {
            addCriterion("CZJSSJ not in", values, "czjssj");
            return (Criteria) this;
        }

        public Criteria andCzjssjBetween(Date value1, Date value2) {
            addCriterion("CZJSSJ between", value1, value2, "czjssj");
            return (Criteria) this;
        }

        public Criteria andCzjssjNotBetween(Date value1, Date value2) {
            addCriterion("CZJSSJ not between", value1, value2, "czjssj");
            return (Criteria) this;
        }

        public Criteria andTpdzIsNull() {
            addCriterion("TPDZ is null");
            return (Criteria) this;
        }

        public Criteria andTpdzIsNotNull() {
            addCriterion("TPDZ is not null");
            return (Criteria) this;
        }

        public Criteria andTpdzEqualTo(String value) {
            addCriterion("TPDZ =", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzNotEqualTo(String value) {
            addCriterion("TPDZ <>", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzGreaterThan(String value) {
            addCriterion("TPDZ >", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzGreaterThanOrEqualTo(String value) {
            addCriterion("TPDZ >=", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzLessThan(String value) {
            addCriterion("TPDZ <", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzLessThanOrEqualTo(String value) {
            addCriterion("TPDZ <=", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzLike(String value) {
            addCriterion("TPDZ like", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzNotLike(String value) {
            addCriterion("TPDZ not like", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzIn(List<String> values) {
            addCriterion("TPDZ in", values, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzNotIn(List<String> values) {
            addCriterion("TPDZ not in", values, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzBetween(String value1, String value2) {
            addCriterion("TPDZ between", value1, value2, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzNotBetween(String value1, String value2) {
            addCriterion("TPDZ not between", value1, value2, "tpdz");
            return (Criteria) this;
        }

        public Criteria andCzbzIsNull() {
            addCriterion("CZBZ is null");
            return (Criteria) this;
        }

        public Criteria andCzbzIsNotNull() {
            addCriterion("CZBZ is not null");
            return (Criteria) this;
        }

        public Criteria andCzbzEqualTo(String value) {
            addCriterion("CZBZ =", value, "czbz");
            return (Criteria) this;
        }

        public Criteria andCzbzNotEqualTo(String value) {
            addCriterion("CZBZ <>", value, "czbz");
            return (Criteria) this;
        }

        public Criteria andCzbzGreaterThan(String value) {
            addCriterion("CZBZ >", value, "czbz");
            return (Criteria) this;
        }

        public Criteria andCzbzGreaterThanOrEqualTo(String value) {
            addCriterion("CZBZ >=", value, "czbz");
            return (Criteria) this;
        }

        public Criteria andCzbzLessThan(String value) {
            addCriterion("CZBZ <", value, "czbz");
            return (Criteria) this;
        }

        public Criteria andCzbzLessThanOrEqualTo(String value) {
            addCriterion("CZBZ <=", value, "czbz");
            return (Criteria) this;
        }

        public Criteria andCzbzLike(String value) {
            addCriterion("CZBZ like", value, "czbz");
            return (Criteria) this;
        }

        public Criteria andCzbzNotLike(String value) {
            addCriterion("CZBZ not like", value, "czbz");
            return (Criteria) this;
        }

        public Criteria andCzbzIn(List<String> values) {
            addCriterion("CZBZ in", values, "czbz");
            return (Criteria) this;
        }

        public Criteria andCzbzNotIn(List<String> values) {
            addCriterion("CZBZ not in", values, "czbz");
            return (Criteria) this;
        }

        public Criteria andCzbzBetween(String value1, String value2) {
            addCriterion("CZBZ between", value1, value2, "czbz");
            return (Criteria) this;
        }

        public Criteria andCzbzNotBetween(String value1, String value2) {
            addCriterion("CZBZ not between", value1, value2, "czbz");
            return (Criteria) this;
        }

        public Criteria andBy1IsNull() {
            addCriterion("BY1 is null");
            return (Criteria) this;
        }

        public Criteria andBy1IsNotNull() {
            addCriterion("BY1 is not null");
            return (Criteria) this;
        }

        public Criteria andBy1EqualTo(String value) {
            addCriterion("BY1 =", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotEqualTo(String value) {
            addCriterion("BY1 <>", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1GreaterThan(String value) {
            addCriterion("BY1 >", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1GreaterThanOrEqualTo(String value) {
            addCriterion("BY1 >=", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1LessThan(String value) {
            addCriterion("BY1 <", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1LessThanOrEqualTo(String value) {
            addCriterion("BY1 <=", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1Like(String value) {
            addCriterion("BY1 like", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotLike(String value) {
            addCriterion("BY1 not like", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1In(List<String> values) {
            addCriterion("BY1 in", values, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotIn(List<String> values) {
            addCriterion("BY1 not in", values, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1Between(String value1, String value2) {
            addCriterion("BY1 between", value1, value2, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotBetween(String value1, String value2) {
            addCriterion("BY1 not between", value1, value2, "by1");
            return (Criteria) this;
        }

        public Criteria andBy2IsNull() {
            addCriterion("BY2 is null");
            return (Criteria) this;
        }

        public Criteria andBy2IsNotNull() {
            addCriterion("BY2 is not null");
            return (Criteria) this;
        }

        public Criteria andBy2EqualTo(String value) {
            addCriterion("BY2 =", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotEqualTo(String value) {
            addCriterion("BY2 <>", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2GreaterThan(String value) {
            addCriterion("BY2 >", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2GreaterThanOrEqualTo(String value) {
            addCriterion("BY2 >=", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2LessThan(String value) {
            addCriterion("BY2 <", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2LessThanOrEqualTo(String value) {
            addCriterion("BY2 <=", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2Like(String value) {
            addCriterion("BY2 like", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotLike(String value) {
            addCriterion("BY2 not like", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2In(List<String> values) {
            addCriterion("BY2 in", values, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotIn(List<String> values) {
            addCriterion("BY2 not in", values, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2Between(String value1, String value2) {
            addCriterion("BY2 between", value1, value2, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotBetween(String value1, String value2) {
            addCriterion("BY2 not between", value1, value2, "by2");
            return (Criteria) this;
        }

        public Criteria andBy3IsNull() {
            addCriterion("BY3 is null");
            return (Criteria) this;
        }

        public Criteria andBy3IsNotNull() {
            addCriterion("BY3 is not null");
            return (Criteria) this;
        }

        public Criteria andBy3EqualTo(String value) {
            addCriterion("BY3 =", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3NotEqualTo(String value) {
            addCriterion("BY3 <>", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3GreaterThan(String value) {
            addCriterion("BY3 >", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3GreaterThanOrEqualTo(String value) {
            addCriterion("BY3 >=", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3LessThan(String value) {
            addCriterion("BY3 <", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3LessThanOrEqualTo(String value) {
            addCriterion("BY3 <=", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3Like(String value) {
            addCriterion("BY3 like", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3NotLike(String value) {
            addCriterion("BY3 not like", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3In(List<String> values) {
            addCriterion("BY3 in", values, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3NotIn(List<String> values) {
            addCriterion("BY3 not in", values, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3Between(String value1, String value2) {
            addCriterion("BY3 between", value1, value2, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3NotBetween(String value1, String value2) {
            addCriterion("BY3 not between", value1, value2, "by3");
            return (Criteria) this;
        }

        public Criteria andCzrbhIsNull() {
            addCriterion("CZRBH is null");
            return (Criteria) this;
        }

        public Criteria andCzrbhIsNotNull() {
            addCriterion("CZRBH is not null");
            return (Criteria) this;
        }

        public Criteria andCzrbhEqualTo(String value) {
            addCriterion("CZRBH =", value, "czrbh");
            return (Criteria) this;
        }

        public Criteria andCzrbhNotEqualTo(String value) {
            addCriterion("CZRBH <>", value, "czrbh");
            return (Criteria) this;
        }

        public Criteria andCzrbhGreaterThan(String value) {
            addCriterion("CZRBH >", value, "czrbh");
            return (Criteria) this;
        }

        public Criteria andCzrbhGreaterThanOrEqualTo(String value) {
            addCriterion("CZRBH >=", value, "czrbh");
            return (Criteria) this;
        }

        public Criteria andCzrbhLessThan(String value) {
            addCriterion("CZRBH <", value, "czrbh");
            return (Criteria) this;
        }

        public Criteria andCzrbhLessThanOrEqualTo(String value) {
            addCriterion("CZRBH <=", value, "czrbh");
            return (Criteria) this;
        }

        public Criteria andCzrbhLike(String value) {
            addCriterion("CZRBH like", value, "czrbh");
            return (Criteria) this;
        }

        public Criteria andCzrbhNotLike(String value) {
            addCriterion("CZRBH not like", value, "czrbh");
            return (Criteria) this;
        }

        public Criteria andCzrbhIn(List<String> values) {
            addCriterion("CZRBH in", values, "czrbh");
            return (Criteria) this;
        }

        public Criteria andCzrbhNotIn(List<String> values) {
            addCriterion("CZRBH not in", values, "czrbh");
            return (Criteria) this;
        }

        public Criteria andCzrbhBetween(String value1, String value2) {
            addCriterion("CZRBH between", value1, value2, "czrbh");
            return (Criteria) this;
        }

        public Criteria andCzrbhNotBetween(String value1, String value2) {
            addCriterion("CZRBH not between", value1, value2, "czrbh");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 21 10:33:42 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
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