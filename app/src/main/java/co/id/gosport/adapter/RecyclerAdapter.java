/*
 * Copyright (c) 2015. Tyler McCraw
 */

package co.id.gosport.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import co.id.gosport.R;
import co.id.gosport.model.ForecastWeatherModel;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.DayViewHolder> {

    class DayViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        ImageView appPhoto;
        TextView dayOfWeek;
        TextView weatherType;
        TextView tempMax;
        TextView tempMin;

        DayViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_view);
            appPhoto = (ImageView)itemView.findViewById(R.id.weather_image_view);
            dayOfWeek = (TextView)itemView.findViewById(R.id.day_name_text_view);
            weatherType = (TextView)itemView.findViewById(R.id.temp_text_view);
            tempMax = (TextView)itemView.findViewById(R.id.max_temp_text_view);
            tempMin = (TextView)itemView.findViewById(R.id.min_temp_text_view);
        }
    }

    Context context;
    ArrayList<ForecastWeatherModel.ForecastEntity> days;
    View.OnClickListener clickListener;

    public RecyclerAdapter(Context context, ArrayList<ForecastWeatherModel.ForecastEntity> list) {
        this.context = context;
        this.days = list;
    }

    public void setPost(ArrayList<ForecastWeatherModel.ForecastEntity> list ){
        days.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public DayViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

           View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.weather_day_item, viewGroup, false);
            //TODO: change the first day to a static view, cardview isn't going to work.
        return new DayViewHolder(v);

    }

    @Override
    public void onBindViewHolder(DayViewHolder dayViewHolder, int i) {
        final ForecastWeatherModel.ForecastEntity forecastEntity = days.get(0);
        dayViewHolder.dayOfWeek.setText(forecastEntity.getForecastday().get(i).getDate());
        dayViewHolder.weatherType.setText(forecastEntity.getForecastday().get(i).getDay().getCondition().getText());
        dayViewHolder.tempMax.setText(forecastEntity.getForecastday().get(i).getDay().getMaxtempC()+" C");
        dayViewHolder.tempMin.setText(forecastEntity.getForecastday().get(i).getDay().getMintempC()+" C");
        dayViewHolder.appPhoto.setImageResource(R.drawable.ic_rainy_weather);
    }

    @Override
    public int getItemCount() {
        return days.size();
    }
}
