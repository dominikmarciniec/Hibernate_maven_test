package hibernate;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

public class TitlesPK implements Serializable {
    private Integer empNo;
    private String title;
    private Date fromDate;

    @Column(name = "emp_no")
    @Id
    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    @Column(name = "title")
    @Id
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "from_date")
    @Id
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitlesPK titlesPK = (TitlesPK) o;

        if (empNo != null ? !empNo.equals(titlesPK.empNo) : titlesPK.empNo != null) return false;
        if (title != null ? !title.equals(titlesPK.title) : titlesPK.title != null) return false;
        if (fromDate != null ? !fromDate.equals(titlesPK.fromDate) : titlesPK.fromDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo != null ? empNo.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        return result;
    }
}
