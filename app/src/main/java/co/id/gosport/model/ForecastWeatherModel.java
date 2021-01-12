package co.id.gosport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ForecastWeatherModel {


    @Expose
    @SerializedName("alert")
    private AlertEntity alert;
    @Expose
    @SerializedName("forecast")
    private ForecastEntity forecast;
    @Expose
    @SerializedName("current")
    private CurrentEntity current;
    @Expose
    @SerializedName("location")
    private LocationEntity location;

    public AlertEntity getAlert() {
        return alert;
    }

    public void setAlert(AlertEntity alert) {
        this.alert = alert;
    }

    public ForecastEntity getForecast() {
        return forecast;
    }

    public void setForecast(ForecastEntity forecast) {
        this.forecast = forecast;
    }

    public CurrentEntity getCurrent() {
        return current;
    }

    public void setCurrent(CurrentEntity current) {
        this.current = current;
    }

    public LocationEntity getLocation() {
        return location;
    }

    public void setLocation(LocationEntity location) {
        this.location = location;
    }

    public static class AlertEntity {
    }

    public static class ForecastEntity {
        @Expose
        @SerializedName("forecastday")
        private List<ForecastdayEntity> forecastday;

        public List<ForecastdayEntity> getForecastday() {
            return forecastday;
        }

        public void setForecastday(List<ForecastdayEntity> forecastday) {
            this.forecastday = forecastday;
        }
    }

    public static class ForecastdayEntity {
        @Expose
        @SerializedName("hour")
        private List<HourEntity> hour;
        @Expose
        @SerializedName("astro")
        private AstroEntity astro;
        @Expose
        @SerializedName("day")
        private DayEntity day;
        @Expose
        @SerializedName("date_epoch")
        private int dateEpoch;
        @Expose
        @SerializedName("date")
        private String date;

        public List<HourEntity> getHour() {
            return hour;
        }

        public void setHour(List<HourEntity> hour) {
            this.hour = hour;
        }

        public AstroEntity getAstro() {
            return astro;
        }

        public void setAstro(AstroEntity astro) {
            this.astro = astro;
        }

        public DayEntity getDay() {
            return day;
        }

        public void setDay(DayEntity day) {
            this.day = day;
        }

        public int getDateEpoch() {
            return dateEpoch;
        }

        public void setDateEpoch(int dateEpoch) {
            this.dateEpoch = dateEpoch;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    public static class HourEntity {
        @Expose
        @SerializedName("gust_kph")
        private double gustKph;
        @Expose
        @SerializedName("gust_mph")
        private double gustMph;
        @Expose
        @SerializedName("vis_miles")
        private double visMiles;
        @Expose
        @SerializedName("vis_km")
        private double visKm;
        @Expose
        @SerializedName("chance_of_snow")
        private String chanceOfSnow;
        @Expose
        @SerializedName("will_it_snow")
        private double willItSnow;
        @Expose
        @SerializedName("chance_of_rain")
        private String chanceOfRain;
        @Expose
        @SerializedName("will_it_rain")
        private double willItRain;
        @Expose
        @SerializedName("dewpoint_f")
        private double dewpointF;
        @Expose
        @SerializedName("dewpoint_c")
        private double dewpointC;
        @Expose
        @SerializedName("heatindex_f")
        private double heatindexF;
        @Expose
        @SerializedName("heatindex_c")
        private double heatindexC;
        @Expose
        @SerializedName("windchill_f")
        private double windchillF;
        @Expose
        @SerializedName("windchill_c")
        private double windchillC;
        @Expose
        @SerializedName("feelslike_f")
        private double feelslikeF;
        @Expose
        @SerializedName("feelslike_c")
        private double feelslikeC;
        @Expose
        @SerializedName("cloud")
        private double cloud;
        @Expose
        @SerializedName("humidity")
        private double humidity;
        @Expose
        @SerializedName("precip_in")
        private double precipIn;
        @Expose
        @SerializedName("precip_mm")
        private double precipMm;
        @Expose
        @SerializedName("pressure_in")
        private double pressureIn;
        @Expose
        @SerializedName("pressure_mb")
        private double pressureMb;
        @Expose
        @SerializedName("wind_dir")
        private String windDir;
        @Expose
        @SerializedName("wind_degree")
        private double windDegree;
        @Expose
        @SerializedName("wind_kph")
        private double windKph;
        @Expose
        @SerializedName("wind_mph")
        private double windMph;
        @Expose
        @SerializedName("condition")
        private ConditionEntity condition;
        @Expose
        @SerializedName("is_day")
        private double isDay;
        @Expose
        @SerializedName("temp_f")
        private double tempF;
        @Expose
        @SerializedName("temp_c")
        private double tempC;
        @Expose
        @SerializedName("time")
        private String time;
        @Expose
        @SerializedName("time_epoch")
        private double timeEpoch;

        public double getGustKph() {
            return gustKph;
        }

        public void setGustKph(int gustKph) {
            this.gustKph = gustKph;
        }

        public double getGustMph() {
            return gustMph;
        }

        public void setGustMph(double gustMph) {
            this.gustMph = gustMph;
        }

        public double getVisMiles() {
            return visMiles;
        }

        public void setVisMiles(int visMiles) {
            this.visMiles = visMiles;
        }

        public double getVisKm() {
            return visKm;
        }

        public void setVisKm(int visKm) {
            this.visKm = visKm;
        }

        public String getChanceOfSnow() {
            return chanceOfSnow;
        }

        public void setChanceOfSnow(String chanceOfSnow) {
            this.chanceOfSnow = chanceOfSnow;
        }

        public double getWillItSnow() {
            return willItSnow;
        }

        public void setWillItSnow(int willItSnow) {
            this.willItSnow = willItSnow;
        }

        public String getChanceOfRain() {
            return chanceOfRain;
        }

        public void setChanceOfRain(String chanceOfRain) {
            this.chanceOfRain = chanceOfRain;
        }

        public double getWillItRain() {
            return willItRain;
        }

        public void setWillItRain(int willItRain) {
            this.willItRain = willItRain;
        }

        public double getDewpointF() {
            return dewpointF;
        }

        public void setDewpointF(double dewpointF) {
            this.dewpointF = dewpointF;
        }

        public double getDewpointC() {
            return dewpointC;
        }

        public void setDewpointC(double dewpointC) {
            this.dewpointC = dewpointC;
        }

        public double getHeatindexF() {
            return heatindexF;
        }

        public void setHeatindexF(double heatindexF) {
            this.heatindexF = heatindexF;
        }

        public double getHeatindexC() {
            return heatindexC;
        }

        public void setHeatindexC(int heatindexC) {
            this.heatindexC = heatindexC;
        }

        public double getWindchillF() {
            return windchillF;
        }

        public void setWindchillF(double windchillF) {
            this.windchillF = windchillF;
        }

        public double getWindchillC() {
            return windchillC;
        }

        public void setWindchillC(double windchillC) {
            this.windchillC = windchillC;
        }

        public double getFeelslikeF() {
            return feelslikeF;
        }

        public void setFeelslikeF(double feelslikeF) {
            this.feelslikeF = feelslikeF;
        }

        public double getFeelslikeC() {
            return feelslikeC;
        }

        public void setFeelslikeC(double feelslikeC) {
            this.feelslikeC = feelslikeC;
        }

        public double getCloud() {
            return cloud;
        }

        public void setCloud(int cloud) {
            this.cloud = cloud;
        }

        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getPrecipIn() {
            return precipIn;
        }

        public void setPrecipIn(int precipIn) {
            this.precipIn = precipIn;
        }

        public double getPrecipMm() {
            return precipMm;
        }

        public void setPrecipMm(int precipMm) {
            this.precipMm = precipMm;
        }

        public double getPressureIn() {
            return pressureIn;
        }

        public void setPressureIn(double pressureIn) {
            this.pressureIn = pressureIn;
        }

        public double getPressureMb() {
            return pressureMb;
        }

        public void setPressureMb(int pressureMb) {
            this.pressureMb = pressureMb;
        }

        public String getWindDir() {
            return windDir;
        }

        public void setWindDir(String windDir) {
            this.windDir = windDir;
        }

        public double getWindDegree() {
            return windDegree;
        }

        public void setWindDegree(int windDegree) {
            this.windDegree = windDegree;
        }

        public double getWindKph() {
            return windKph;
        }

        public void setWindKph(double windKph) {
            this.windKph = windKph;
        }

        public double getWindMph() {
            return windMph;
        }

        public void setWindMph(double windMph) {
            this.windMph = windMph;
        }

        public ConditionEntity getCondition() {
            return condition;
        }

        public void setCondition(ConditionEntity condition) {
            this.condition = condition;
        }

        public double getIsDay() {
            return isDay;
        }

        public void setIsDay(int isDay) {
            this.isDay = isDay;
        }

        public double getTempF() {
            return tempF;
        }

        public void setTempF(double tempF) {
            this.tempF = tempF;
        }

        public double getTempC() {
            return tempC;
        }

        public void setTempC(double tempC) {
            this.tempC = tempC;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public double getTimeEpoch() {
            return timeEpoch;
        }

        public void setTimeEpoch(int timeEpoch) {
            this.timeEpoch = timeEpoch;
        }
    }

    public static class ConditionEntity {
        @Expose
        @SerializedName("code")
        private int code;
        @Expose
        @SerializedName("icon")
        private String icon;
        @Expose
        @SerializedName("text")
        private String text;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class AstroEntity {
        @Expose
        @SerializedName("moon_illumination")
        private String moonIllumination;
        @Expose
        @SerializedName("moon_phase")
        private String moonPhase;
        @Expose
        @SerializedName("moonset")
        private String moonset;
        @Expose
        @SerializedName("moonrise")
        private String moonrise;
        @Expose
        @SerializedName("sunset")
        private String sunset;
        @Expose
        @SerializedName("sunrise")
        private String sunrise;

        public String getMoonIllumination() {
            return moonIllumination;
        }

        public void setMoonIllumination(String moonIllumination) {
            this.moonIllumination = moonIllumination;
        }

        public String getMoonPhase() {
            return moonPhase;
        }

        public void setMoonPhase(String moonPhase) {
            this.moonPhase = moonPhase;
        }

        public String getMoonset() {
            return moonset;
        }

        public void setMoonset(String moonset) {
            this.moonset = moonset;
        }

        public String getMoonrise() {
            return moonrise;
        }

        public void setMoonrise(String moonrise) {
            this.moonrise = moonrise;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }
    }

    public static class DayEntity {
        @Expose
        @SerializedName("uv")
        private int uv;
        @Expose
        @SerializedName("condition")
        private ConditionEntity condition;
        @Expose
        @SerializedName("daily_chance_of_snow")
        private String dailyChanceOfSnow;
        @Expose
        @SerializedName("daily_will_it_snow")
        private int dailyWillItSnow;
        @Expose
        @SerializedName("daily_chance_of_rain")
        private String dailyChanceOfRain;
        @Expose
        @SerializedName("daily_will_it_rain")
        private int dailyWillItRain;
        @Expose
        @SerializedName("avghumidity")
        private double avghumidity;
        @Expose
        @SerializedName("avgvis_miles")
        private double avgvisMiles;
        @Expose
        @SerializedName("avgvis_km")
        private double avgvisKm;
        @Expose
        @SerializedName("totalprecip_in")
        private double totalprecipIn;
        @Expose
        @SerializedName("totalprecip_mm")
        private double totalprecipMm;
        @Expose
        @SerializedName("maxwind_kph")
        private double maxwindKph;
        @Expose
        @SerializedName("maxwind_mph")
        private double maxwindMph;
        @Expose
        @SerializedName("avgtemp_f")
        private double avgtempF;
        @Expose
        @SerializedName("avgtemp_c")
        private double avgtempC;
        @Expose
        @SerializedName("mintemp_f")
        private double mintempF;
        @Expose
        @SerializedName("mintemp_c")
        private double mintempC;
        @Expose
        @SerializedName("maxtemp_f")
        private double maxtempF;
        @Expose
        @SerializedName("maxtemp_c")
        private double maxtempC;

        public int getUv() {
            return uv;
        }

        public void setUv(int uv) {
            this.uv = uv;
        }

        public ConditionEntity getCondition() {
            return condition;
        }

        public void setCondition(ConditionEntity condition) {
            this.condition = condition;
        }

        public String getDailyChanceOfSnow() {
            return dailyChanceOfSnow;
        }

        public void setDailyChanceOfSnow(String dailyChanceOfSnow) {
            this.dailyChanceOfSnow = dailyChanceOfSnow;
        }

        public int getDailyWillItSnow() {
            return dailyWillItSnow;
        }

        public void setDailyWillItSnow(int dailyWillItSnow) {
            this.dailyWillItSnow = dailyWillItSnow;
        }

        public String getDailyChanceOfRain() {
            return dailyChanceOfRain;
        }

        public void setDailyChanceOfRain(String dailyChanceOfRain) {
            this.dailyChanceOfRain = dailyChanceOfRain;
        }

        public int getDailyWillItRain() {
            return dailyWillItRain;
        }

        public void setDailyWillItRain(int dailyWillItRain) {
            this.dailyWillItRain = dailyWillItRain;
        }

        public double getAvghumidity() {
            return avghumidity;
        }

        public void setAvghumidity(int avghumidity) {
            this.avghumidity = avghumidity;
        }

        public double getAvgvisMiles() {
            return avgvisMiles;
        }

        public void setAvgvisMiles(int avgvisMiles) {
            this.avgvisMiles = avgvisMiles;
        }

        public double getAvgvisKm() {
            return avgvisKm;
        }

        public void setAvgvisKm(double avgvisKm) {
            this.avgvisKm = avgvisKm;
        }

        public double getTotalprecipIn() {
            return totalprecipIn;
        }

        public void setTotalprecipIn(double totalprecipIn) {
            this.totalprecipIn = totalprecipIn;
        }

        public double getTotalprecipMm() {
            return totalprecipMm;
        }

        public void setTotalprecipMm(double totalprecipMm) {
            this.totalprecipMm = totalprecipMm;
        }

        public double getMaxwindKph() {
            return maxwindKph;
        }

        public void setMaxwindKph(double maxwindKph) {
            this.maxwindKph = maxwindKph;
        }

        public double getMaxwindMph() {
            return maxwindMph;
        }

        public void setMaxwindMph(double maxwindMph) {
            this.maxwindMph = maxwindMph;
        }

        public double getAvgtempF() {
            return avgtempF;
        }

        public void setAvgtempF(double avgtempF) {
            this.avgtempF = avgtempF;
        }

        public double getAvgtempC() {
            return avgtempC;
        }

        public void setAvgtempC(double avgtempC) {
            this.avgtempC = avgtempC;
        }

        public double getMintempF() {
            return mintempF;
        }

        public void setMintempF(int mintempF) {
            this.mintempF = mintempF;
        }

        public double getMintempC() {
            return mintempC;
        }

        public void setMintempC(double mintempC) {
            this.mintempC = mintempC;
        }

        public double getMaxtempF() {
            return maxtempF;
        }

        public void setMaxtempF(double maxtempF) {
            this.maxtempF = maxtempF;
        }

        public double getMaxtempC() {
            return maxtempC;
        }

        public void setMaxtempC(double maxtempC) {
            this.maxtempC = maxtempC;
        }
    }



    public static class CurrentEntity {
        @Expose
        @SerializedName("gust_kph")
        private double gustKph;
        @Expose
        @SerializedName("gust_mph")
        private double gustMph;
        @Expose
        @SerializedName("uv")
        private int uv;
        @Expose
        @SerializedName("vis_miles")
        private int visMiles;
        @Expose
        @SerializedName("vis_km")
        private double visKm;
        @Expose
        @SerializedName("feelslike_f")
        private double feelslikeF;
        @Expose
        @SerializedName("feelslike_c")
        private double feelslikeC;
        @Expose
        @SerializedName("cloud")
        private int cloud;
        @Expose
        @SerializedName("humidity")
        private int humidity;
        @Expose
        @SerializedName("precip_in")
        private double precipIn;
        @Expose
        @SerializedName("precip_mm")
        private double precipMm;
        @Expose
        @SerializedName("pressure_in")
        private double pressureIn;
        @Expose
        @SerializedName("pressure_mb")
        private int pressureMb;
        @Expose
        @SerializedName("wind_dir")
        private String windDir;
        @Expose
        @SerializedName("wind_degree")
        private int windDegree;
        @Expose
        @SerializedName("wind_kph")
        private double windKph;
        @Expose
        @SerializedName("wind_mph")
        private double windMph;
        @Expose
        @SerializedName("condition")
        private ConditionEntity condition;
        @Expose
        @SerializedName("is_day")
        private int isDay;
        @Expose
        @SerializedName("temp_f")
        private double tempF;
        @Expose
        @SerializedName("temp_c")
        private double tempC;
        @Expose
        @SerializedName("last_updated")
        private String lastUpdated;
        @Expose
        @SerializedName("last_updated_epoch")
        private int lastUpdatedEpoch;

        public double getGustKph() {
            return gustKph;
        }

        public void setGustKph(double gustKph) {
            this.gustKph = gustKph;
        }

        public double getGustMph() {
            return gustMph;
        }

        public void setGustMph(double gustMph) {
            this.gustMph = gustMph;
        }

        public int getUv() {
            return uv;
        }

        public void setUv(int uv) {
            this.uv = uv;
        }

        public int getVisMiles() {
            return visMiles;
        }

        public void setVisMiles(int visMiles) {
            this.visMiles = visMiles;
        }

        public double getVisKm() {
            return visKm;
        }

        public void setVisKm(double visKm) {
            this.visKm = visKm;
        }

        public double getFeelslikeF() {
            return feelslikeF;
        }

        public void setFeelslikeF(double feelslikeF) {
            this.feelslikeF = feelslikeF;
        }

        public double getFeelslikeC() {
            return feelslikeC;
        }

        public void setFeelslikeC(double feelslikeC) {
            this.feelslikeC = feelslikeC;
        }

        public int getCloud() {
            return cloud;
        }

        public void setCloud(int cloud) {
            this.cloud = cloud;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getPrecipIn() {
            return precipIn;
        }

        public void setPrecipIn(int precipIn) {
            this.precipIn = precipIn;
        }

        public double getPrecipMm() {
            return precipMm;
        }

        public void setPrecipMm(double precipMm) {
            this.precipMm = precipMm;
        }

        public double getPressureIn() {
            return pressureIn;
        }

        public void setPressureIn(double pressureIn) {
            this.pressureIn = pressureIn;
        }

        public int getPressureMb() {
            return pressureMb;
        }

        public void setPressureMb(int pressureMb) {
            this.pressureMb = pressureMb;
        }

        public String getWindDir() {
            return windDir;
        }

        public void setWindDir(String windDir) {
            this.windDir = windDir;
        }

        public int getWindDegree() {
            return windDegree;
        }

        public void setWindDegree(int windDegree) {
            this.windDegree = windDegree;
        }

        public double getWindKph() {
            return windKph;
        }

        public void setWindKph(double windKph) {
            this.windKph = windKph;
        }

        public double getWindMph() {
            return windMph;
        }

        public void setWindMph(double windMph) {
            this.windMph = windMph;
        }

        public ConditionEntity getCondition() {
            return condition;
        }

        public void setCondition(ConditionEntity condition) {
            this.condition = condition;
        }

        public int getIsDay() {
            return isDay;
        }

        public void setIsDay(int isDay) {
            this.isDay = isDay;
        }

        public double getTempF() {
            return tempF;
        }

        public void setTempF(double tempF) {
            this.tempF = tempF;
        }

        public double getTempC() {
            return tempC;
        }

        public void setTempC(double tempC) {
            this.tempC = tempC;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public int getLastUpdatedEpoch() {
            return lastUpdatedEpoch;
        }

        public void setLastUpdatedEpoch(int lastUpdatedEpoch) {
            this.lastUpdatedEpoch = lastUpdatedEpoch;
        }
    }


    public static class LocationEntity {
        @Expose
        @SerializedName("localtime")
        private String localtime;
        @Expose
        @SerializedName("localtime_epoch")
        private int localtimeEpoch;
        @Expose
        @SerializedName("tz_id")
        private String tzId;
        @Expose
        @SerializedName("lon")
        private double lon;
        @Expose
        @SerializedName("lat")
        private double lat;
        @Expose
        @SerializedName("country")
        private String country;
        @Expose
        @SerializedName("region")
        private String region;
        @Expose
        @SerializedName("name")
        private String name;

        public String getLocaltime() {
            return localtime;
        }

        public void setLocaltime(String localtime) {
            this.localtime = localtime;
        }

        public int getLocaltimeEpoch() {
            return localtimeEpoch;
        }

        public void setLocaltimeEpoch(int localtimeEpoch) {
            this.localtimeEpoch = localtimeEpoch;
        }

        public String getTzId() {
            return tzId;
        }

        public void setTzId(String tzId) {
            this.tzId = tzId;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
