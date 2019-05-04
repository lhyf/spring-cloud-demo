package org.lhyf.cloud.entity;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

//@AllArgsConstructor // 全参
//@NoArgsConstructor  // 无参
//@Data               // getter setter toString hashCode equals
//@Accessors(chain = true) // 链式访问

@Table(name = "t_dept")
public class Dept implements Serializable {
    @Id
    @Column(name = "dept_no")
    private Integer deptNo;

    @Column(name = "d_name")
    private String dName;

    @Column(name = "db_source")
    private String dbSource;

    /**
     * @return dept_no
     */
    public Integer getDeptNo() {
        return deptNo;
    }

    /**
     * @param deptNo
     */
    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    /**
     * @return d_name
     */
    public String getdName() {
        return dName;
    }

    /**
     * @param dName
     */
    public void setdName(String dName) {
        this.dName = dName;
    }

    /**
     * @return db_source
     */
    public String getDbSource() {
        return dbSource;
    }

    /**
     * @param dbSource
     */
    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}