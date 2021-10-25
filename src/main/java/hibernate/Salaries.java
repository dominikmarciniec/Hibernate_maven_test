package hibernate;

import javax.persistence.*;
import java.sql.Date;

@Entity
@IdClass(SalariesPK.class)
public class Salaries {
    private Integer empNo;
    private Integer salary;
    private Date fromDate;
    private Date toDate;
    private Integer id;
    private Employees employeesByEmpNo;

    @Id
    @Column(name = "emp_no")
    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "salary")
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Id
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

    @Basic
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salaries salaries = (Salaries) o;

        if (empNo != null ? !empNo.equals(salaries.empNo) : salaries.empNo != null) return false;
        if (salary != null ? !salary.equals(salaries.salary) : salaries.salary != null) return false;
        if (fromDate != null ? !fromDate.equals(salaries.fromDate) : salaries.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(salaries.toDate) : salaries.toDate != null) return false;
        if (id != null ? !id.equals(salaries.id) : salaries.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo != null ? empNo.hashCode() : 0;
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
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
}
