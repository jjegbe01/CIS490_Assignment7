import android.app.Application;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "i3MnhIKbRdwxu8mUxj4CcHxeq8MCTxKF1WKFi3dk", "ArP1v81Bb0vxMgfHFnvvFpmvLj2NCn6Ie7xoiG7z"); // Your Application ID and Client Key are defined elsewhere
    }
} 