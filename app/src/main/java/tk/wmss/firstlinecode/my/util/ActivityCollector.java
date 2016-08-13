package tk.wmss.firstlinecode.my.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wmss on 2016/8/13.
 */
public class ActivityCollector {
	public static List<Activity> activities = new ArrayList<Activity>();

	public static void addActivity(Activity activity) {
		activities.add(activity);
	}

	public static void removeActivity(Activity activity) {
		activities.remove(activity);
	}

	public static void finushAll() {
		for (Activity activity : activities) {
			if (!activity.isFinishing()) {
				activity.finish();
			}
		}
	}
}
