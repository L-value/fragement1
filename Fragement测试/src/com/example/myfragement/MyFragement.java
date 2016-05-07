package com.example.myfragement;

import com.example.fragement.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;


public class MyFragement extends Fragment implements OnTouchListener
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		ImageView imageView = new ImageView(this.getActivity());
		imageView.setImageResource(R.drawable.lufei001);
		imageView.setOnTouchListener(this);
		return  imageView;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event)
	{
		Toast.makeText(getActivity(), "Í¼Æ¬±»µã»÷ÁË", 1000).show();
		return false;
	}

	@Override
	public void onAttach(Activity activity)
	{
		Log.i("info", "onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		Log.i("info", "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState)
	{
		Log.i("info", "onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onResume()
	{
		Log.i("info", "onResume");
		super.onResume();
	}

	@Override
	public void onPause()
	{
		Log.i("info", "onPause");
		super.onPause();
	}

	@Override
	public void onDestroyView()
	{
		Log.i("info", "onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onDestroy()
	{
		Log.i("info", "onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDetach()
	{
		Log.i("info", "onDetach");
		super.onDetach();
	}
	
	

}
