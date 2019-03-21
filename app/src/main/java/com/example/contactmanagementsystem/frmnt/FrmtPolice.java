package com.example.contactmanagementsystem.frmnt;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.contactmanagementsystem.R;
import com.example.contactmanagementsystem.adapters.RecycleViewAdapter;
import com.example.contactmanagementsystem.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class FrmtPolice extends Fragment {

    View v;
    RecyclerView recyclerView;
    List<Contact> listCont;

    public FrmtPolice() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.police_fgmt, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.police_recycleView);
        RecycleViewAdapter viewAdapter = new RecycleViewAdapter(getContext(), listCont);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(viewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listCont = new ArrayList<>();
        listCont.add(new Contact("Mahadi","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Hasan","4444444",R.drawable.ic_launcher_background));
        listCont.add(new Contact("HHH","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("DDDD","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
    }
}
