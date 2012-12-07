package com.example.androidspreewarehouse.settings;

import com.example.androidspreewarehouse.utils.Utils.OnViewSelected;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

public class SpreeSettingsFragment extends Fragment implements OnClickListener {

	private View view;
	
	private OnViewSelected _mClickListener;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		//TODO: initialize view
		
		return view;
	}
	
	@Override
	public void onAttach(Activity activity){
		super.onAttach(activity);
	}
	
	@Override
	public void onStart(){
		super.onStart();
		Bundle args = getArguments();
		if(args!=null){
			//get data
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
}
