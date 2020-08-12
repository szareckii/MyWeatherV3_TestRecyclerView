package com.geekbrains.myweatherv3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class RecyclerDataAdapterForDays extends RecyclerView.Adapter<RecyclerDataAdapterForDays.ViewHolder> {
    private ArrayList<DataClass> data = new ArrayList<>();
    private Context context;
    private static final String TAG = "myLogs";

    public RecyclerDataAdapterForDays(ArrayList<DataClass> data) {
        if(data != null) {
            this.data = data;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_days_rv_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        String text = data.get(position);


        holder.textDay.setText(data.get(position).textDay);
        holder.texTemptDay.setText(data.get(position).texTemptDay);
        holder.drawableDayImageView.setImageDrawable(data.get(position).drawableDay);
        holder.texTemptNight.setText(data.get(position).texTemptNight);
        holder.drawableNightImageView.setImageDrawable(data.get(position).drawableNight);


//        holder.setTextToTextView(text);
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textDay;
        TextView texTemptDay;
        ImageView drawableDayImageView;
        TextView texTemptNight;
        ImageView drawableNightImageView;

        ViewHolder(View view) {
            super(view);

            textDay = itemView.findViewById(R.id.itemDayTextView);
            texTemptDay = itemView.findViewById(R.id.itemTempTextView);
            drawableDayImageView = itemView.findViewById(R.id.typeWeatherImageView);
            texTemptNight = itemView.findViewById(R.id.itemNightTempTextView);
            drawableNightImageView = itemView.findViewById(R.id.typeNightWeatherImageView);
        }
    }


    private void findCurrentHour(int countHoursBetweenForecasts) {
        Calendar cDayPlusOne = Calendar.getInstance();
        cDayPlusOne.add(Calendar.DAY_OF_MONTH, 1);
        Calendar cDayPlusTwo = Calendar.getInstance();
        cDayPlusTwo.add(Calendar.DAY_OF_MONTH, 2);
        Calendar cDayPlusThree = Calendar.getInstance();
        cDayPlusThree.add(Calendar.DAY_OF_MONTH, 3);

        @SuppressLint("SimpleDateFormat") DateFormat df = new SimpleDateFormat("dd/MM");

//        textCurrentDayPlusOne.setText(df.format(cDayPlusOne.getTime()));
//        textCurrentDayPlusTwo.setText(df.format(cDayPlusTwo.getTime()));
//        textCurrentDayPlusThree.setText(df.format(cDayPlusThree.getTime()));


    }




}
