package net.zhuoweizhang.scanmediaplz;

import android.app.Activity;
import android.content.*;
import android.net.*;
import android.os.*;
import android.os.Bundle;

public class ScanMediaPlzActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.sendBroadcast(new Intent("android.intent.action.MEDIA_MOUNTED", Uri.parse("file://" + Environment.getExternalStorageDirectory())));
	finish();
    }
}
