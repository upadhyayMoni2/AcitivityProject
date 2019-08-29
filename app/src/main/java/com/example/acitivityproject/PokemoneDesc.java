package com.example.acitivityproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class PokemoneDesc extends Fragment {

    ImageView img_poke;
    TextView txt_name,txt_type,txt_ability,txt_h,txt_w,txt_desc,ab_txt,des_txt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemone_desc, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        img_poke = view.findViewById(R.id.desc_img);
        txt_name = view.findViewById(R.id.txt_name);
        txt_type = view.findViewById(R.id.txt_type);
        txt_ability = view.findViewById(R.id.txt_ability);
        txt_h = view.findViewById(R.id.txt_height);
        txt_w = view.findViewById(R.id.txt_weight);
        txt_desc = view.findViewById(R.id.txt_desc);
        ab_txt = view.findViewById(R.id.ab_txt);
        des_txt = view.findViewById(R.id.des_txt);

        if(getArguments()!=null){
            ab_txt.setText("Ability");
            des_txt.setText("Description");
            txt_name.setText("Name: "+getArguments().getString("name"));
            txt_ability.setText(getArguments().getString("ability"));
            txt_h.setText("Height: "+getArguments().getString("height"));
            txt_w.setText("Weight: "+getArguments().getString("weight"));
            txt_type.setText("Type: "+getArguments().getString("type"));
            txt_desc.setText(getArguments().getString("description"));
            Glide.with(getActivity().getApplicationContext()).asBitmap().load(getArguments().getString("image_url")).into(img_poke);
            txt_desc.setMovementMethod(new ScrollingMovementMethod());
            ab_txt.setMovementMethod(new ScrollingMovementMethod());


        }



    }
}

