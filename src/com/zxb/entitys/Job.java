package com.zxb.entitys;

/**
 * Created by Administrator on 2018/10/12.
 */
public class Job {
    private int id;
    private String job_name;
    private Department department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Job() {
    }

    public Job(int id, String job_name, Department department) {
        this.id = id;
        this.job_name = job_name;
        this.department = department;
    }

    public Job(String job_name, Department department) {
        this.job_name = job_name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", job_name='" + job_name + '\'' +
                ", department=" + department +
                '}';
    }
}
