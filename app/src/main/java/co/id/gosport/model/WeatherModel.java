package co.id.gosport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherModel {

    @Expose
    @SerializedName("current")
    private CurrentEntity current;
    @Expose
    @SerializedName("location")
    private LocationEntity location;

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

    public static class CurrentEntity {
        @Expose
        @SerializedName("gust_kph")
        private double gustKph;
        @Expose
        @SerializedName("gust_mph")
        private double gustMph;
        @Expose
        @SerializedName("uv")
        private double uv;
        @Expose
        @SerializedName("vis_miles")
        private double visMiles;
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
        private double pressureMb;
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

        public double getUv() {
            return uv;
        }

        public void setUv(int uv) {
            this.uv = uv;
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
