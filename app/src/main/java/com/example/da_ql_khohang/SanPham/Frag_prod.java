package com.example.da_ql_khohang.SanPham;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.da_ql_khohang.databinding.FragProdBinding;

import java.util.ArrayList;


public class Frag_prod extends Fragment {
    static FragProdBinding binding;


    public Frag_prod() {
    }


    public static Fragment newInstance() {
        Frag_prod fragment = new Frag_prod();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragProdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }




}