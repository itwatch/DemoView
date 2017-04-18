package com.hnshangyu.huirongfa.ui.activity.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.hnshangyu.huirongfa.R;


public class ActivityUtil {

    public static void startActivity(Activity activity, Class<?> clazz, Bundle bundle) {
        Intent intent = new Intent(activity, clazz);
        intent.replaceExtras(bundle);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.anim_fade_in, R.anim.anim_fade_out);
    }

    public static void finishAnimation(Activity activity){
        activity.overridePendingTransition(R.anim.anim_fade_in, R.anim.anim_fade_out);
    }

    public static boolean checkData(Activity activity, String... names) {
        boolean result = activity != null;

        for (String name : names) result &= result && activity.getIntent().hasExtra(name);

        return result;
    }

}
