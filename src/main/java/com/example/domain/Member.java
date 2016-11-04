package com.example.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Created by Armando on 10/28/2016.
 */
@Entity
public class Member {
    public Integer getmID() {
        return mID;
    }

    public void setmID(Integer mID) {
        this.mID = mID;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String mFullName;

//    public void setmProjects(List<String> mProjects) {
//        this.mProjects = mProjects;
//    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Version
    private Integer version;
    private String mEmail;
    private String mMajor;
//    private Map<String, String> mUrls;
    private Integer mID;
    private String mImagePath;
//    private List<String> mProjects;

    public Member(String mFullName, String mEmail, Integer i){
        this.mEmail=mEmail;
        this.mFullName=mFullName;
        this.mID=i;
    }

    public Member(String mFullName, String mEmail, String mMajor, Map<String, String> mUrls, Integer mid, String mImagePath, List mProjects) {
        this.mFullName = mFullName;
        this.mEmail = mEmail;
        this.mMajor = mMajor;
//        this.mUrls = mUrls;
        this.mID = mid;
        this.mImagePath = mImagePath;
//        this.mProjects = mProjects;
    }

    public Integer getMid() {
        return mID;
    }

    public void setMid(Integer mid) {
        this.mID = mid;
    }
    public String getmImagePath() {
        return mImagePath;
    }

    public void setmImagePath(String mImagePath) {
        this.mImagePath = mImagePath;
    }

//    public Map<String, String> getmUrls() {
//        return mUrls;
//    }

//    public void setmUrls(Map<String, String> mUrls) {
//        this.mUrls = mUrls;
//    }

    public String getmFullName() {
        return mFullName;
    }

    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }

//    public List getmProjects() {
//        return mProjects;
//    }

//    public void setmProjects(List mProjects) {
//        this.mProjects = mProjects;
//    }

    public String getmMajor() {
        return mMajor;
    }

    public void setmMajor(String mMajor) {
        this.mMajor = mMajor;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }


}
