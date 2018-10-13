package com.zxb.entity;

/**
 * 招聘信息表
 * Created by Administrator on 2018/10/13.
 */
public class Recuitment {
    private int id;
    private String position;//职位
    private String publish_time;//发布时间
    private String dutys;//职责
    private String job_request;//职位要求
    private String company_address;//公司地址
    private double give_salary;//给与薪资
    private String company_tel;//公司电话

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }

    public String getDutys() {
        return dutys;
    }

    public void setDutys(String dutys) {
        this.dutys = dutys;
    }

    public String getJob_request() {
        return job_request;
    }

    public void setJob_request(String job_request) {
        this.job_request = job_request;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public double getGive_salary() {
        return give_salary;
    }

    public void setGive_salary(double give_salary) {
        this.give_salary = give_salary;
    }

    public String getCompany_tel() {
        return company_tel;
    }

    public void setCompany_tel(String company_tel) {
        this.company_tel = company_tel;
    }

    public Recuitment(int id, String position, String publish_time, String dutys, String job_request, String company_address, double give_salary, String company_tel) {
        this.id = id;
        this.position = position;
        this.publish_time = publish_time;
        this.dutys = dutys;
        this.job_request = job_request;
        this.company_address = company_address;
        this.give_salary = give_salary;
        this.company_tel = company_tel;
    }

    public Recuitment() {
    }

    public Recuitment(String position, String publish_time, String dutys, String job_request, String company_address, double give_salary, String company_tel) {
        this.position = position;
        this.publish_time = publish_time;
        this.dutys = dutys;
        this.job_request = job_request;
        this.company_address = company_address;
        this.give_salary = give_salary;
        this.company_tel = company_tel;
    }
    @Override
    public String toString() {
        return "RecuitmentService{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", publish_time='" + publish_time + '\'' +
                ", dutys='" + dutys + '\'' +
                ", job_request='" + job_request + '\'' +
                ", company_address='" + company_address + '\'' +
                ", give_salary=" + give_salary +
                ", company_tel='" + company_tel + '\'' +
                '}';
    }
}
