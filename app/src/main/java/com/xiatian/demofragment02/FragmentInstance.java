package com.xiatian.demofragment02;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by xiatian on 2017/4/11.
 */

public class FragmentInstance extends Fragment {

    private int resLayout;

    public static FragmentInstance newInstance(int resLayout) {
        FragmentInstance fragment = new FragmentInstance();
        Bundle bundle = new Bundle();
        bundle.putInt("res_layout", resLayout);
        fragment.setArguments(bundle);
        return fragment;

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(resLayout, container, false);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        this.resLayout = args.getInt("res_layout");

    }
}
