package com.hyomin.termproject

import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MusicService : android.app.Service() {
    lateinit var mp: MediaPlayer

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        android.util.Log.i("서비스테스트", "onStartCommand")
        mp = MediaPlayer.create(this, R.raw.whea)
        mp.isLooping = true
        mp.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onCreate() {
        android.util.Log.i("서비스테스트", "onCreate()")
        super.onCreate()
    }
}