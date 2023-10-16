package com.example.da_ql_khohang.TheLoai;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.da_ql_khohang.databinding.FragCategoryBinding;
import com.example.da_ql_khohang.databinding.FragMemberBinding;


public class Frag_category extends Fragment {
    static FragCategoryBinding binding;


    public Frag_category() {
    }


    public static Fragment newInstance() {
        Frag_category fragment = new Frag_category();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragCategoryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }




}