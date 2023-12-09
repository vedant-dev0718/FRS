package vedant.tiwari.frs.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreference {

    private final SharedPreferences mSharedPref;
    public Context context;

    public SharedPreference(Context context) {
        this.context = context;
        mSharedPref = context.getSharedPreferences("Havendaxa",
                Context.MODE_PRIVATE);
    }

    public void savePrefString(String key, String value) {
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putString(key, value);
        editor.apply();
        editor.commit();
    }

    public void savePrefBoolean(String key, Boolean value) {

        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(key, value);
        editor.apply();
        editor.commit();
    }

    public void savePrefInteger(String key, int value) {

        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putInt(key, value);
        editor.apply();
        editor.commit();
    }

    public int loadPrefInteger(String key) {

        return mSharedPref.getInt(key, 0);
    }

    public String loadPrefString(String key) {
        return mSharedPref.getString(key, "");
    }

    public Boolean loadPrefBoolean(String key) {

        return mSharedPref.getBoolean(key, false);
    }




}
