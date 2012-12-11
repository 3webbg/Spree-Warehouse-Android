package com.example.androidspreewarehouse.settings;

import org.hardartcore.spree.Profile;

import com.example.androidspreewarehouse.R;
import com.example.androidspreewarehouse.utils.Utils.OnViewSelected;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class SpreeSettingsFragment extends Fragment implements OnClickListener {

	private View view;
	
	private EditText _serverName;
	private EditText _user;
	private EditText _password;
	private EditText _apiKey;
	
	private OnViewSelected _mClickListener;
	
	private Profile _myProfile;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		view = inflater.inflate(R.layout.fragment_spree_settings, container, false);
		
		_serverName = (EditText) view.findViewById(R.id.server_name);
		_user = (EditText) view.findViewById(R.id.user);
		_password = (EditText) view.findViewById(R.id.password);
		_apiKey = (EditText) view.findViewById(R.id.api_key);
		
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
