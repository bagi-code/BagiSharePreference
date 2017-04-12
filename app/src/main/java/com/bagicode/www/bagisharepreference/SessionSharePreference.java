package com.bagicode.www.bagisharepreference;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by bagicode on 12/04/17.
 */

public class SessionSharePreference {

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;
    int private_mode = 0;
    private static final String PREF_NAME= "Tutorial";

    public SessionSharePreference (Context context) {
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME, private_mode);
        editor = pref.edit();
    }

    public void setNama (String nama){
        editor.putString("nama", nama);
        editor.commit();
    }

    public String getNama () {
        return pref.getString("nama", null);
    }

}
