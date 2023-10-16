package com.example.da_ql_khohang.ThongKe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.da_ql_khohang.databinding.FragProdBinding;
import com.example.da_ql_khohang.databinding.FragStatisticalBinding;


public class Frag_Statistical extends Fragment {
    static FragStatisticalBinding binding;


    public Frag_Statistical() {
    }


    public static Fragment newInstance() {
        Frag_Statistical fragment = new Frag_Statistical();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragStatisticalBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }




}