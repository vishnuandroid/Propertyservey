package com.versatilemobitech.servey;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.versatilemobitech.adapter.CustomAdapter;
import com.versatilemobitech.bean.ProperyBean;
import com.versatilemobitech.bean.SpinnerItemBean;

public class DTaxPayerPropertyDetails extends BaserActinbBar{
	Button btn_Next,btn_Prev;

	//EditText PlotORFlatNo=null;
	String Zone="";
	EditText ColonyName=null;
	EditText City=null;
	EditText state=null;
	EditText NameOfBuildin_Post=null;
	String DetailsOfOwnership="";
	EditText WhetherConstructionOnPlot_lenth=null;
	EditText WhetherConstructionOnPlot_width=null;
	String TypeOfConstruction=null;
	EditText NameOfLaneOrRoad=null;
	String Ward ="";
	EditText Landmark=null;
	EditText District=null;
	EditText NameOfBuilding_Pre=null;
	EditText MultistoreyBuildigNameofBuilding=null;
	EditText flatno;
	CheckBox chk_Constrution;
	EditText et_lengthfeets,et_widthFeets;

	LinearLayout ll_chk_constructionplot;
	ProperyBean pbean;

	private String Zone_id="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.taxpayerpropertydetails);
		pbean=ProperyBean.getInstance();

		//Data mapping....
		final LinkedHashMap<String, String> wardMaping=new LinkedHashMap<String, String>();


		wardMaping.put("Select", "Select");
		wardMaping.put("Vidyanagar", "1,2,3,4,5,6,7,8,9,10,15,16,17,66,67,68,69");

		wardMaping.put("Civil line","11,12,13,14,18,19,20,21,22,41,42,43,63");
		wardMaping.put("Mansarovar","23,24,25,26,27,28,29,40");
		wardMaping.put("Sanganer","30,31,32,33,34,36,37");

		wardMaping.put("Moti Doongari","35,38,39,44,45,46,47,48,50,51");
		wardMaping.put("Hawamahal Zone (East)","49,52,53,54,55,56,57,58,59,72,73");
		wardMaping.put("Hawamahal Zone (West)","60,61,62,64,65,70,71");
		wardMaping.put("Amer","	74,75,76,77");


		ll_chk_constructionplot=(LinearLayout)findViewById(R.id.ll_constructonplot);
		et_lengthfeets=(EditText)findViewById(R.id.et_lengthfeets);
		et_widthFeets=(EditText)findViewById(R.id.et_widthfeets);
		chk_Constrution=(CheckBox)findViewById(R.id.chk_constructiononplot);
		flatno=(EditText)findViewById(R.id.et_flatno);
		ColonyName=(EditText)findViewById(R.id.et_colonyname);
		City=(EditText)findViewById(R.id.et_city);
		state=(EditText)findViewById(R.id.et_state);
		NameOfBuildin_Post=(EditText)findViewById(R.id.et_buildingdesc);
		//DetailsOfOwnership=(EditText)findViewById(R.id.et_);
		WhetherConstructionOnPlot_lenth=(EditText)findViewById(R.id.et_lengthfeets);
		WhetherConstructionOnPlot_width=(EditText)findViewById(R.id.et_widthfeets);
		//TypeOfConstruction=null;
		NameOfLaneOrRoad=(EditText)findViewById(R.id.et_laneroad);
		//Ward =(EditText)findViewById(R.id.et_w);
		Landmark=(EditText)findViewById(R.id.et_landmark);
		District=(EditText)findViewById(R.id.et_district);
		NameOfBuilding_Pre=(EditText)findViewById(R.id.et_prebuildingname);
		MultistoreyBuildigNameofBuilding=(EditText)findViewById(R.id.et_postbuildingname);
		btn_Next=(Button)findViewById(R.id.btn_next);
		btn_Prev=(Button)findViewById(R.id.btn_prev);

		/*NameOfLaneOrRoad.setText(pbean.getNameOfLane_Road().toString());
		et_lengthfeets.setText(pbean.getLength().toString());
		et_widthFeets.setText(pbean.getWidth().toString());
		flatno.setText(pbean.getNameOfLane_Road().toString());
		ColonyName.setText(pbean.getColony_Name().toString());
		City.setText(pbean.getCity().toString());
		state.setText(pbean.getState().toString());
		NameOfBuildin_Post.setText(pbean.getName_No_OfBuilding().toString());
		Landmark.setText(pbean.getLandmark().toString());
		District.setText(pbean.getDistrict().toString());
		NameOfBuilding_Pre.setText(pbean.getName_No_OfBuilding_pre().toString());
		MultistoreyBuildigNameofBuilding.setText(pbean.getMarriageGardenHall().toString());*/

		chk_Constrution.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub

				if(arg1){
					et_lengthfeets.setEnabled(true);
					et_widthFeets.setEnabled(true);
				}else{

					et_lengthfeets.setText("");
					et_widthFeets.setText("");
					et_lengthfeets.setEnabled(false);
					et_widthFeets.setEnabled(false);
					//et_lengthfeets.setBackgroundResource(R.drawable.et_corner_shape_desabled);
					//et_widthFeets.setBackgroundResource(R.drawable.et_corner_shape_desabled);
				}
			}
		});

		btn_Next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if(!flatno.getText().toString().equals("") && !NameOfLaneOrRoad.getText().toString().equals("")&& !ColonyName.getText().toString().equals("") && (!Zone_id.equals("")) && (!state.getText().toString().equals(""))){

					//	pbean.setPlot_Flat_ShopNo(PlotORFlatNo.getText().toString());
					pbean.setColony_Name(ColonyName.getText().toString());
					pbean.setCity(City.getText().toString());
					pbean.setState(state.getText().toString());
					//	pbean.setName_No_OfBuilding(NameOfBuildin_Post.getText().toString());
					pbean.setLength(WhetherConstructionOnPlot_lenth.getText().toString());
					pbean.setWidth(WhetherConstructionOnPlot_width.getText().toString());
					pbean.setNameOfLane_Road(NameOfLaneOrRoad.getText().toString());
					pbean.setLandmark(Landmark.getText().toString());;
					pbean.setDistrict(District.getText().toString());
					pbean.setName_No_OfBuilding_pre(NameOfBuilding_Pre.getText().toString());
					pbean.setName_No_OfBuilding(NameOfBuildin_Post.getText().toString());

					pbean.setDetailsOfOwnership(DetailsOfOwnership);
					pbean.setZone(Zone_id);
					pbean.setWard(Ward);
					pbean.setTypOfConstruction(TypeOfConstruction);


					Intent i=new Intent(getApplicationContext(),ETaxPayerMeasurementDetails.class);
					startActivity(i);
				}else{
					Toast.makeText(getApplicationContext(), "Please enter required fields", Toast.LENGTH_LONG).show();
				}


			}
		});

		btn_Prev.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				ProperyBean pbean=ProperyBean.getInstance();
				//	pbean.setPlot_Flat_ShopNo(PlotORFlatNo.getText().toString());
				pbean.setNameOfLane_Road(NameOfLaneOrRoad.getText().toString());
				pbean.setColony_Name(ColonyName.getText().toString());
				pbean.setCity(City.getText().toString());
				pbean.setState(state.getText().toString());
				//	pbean.setName_No_OfBuilding(NameOfBuildin_Post.getText().toString());
				pbean.setLength(WhetherConstructionOnPlot_lenth.getText().toString());
				pbean.setWidth(WhetherConstructionOnPlot_width.getText().toString());
				pbean.setNameOfLane_Road(NameOfLaneOrRoad.getText().toString());
				pbean.setLandmark(Landmark.getText().toString());;
				pbean.setDistrict(District.getText().toString());
				pbean.setName_No_OfBuilding_pre(NameOfBuilding_Pre.getText().toString());
				pbean.setName_No_OfBuilding(NameOfBuildin_Post.getText().toString());

				pbean.setDetailsOfOwnership(DetailsOfOwnership);
				pbean.setZone(Zone);
				pbean.setWard(Ward);
				pbean.setTypOfConstruction(TypeOfConstruction);

				onBackPressed();
			}
		});

		final Spinner ward_spinner=(Spinner)findViewById(R.id.spn_wardno);

		ward_spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub

				Ward=((SpinnerItemBean)parent.getItemAtPosition(position)).getStrItem();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});
		Spinner type_of_construction_spinner=(Spinner)findViewById(R.id.spn_constype);
		type_of_construction_spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				TypeOfConstruction=""+position;//parent.getItemAtPosition(position).toString();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});
		///////////////////////
		final Spinner zone_spinner=(Spinner)findViewById(R.id.spn_zone);

		ArrayList<SpinnerItemBean> arr_itemBean=new ArrayList<SpinnerItemBean>();

		Set<String> keys = wardMaping.keySet();
		for(String key: keys){ 
			//System.out.println(key);
			SpinnerItemBean sib=new SpinnerItemBean();
			sib.setStrItem(key);
			arr_itemBean.add(sib);
		} 

		CustomAdapter adapter = new CustomAdapter(DTaxPayerPropertyDetails.this, R.layout.spinner_rows, arr_itemBean,getResources());
		zone_spinner.setAdapter(adapter);



		zone_spinner.post(new Runnable() {
			@Override
			public void run() {


				zone_spinner.setSelection(0);

			}
		});
		////////////////////////////////


		Spinner details_of_owner_spinner=(Spinner)findViewById(R.id.spn_ownershipsdetails);



		details_of_owner_spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {

				DetailsOfOwnership=""+position;//parent.getItemAtPosition(position).toString();

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});
		zone_spinner.setOnItemSelectedListener(new OnItemSelectedListener() {



			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Zone=((SpinnerItemBean)parent.getItemAtPosition(position)).getStrItem();
				Zone_id=""+position;
				
				if(position==0)
					Zone_id="";
				System.out.println("Item Bean:.."+Zone);

				ArrayList<SpinnerItemBean> ward_itmeanBean=new ArrayList<SpinnerItemBean>();
				String vaues=(String)wardMaping.get(Zone);
				String valuesArray[]=	vaues.split(",");

				for(int i=0;i<valuesArray.length;i++){ 

					SpinnerItemBean sib=new SpinnerItemBean();
					sib.setStrItem(valuesArray[i]);

					ward_itmeanBean.add(sib);
				} 

				CustomAdapter adapter = new CustomAdapter(DTaxPayerPropertyDetails.this, R.layout.spinner_rows, ward_itmeanBean,getResources());
				ward_spinner.setAdapter(adapter);


			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});

	}

}
