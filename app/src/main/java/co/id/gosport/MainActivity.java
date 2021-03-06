package co.id.gosport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;

import com.airbnb.lottie.LottieAnimationView;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import co.id.gosport.adapter.RecyclerAdapter;
import co.id.gosport.model.ForecastWeatherModel;
import co.id.gosport.model.WeatherModel;
import co.id.gosport.service.GpsService;
import co.id.gosport.utils.AppUtil;
import co.id.gosport.utils.TextViewFactory;

public class MainActivity extends AppCompatActivity {


    TextSwitcher tsTemp, tsDesc,tsHumidity, tsWind;
    RecyclerView rv;
    Button btnRun;
    LottieAnimationView animationView;
    private Gson gson;
    RecyclerAdapter adapter;
    private GpsService gpsService;
    private double lat, lng;
    ArrayList<ForecastWeatherModel.ForecastEntity> list = new ArrayList<>();


    private Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tsTemp = findViewById(R.id.temp_text_view);
        tsDesc = findViewById(R.id.description_text_view);
        tsHumidity = findViewById(R.id.humidity_text_view);
        tsWind = findViewById(R.id.wind_text_view);
        animationView = findViewById(R.id.animation_view);
        btnRun = findViewById(R.id.btnRun);
        rv = findViewById(R.id.rvList);
        gpsService = new GpsService(MainActivity.this);
        adapter = new RecyclerAdapter(this,list);
        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        rv.setAdapter(adapter);
        try {
            if (ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED ) {
                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, 101);

            } else {
                getLocation();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        typeface = Typeface.createFromAsset(getAssets(), "fonts/Vazir.ttf");
        setupTextSwitchers();
        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("de.j4velin.pedometer");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }
            }
        });
        fetchData(lat,lng);
    }

    public void getLocation(){
        if(gpsService.canGetLocation()){
            lat = gpsService.getLatitude();
            lng = gpsService.getLongitude();
            System.out.println("Lat "+lat);
            System.out.println("Lng "+lng);
        }else{
            gpsService.showSettingsAlert();
        }
    }

    private void fetchData(double lat, double lng) {

        AndroidNetworking.get("http://api.weatherapi.com/v1/forecast.json?key=a3fc9a38d261490185465132201111&q="+lat+","+lng+"&days=7")
                .setPriority(Priority.HIGH)
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        GsonBuilder gsonBuilder = new GsonBuilder().serializeNulls();
                        gson = gsonBuilder.create();
                        ForecastWeatherModel courseRespMdl = gson.fromJson(String.valueOf(response), ForecastWeatherModel.class);
                        if (courseRespMdl.getCurrent() != null) {
//                            if (courseRespMdl.getCourse().size() != 0) {
                            updateData(courseRespMdl);
//                            } else {
//                                Log.e("login", "onResponse: " + "no courses found");
//                            }
                        } else {
                            System.out.println("Gagal Load");
                        }
                    }

                    @Override

                    public void onError(ANError anError) {

                        handleErrorNetwork(anError);
                    }
                });
    }

    private void updateData(ForecastWeatherModel currentWeather) {
        tsTemp.setText(String.format(Locale.getDefault(), "%.0f°", currentWeather.getCurrent().getTempC()));
        tsDesc.setText(currentWeather.getCurrent().getCondition().getText());
        tsHumidity.setText(String.format(Locale.getDefault(), "%d%%", currentWeather.getCurrent().getHumidity()));
        tsWind.setText(String.format(Locale.getDefault(), getResources().getString(R.string.wind_unit_label), currentWeather.getCurrent().getWindMph()));
        animationView.setAnimation(AppUtil.getWeatherAnimation(currentWeather.getCurrent().getCondition().getCode()));
        animationView.playAnimation();
        list.add(currentWeather.getForecast());
        adapter.setPost(list);
    }

    private void handleErrorNetwork(ANError anError) {
        System.out.println("Error "+anError.getMessage());
    }

    private void setupTextSwitchers() {
        tsTemp.setFactory(new TextViewFactory(MainActivity.this, R.style.TempTextView, true, typeface));
        tsTemp.setInAnimation(MainActivity.this, R.anim.slide_in_right);
        tsTemp.setOutAnimation(MainActivity.this, R.anim.slide_out_left);
        tsDesc.setFactory(new TextViewFactory(MainActivity.this, R.style.DescriptionTextView, true, typeface));
        tsDesc.setInAnimation(MainActivity.this, R.anim.slide_in_right);
        tsDesc.setOutAnimation(MainActivity.this, R.anim.slide_out_left);
        tsHumidity.setFactory(new TextViewFactory(MainActivity.this, R.style.HumidityTextView, false, typeface));
        tsHumidity.setInAnimation(MainActivity.this, R.anim.slide_in_bottom);
        tsHumidity.setOutAnimation(MainActivity.this, R.anim.slide_out_top);
        tsWind.setFactory(new TextViewFactory(MainActivity.this, R.style.WindSpeedTextView, false, typeface));
        tsWind.setInAnimation(MainActivity.this, R.anim.slide_in_bottom);
        tsWind.setOutAnimation(MainActivity.this, R.anim.slide_out_top);
    }


}