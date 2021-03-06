package com.cxt.crud.bean;

public class Department {

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Department(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Department() {
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tnp_dept.dept_id
     *
     * @mbg.generated Fri Aug 02 11:38:25 GMT+08:00 2019
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tnp_dept.dept_name
     *
     * @mbg.generated Fri Aug 02 11:38:25 GMT+08:00 2019
     */
    private String deptName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tnp_dept.dept_id
     *
     * @return the value of tnp_dept.dept_id
     *
     * @mbg.generated Fri Aug 02 11:38:25 GMT+08:00 2019
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tnp_dept.dept_id
     *
     * @param deptId the value for tnp_dept.dept_id
     *
     * @mbg.generated Fri Aug 02 11:38:25 GMT+08:00 2019
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tnp_dept.dept_name
     *
     * @return the value of tnp_dept.dept_name
     *
     * @mbg.generated Fri Aug 02 11:38:25 GMT+08:00 2019
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tnp_dept.dept_name
     *
     * @param deptName the value for tnp_dept.dept_name
     *
     * @mbg.generated Fri Aug 02 11:38:25 GMT+08:00 2019
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}