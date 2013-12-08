package net.zhuoweizhang.scanmediaplz;

import android.app.Activity;
import android.content.*;
import android.net.*;
import android.os.*;
import android.os.Bundle;
import android.widget.*;

public class ScanMediaPlzActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        scan(this, "external");
        Toast.makeText(this, "Media scanner started", Toast.LENGTH_SHORT).show();
	finish();
    }
    private static void scan(Context context, String volume) {
        Bundle args = new Bundle();
        args.putString("volume", volume);
        context.startService(
                new Intent().
                setComponent(new ComponentName("com.android.providers.media", "com.android.providers.media.MediaScannerService")).
                putExtras(args));
    }
}
