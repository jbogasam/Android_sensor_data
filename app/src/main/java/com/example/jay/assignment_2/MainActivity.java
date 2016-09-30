package com.example.jay.assignment_2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static EditText patientID;
    public static EditText age;
    public static EditText name;
    public static RadioButton radioButton;
    RadioGroup sex;
    Button save_btn;
    Dbhelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        patientID = (EditText) findViewById(R.id.editText);
        age = (EditText) findViewById(R.id.editText3);
        name = (EditText) findViewById(R.id.editText2);
        sex = (RadioGroup) findViewById(R.id.radioGroup);
        save_btn = (Button) findViewById(R.id.button);
    }

    public void onbuttonClick(View v) {

        if(sex.getCheckedRadioButtonId()!=-1){
            int id= sex.getCheckedRadioButtonId();
            radioButton = (RadioButton) findViewById(id);
        }
        myDB = new Dbhelper(this);
        Toast.makeText(MainActivity.this,"Database Created Succesfully!!",Toast.LENGTH_LONG).show();

    }
}
