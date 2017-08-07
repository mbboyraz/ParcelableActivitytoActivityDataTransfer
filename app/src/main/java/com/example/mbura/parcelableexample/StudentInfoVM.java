package com.example.mbura.parcelableexample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mbura on 5.08.2017.
 */

public class StudentInfoVM implements Parcelable {
    private String studentName;
    private String schoolName;
    private int studentAge;

    public StudentInfoVM(String studentName,String schoolName,int studentAge){
        this.studentName=studentName;
        this.schoolName=schoolName;
        this.studentAge=studentAge;

    }

    private StudentInfoVM(Parcel in) {
        studentName = in.readString();
        schoolName = in.readString();
        studentAge = in.readInt();
    }

    public static final Creator<StudentInfoVM> CREATOR = new Creator<StudentInfoVM>() {
        @Override
        public StudentInfoVM createFromParcel(Parcel in) {
            return new StudentInfoVM(in);
        }

        @Override
        public StudentInfoVM[] newArray(int size) {
            return new StudentInfoVM[size];
        }
    };

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(studentName);
        parcel.writeString(schoolName);
        parcel.writeInt(studentAge);

    }
}
