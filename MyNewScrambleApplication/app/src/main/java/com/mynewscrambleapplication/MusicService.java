package com.mynewscrambleapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by dell pc on 05-Jul-16.
 */
public class MusicService extends Service {


    MediaPlayer mp;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        mp = MediaPlayer.create(this,R.raw.backgroundmusic);
        mp.start();
        mp.setLooping(true);
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        mp.stop();
        mp.release();
        super.onDestroy();
    }
}
