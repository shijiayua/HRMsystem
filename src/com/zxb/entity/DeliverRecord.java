package com.zxb.entity;


import java.sql.Date;

/**
 *����Ͷ�ݼ�¼
 * Created by Administrator on 2018/10/17.
 */
public class DeliverRecord {
    private  int rid;
    private  String interviewer;
    private Date deliver_time;
    private int look_staus;//�Ƿ�鿴 0��δ�鿴�鿴��1���Ѿ��鿴
    private int interview_staus;//����״̬0δ����1������

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public Date getDeliver_time() {
        return deliver_time;
    }

    public String getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(String interviewer) {
        this.interviewer = interviewer;
    }



    public void setDeliver_time(Date deliver_time) {
        this.deliver_time = deliver_time;
    }

    public int getLook_staus() {
        return look_staus;
    }

    public void setLook_staus(int look_staus) {
        this.look_staus = look_staus;
    }

    public int getInterview_staus() {
        return interview_staus;
    }

    public void setInterview_staus(int interview_staus) {
        this.interview_staus = interview_staus;
    }

    public DeliverRecord() {
    }
    public DeliverRecord(String interviewer, Date deliver_time, int look_staus, int interview_staus) {
        this.interviewer = interviewer;
        this.deliver_time = deliver_time;
        this.look_staus = look_staus;
        this.interview_staus = interview_staus;
    }

    public DeliverRecord(int rid, String interviewer, Date deliver_time, int look_staus, int interview_staus) {
        this.rid = rid;
        this.interviewer = interviewer;
        this.deliver_time = deliver_time;
        this.look_staus = look_staus;
        this.interview_staus = interview_staus;
    }

    @Override
    public String toString() {
        return "DeliverRecord{" +
                "rid=" + rid +
                ", interviewer='" + interviewer + '\'' +
                ", deliver_time=" + deliver_time +
                ", look_staus=" + look_staus +
                ", interview_staus=" + interview_staus +
                '}';
    }
}
