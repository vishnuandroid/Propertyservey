package com.versatilemobitech.servey;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.versatilemobitech.adapter.DatabaseHandler;
import com.versatilemobitech.bean.ProperyBean;
import com.versatilemobitech.util.CaptureSignature;

public class HServeyorDetails extends BaserActinbBar{


	private EditText et_sName;
	private EditText et_saddress;
	private EditText et_sId;
	private TextView tv_sDate;

	//private EditText et_aaName;
	//private EditText et_aaDesig;
	//private TextView tv_aaDate;
	private Button btn_submit;
	private DatabaseHandler dbHandler;
	private ProperyBean pbean;
	Calendar myCalendar = Calendar.getInstance();
	public static final int SIGNATURE_ACTIVITY = 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.serveyerdetails);
		dbHandler=new DatabaseHandler(getApplicationContext());

		et_sName=(EditText)findViewById(R.id.et_servyerName);
		
		et_saddress=(EditText)findViewById(R.id.et_serveyoradd);
		et_sId=(EditText)findViewById(R.id.et_serveyorId);
		tv_sDate=(TextView)findViewById(R.id.et_date);

		pbean=ProperyBean.getInstance();


		et_sName.setText(pbean.getUserName());
		et_sId.setText(pbean.getUserID());

		tv_sDate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DatePickerDialog	datepickerDialog=new DatePickerDialog(HServeyorDetails.this, date, myCalendar
						.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
						myCalendar.get(Calendar.DAY_OF_MONTH));
				datepickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
				datepickerDialog.show();
			}
		});


		//et_aaName=(EditText)findViewById(R.id.et_attastauthName);
		//et_aaDesig=(EditText)findViewById(R.id.et_attastauthdisig);
		//tv_aaDate=(TextView)findViewById(R.id.et_attastauthdate);

		/*tv_aaDate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				DatePickerDialog datepickerDialog=	new DatePickerDialog(HServeyorDetails.this, date2, myCalendar
						.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
						myCalendar.get(Calendar.DAY_OF_MONTH));
				datepickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
				datepickerDialog.show();
			}
		});*/

		btn_submit=(Button)findViewById(R.id.btn_submit);

		btn_submit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {


				if(et_sName.getText().toString().length()>0 && et_saddress.getText().toString().length()>0 && et_sId.getText().toString().length()>0 && tv_sDate.getText().toString().length()>0
						/*&& et_aaName.getText().toString().length()>0 && tv_aaDate.getText().toString().length()>0*/)
				{
					ProperyBean bean=ProperyBean.getInstance();
					bean.setNameOfSurveyor(et_sName.getText().toString());
					bean.setSurveyorAddress(et_saddress.getText().toString());
					bean.setIdCodeOfSurveyor(et_sId.getText().toString());
					bean.setDate_Surveyor(tv_sDate.getText().toString());
					/*bean.setNameOfAttestingAuthority(et_aaName.getText().toString());
					bean.setDesignationOfAttestingAuthority(et_aaDesig.getText().toString());
					bean.setDate_Attesting(tv_aaDate.getText().toString());*/


					Intent intent = new Intent(HServeyorDetails.this, CaptureSignature.class); 
					startActivityForResult(intent,SIGNATURE_ACTIVITY);
				}
				else{
					if(et_sName.getText().toString().length()==0)
						et_sName.setError("Invalide");
					Toast.makeText(getApplicationContext(), "Please provide required fields", Toast.LENGTH_LONG).show();
				}

			}
		});


	}






	DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			// TODO Auto-generated method stub
			myCalendar.set(Calendar.YEAR, year);
			myCalendar.set(Calendar.MONTH, monthOfYear);
			myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
			updateLabel();
		}

	};


	/*DatePickerDialog.OnDateSetListener date2 = new DatePickerDialog.OnDateSetListener() {

		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			// TODO Auto-generated method stub
			myCalendar.set(Calendar.YEAR, year);
			myCalendar.set(Calendar.MONTH, monthOfYear);
			myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
			updateLabelTwo();
		}

	};*/

	/*private void updateLabelTwo() {

		String myFormat = "yyyy-MM-dd";//"dd/MM/yyyy"; //In which you need put here
		SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

		tv_aaDate.setText(sdf.format(myCalendar.getTime()));
	}*/


	private void updateLabel() {

		String myFormat ="yyyy-MM-dd";// "dd/MM/yyyy"; //In which you need put here
		SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

		tv_sDate.setText(sdf.format(myCalendar.getTime()));
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		switch(requestCode) {
		case SIGNATURE_ACTIVITY: 
			if (resultCode == RESULT_OK) {

				Bundle bundle = data.getExtras();
				String status  = bundle.getString("status");
				String path=bundle.getString("path");
				if(status.equalsIgnoreCase("done")){
					Toast toast = Toast.makeText(this, "Signature captured.", Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.TOP, 105, 50);
					toast.show();

					ProperyBean.getInstance().setSignatureImgPath(path);

					finish();



					Intent i=new Intent(getApplicationContext(),MyServey.class);
					startActivity(i);
				}
			}
			break;
		}

	}  
}
