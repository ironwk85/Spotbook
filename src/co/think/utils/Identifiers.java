package co.think.utils;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;

public class Identifiers {
	static public Drawable getAndroidDrawable(String pDrawableName, View view){
		Resources resources = view.getResources();
	    int resourceId=resources.getIdentifier(pDrawableName, "drawable", view.getContext().getPackageName());
	    if(resourceId==0){
	        return null;
	    } else {
	        return resources.getDrawable(resourceId);
	    }
	}
}
