package com.example.train_android_checkbox;

import android.os.Bundle;
import android.R.string;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText hoten = (EditText) findViewById(R.id.hoten);
		final EditText cmnd = (EditText) findViewById(R.id.cmnd);
		final TextView nameout = (TextView) findViewById(R.id.nameout);
		final TextView cmndout = (TextView) findViewById(R.id.cmndout);
		final TextView trinhdoout = (TextView) findViewById(R.id.trinhdoout);
		final TextView sothichout = (TextView) findViewById(R.id.sothichout);
		final CheckBox st1 = (CheckBox) findViewById(R.id.checkBox1);
		final CheckBox st2 = (CheckBox) findViewById(R.id.checkBox2);
		final CheckBox st3 = (CheckBox) findViewById(R.id.checkBox3);
		final RadioButton td1 = (RadioButton) findViewById(R.id.radio1);
		final RadioButton td2 = (RadioButton) findViewById(R.id.radio2);
		final RadioButton td3 = (RadioButton) findViewById(R.id.radio3);
		td1.setChecked(true);
		
		final AlertDialog.Builder comfirm = new AlertDialog.Builder(MainActivity.this);
		Button comfi = (Button) findViewById(R.id.comfirm);
		comfirm.setTitle("Comfirm infomation");
		comfirm.setMessage("Are you sure?");
		comfirm.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				if (td1.isChecked()) 
				{
					trinhdoout.setText(td1.getText());
				}
				else if (td2.isChecked()) 
				{
					trinhdoout.setText(td2.getText());
				}
				else {
					trinhdoout.setText(td3.getText());
				}
				
				
				
				String st = "";
				if (st1.isChecked())
				{
					st=st+(st1.getText())+" ";
				}
				else {
					st=st+" ";
				}
				if (st2.isChecked())
				{
					st=st+(st2.getText())+" ";
				}
				else {
					st=st+" ";
				}
				if (st3.isChecked())
				{
					st=st+(st3.getText())+" ";
				}
				else {
					st=st+" ";
				}
				
				
				nameout.setText("Ho va ten: "+ hoten.getText());
				cmndout.setText("CMND: "+ cmnd.getText());
				sothichout.setText(st);
				}
		});
		
		comfirm.setNegativeButton("No", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
		
		comfi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				comfirm.create();
				comfirm.show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
