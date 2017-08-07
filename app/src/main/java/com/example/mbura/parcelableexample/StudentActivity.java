 package com.example.mbura.parcelableexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

 public class StudentActivity extends AppCompatActivity {
    private TextView txtStudentName;
     private TextView txtSchoolName;
     private TextView txtStudentAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        navi();
        StudentInfoVM studentInfoVM= getIntent().getParcelableExtra("student2");
        Log.e("name:",studentInfoVM.getStudentName());
       Log.e("age:",String.valueOf(studentInfoVM.getStudentAge()));
       Log.e("schoolName:",studentInfoVM.getSchoolName());
        txtStudentName.setText(studentInfoVM.getStudentName());
        txtSchoolName.setText(studentInfoVM.getSchoolName());
        txtStudentAge.setText(String.valueOf(studentInfoVM.getStudentAge()));

    }
    public void navi(){
        txtStudentName= (TextView) findViewById(R.id.txtStudentName);
        txtSchoolName= (TextView) findViewById(R.id.txtSchoolName);
        txtStudentAge= (TextView) findViewById(R.id.txtStudentAge);
    }

}
