package hibernate;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Employees {
    private Integer empNo;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private Object gender;
    private Date hireDate;
    private Collection<DeptEmp> deptEmpsByEmpNo;
    private Collection<DeptManager> deptManagersByEmpNo;
    private Collection<Salaries> salariesByEmpNo;
    private Collection<Titles> titlesByEmpNo;
    private Collection<Titles> titlesByEmpNo_0;

    @Id
    @Column(name = "emp_no")
    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "birth_date")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "gender")
    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "hire_date")
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employees employees = (Employees) o;

        if (empNo != null ? !empNo.equals(employees.empNo) : employees.empNo != null) return false;
        if (birthDate != null ? !birthDate.equals(employees.birthDate) : employees.birthDate != null) return false;
        if (firstName != null ? !firstName.equals(employees.firstName) : employees.firstName != null) return false;
        if (lastName != null ? !lastName.equals(employees.lastName) : employees.lastName != null) return false;
        if (gender != null ? !gender.equals(employees.gender) : employees.gender != null) return false;
        if (hireDate != null ? !hireDate.equals(employees.hireDate) : employees.hireDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo != null ? empNo.hashCode() : 0;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "employeesByEmpNo")
    public Collection<DeptEmp> getDeptEmpsByEmpNo() {
        return deptEmpsByEmpNo;
    }

    public void setDeptEmpsByEmpNo(Collection<DeptEmp> deptEmpsByEmpNo) {
        this.deptEmpsByEmpNo = deptEmpsByEmpNo;
    }

    @OneToMany(mappedBy = "employeesByEmpNo")
    public Collection<DeptManager> getDeptManagersByEmpNo() {
        return deptManagersByEmpNo;
    }

    public void setDeptManagersByEmpNo(Collection<DeptManager> deptManagersByEmpNo) {
        this.deptManagersByEmpNo = deptManagersByEmpNo;
    }

    @OneToMany(mappedBy = "employeesByEmpNo")
    public Collection<Salaries> getSalariesByEmpNo() {
        return salariesByEmpNo;
    }

    public void setSalariesByEmpNo(Collection<Salaries> salariesByEmpNo) {
        this.salariesByEmpNo = salariesByEmpNo;
    }

    @OneToMany(mappedBy = "employeesByEmpNo")
    public Collection<Titles> getTitlesByEmpNo() {
        return titlesByEmpNo;
    }

    public void setTitlesByEmpNo(Collection<Titles> titlesByEmpNo) {
        this.titlesByEmpNo = titlesByEmpNo;
    }

    @OneToMany(mappedBy = "employeesByEmployeesEmpNo")
    public Collection<Titles> getTitlesByEmpNo_0() {
        return titlesByEmpNo_0;
    }

    public void setTitlesByEmpNo_0(Collection<Titles> titlesByEmpNo_0) {
        this.titlesByEmpNo_0 = titlesByEmpNo_0;
    }
}
