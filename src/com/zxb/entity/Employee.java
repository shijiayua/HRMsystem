package com.zxb.entity;

/**
 *员工表
 * Created by Administrator on 2018/10/18.
 */
public class Employee {
    private int eid;//员工id;
    private String ename;
    private String sex;
    private int age;
    private String education;
    private String tel;
    private String email;
    private String depe;//所在部门
    private String position;//职位
    private String entry_time;//入职时间
    private String politic_status;//政治面貌
    private String hobble;//爱好

    public String getHobble() {
        return hobble;
    }

    public void setHobble(String hobble) {
        this.hobble = hobble;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepe() {
        return depe;
    }

    public void setDepe(String depe) {
        this.depe = depe;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(String entry_time) {
        this.entry_time = entry_time;
    }

    public String getPolitic_status() {
        return politic_status;
    }

    public void setPolitic_status(String politic_status) {
        this.politic_status = politic_status;
    }

    public Employee() {
    }

    public Employee(int eid, String ename, String sex, int age, String education, String tel, String email, String depe, String position, String entry_time, String politic_status, String hobble) {
        this.eid = eid;
        this.ename = ename;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.tel = tel;
        this.email = email;
        this.depe = depe;
        this.position = position;
        this.entry_time = entry_time;
        this.politic_status = politic_status;
        this.hobble = hobble;
    }

    public Employee(String ename, String sex, int age, String education, String tel, String email, String depe, String position, String entry_time, String politic_status, String hobble) {
        this.ename = ename;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.tel = tel;
        this.email = email;
        this.depe = depe;
        this.position = position;
        this.entry_time = entry_time;
        this.politic_status = politic_status;
        this.hobble = hobble;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", depe='" + depe + '\'' +
                ", position='" + position + '\'' +
                ", entry_time='" + entry_time + '\'' +
                ", politic_status='" + politic_status + '\'' +
                ", hobble='" + hobble + '\'' +
                '}';
    }
}
