package com.example.mbura.parcelableexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.txtview);
        textView.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        int studentAge=1;
        StudentInfoVM studentInfoVM=new StudentInfoVM("MBB", "Istanbul University" , studentAge);

        Intent intent=new Intent(this, StudentActivity.class);
       // intent.putExtra("student2",new studentInfoVM());

        Bundle bundle=new Bundle();
        bundle.putParcelable("student2",studentInfoVM);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
