package hibernate;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class DeptEmpPK implements Serializable {
    private Integer empNo;
    private String deptNo;

    @Column(name = "emp_no")
    @Id
    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    @Column(name = "dept_no")
    @Id
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeptEmpPK deptEmpPK = (DeptEmpPK) o;

        if (empNo != null ? !empNo.equals(deptEmpPK.empNo) : deptEmpPK.empNo != null) return false;
        if (deptNo != null ? !deptNo.equals(deptEmpPK.deptNo) : deptEmpPK.deptNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo != null ? empNo.hashCode() : 0;
        result = 31 * result + (deptNo != null ? deptNo.hashCode() : 0);
        return result;
    }
}
