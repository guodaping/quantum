package mobi.quantum.util;

import android.app.Application;
import android.content.Context;

public class ContextHolder {


    private final ContextHolder self = this;

    private static Context context;

    public static void init(Context context) {
        ContextHolder.context = context;
    }

    public static Context getContext() {
        if (context == null) {
            try {
                Application application = (Application) Class.forName("android.app.ActivityThread")
                        .getMethod("currentApplication").invoke(null, (Object[]) null);
                if (application != null) {
                    context = application;
                    return application;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                Application application = (Application) Class.forName("android.app.AppGlobals")
                        .getMethod("getInitialApplication").invoke(null, (Object[]) null);
                if (application != null) {
                    context = application;
                    return application;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            throw new IllegalStateException("ContextHolder is not initialed, it is recommend to init with application context.");
        }
        return context;
    }
}
