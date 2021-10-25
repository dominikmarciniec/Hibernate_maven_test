package hibernate;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "dept_manager", schema = "employees", catalog = "")
@IdClass(DeptManagerPK.class)
public class DeptManager {
    private Integer empNo;
    private String deptNo;
    private Date fromDate;
    private Date toDate;
    private Employees employeesByEmpNo;
    private Departments departmentsByDeptNo;

    @Id
    @Column(name = "emp_no")
    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    @Id
    @Column(name = "dept_no")
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Basic
    @Column(name = "from_date")
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "to_date")
    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeptManager that = (DeptManager) o;

        if (empNo != null ? !empNo.equals(that.empNo) : that.empNo != null) return false;
        if (deptNo != null ? !deptNo.equals(that.deptNo) : that.deptNo != null) return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo != null ? empNo.hashCode() : 0;
        result = 31 * result + (deptNo != null ? deptNo.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "emp_no", referencedColumnName = "emp_no", nullable = false)
    public Employees getEmployeesByEmpNo() {
        return employeesByEmpNo;
    }

    public void setEmployeesByEmpNo(Employees employeesByEmpNo) {
        this.employeesByEmpNo = employeesByEmpNo;
    }

    @ManyToOne
    @JoinColumn(name = "dept_no", referencedColumnName = "dept_no", nullable = false)
    public Departments getDepartmentsByDeptNo() {
        return departmentsByDeptNo;
    }

    public void setDepartmentsByDeptNo(Departments departmentsByDeptNo) {
        this.departmentsByDeptNo = departmentsByDeptNo;
    }
}
