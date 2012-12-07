package com.example.androidspreewarehouse;

import com.example.androidspreewarehouse.utils.Utils.OnViewSelected;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class SpreeMainFragment extends Fragment implements OnClickListener {

	private View view;
	
	private OnViewSelected _mClickListener;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		//initialize view and all other views.
		
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
			// get data
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
