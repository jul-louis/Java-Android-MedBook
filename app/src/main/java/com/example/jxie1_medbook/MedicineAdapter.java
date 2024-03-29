package com.example.jxie1_medbook;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
/*  Class: MedicineAdapter
    @author: Louie Xie

    Custom ArrayAdapter for Medicine
    It bridges ArrayList and ListView, and sets Texts for each required Views
 */
public class MedicineAdapter extends ArrayAdapter<Medicine> {
    public MedicineAdapter(Context context, int position, ArrayList<Medicine> medicines) {
        super(context, position, medicines);
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Medicine medicine = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.medicine_content,
                    parent, false);
        }

        TextView medicineName = (TextView) convertView.findViewById(R.id.medicineName);
        TextView date = (TextView) convertView.findViewById(R.id.medicineDate);
        TextView dose = (TextView) convertView.findViewById(R.id.dose);
        TextView unit = (TextView) convertView.findViewById(R.id.unit);
        TextView freq = (TextView) convertView.findViewById(R.id.freq);

        @SuppressLint("SimpleDateFormat") SimpleDateFormat
                dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String strDate = dateFormat.format(medicine.getDateStart());

        medicineName.setText(medicine.getName());
        date.setText(strDate);
        dose.setText(Float.toString(medicine.getDoseAmount()));
        unit.setText(medicine.getDoseUnit());
        freq.setText(Integer.toString(medicine.getDailyFrequency()));

        return convertView;
    }
}







