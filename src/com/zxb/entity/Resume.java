package com.zxb.entity;

/**
 *简历实体类
 * Created by Administrator on 2018/10/12.
 */
public class Resume {
    private int id;
    private String name;
    private Integer age;
    private String sex;
    private String education;//教育经历
    private String tel;
    private String email;
    private String appliccation_dept;//应聘部门
    private String application_job;//应聘职位
    private String politic_status;//政治面貌
    private String last_job;//上份工作
    private String experience;//工作经验
    private String expected_salary;//期望薪资
    private String hobby;//兴趣爱好

    public String getAppliccation_dept() {
        return appliccation_dept;
    }

    public void setAppliccation_dept(String appliccation_dept) {
        this.appliccation_dept = appliccation_dept;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
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
    public String getApplication_job() {
        return application_job;
    }
    public void setApplication_job(String application_job) {
        this.application_job = application_job;
    }
    public String getPolitic_status() {
        return politic_status;
    }
    public void setPolitic_status(String politic_status) {
        this.politic_status = politic_status;
    }
    public String getLast_job() {
        return last_job;
    }
    public void setLast_job(String last_job) {
        this.last_job = last_job;
    }
    public String getExperience() {
        return experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
    public String getExpected_salary() {
        return expected_salary;
    }
    public void setExpected_salary(String expected_salary) {
        this.expected_salary = expected_salary;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public Resume() {
    }

    public Resume(int id, String name, Integer age, String sex, String education, String tel, String email, String appliccation_dept, String application_job, String politic_status, String last_job, String experience, String expected_salary, String hobby) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.education = education;
        this.tel = tel;
        this.email = email;
        this.appliccation_dept = appliccation_dept;
        this.application_job = application_job;
        this.politic_status = politic_status;
        this.last_job = last_job;
        this.experience = experience;
        this.expected_salary = expected_salary;
        this.hobby = hobby;
    }

    public Resume(String name, Integer age, String sex, String education, String tel, String email, String appliccation_dept, String application_job, String politic_status, String last_job, String experience, String expected_salary, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.education = education;
        this.tel = tel;
        this.email = email;
        this.appliccation_dept = appliccation_dept;
        this.application_job = application_job;
        this.politic_status = politic_status;
        this.last_job = last_job;
        this.experience = experience;
        this.expected_salary = expected_salary;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", education='" + education + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", appliccation_dept='" + appliccation_dept + '\'' +
                ", application_job='" + application_job + '\'' +
                ", politic_status='" + politic_status + '\'' +
                ", last_job='" + last_job + '\'' +
                ", experience='" + experience + '\'' +
                ", expected_salary='" + expected_salary + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
