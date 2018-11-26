package com.eliasmazz.androidcomponents

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.content.Context
import android.util.Log

class MusicObserver(context: Context) : LifecycleObserver {

    private val musicManager: MusicManager by lazy { MusicManager(context) }
    private val LOG_TAG = "LifecycleAwareLoggin"

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun timeToStartMusic(){
        Log.d(LOG_TAG, "onCreate()")
        musicManager.start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pauseMusic(){
        Log.d(LOG_TAG, "onPause()")
        musicManager.pause()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resumeMusic(){
        Log.d(LOG_TAG, "onResume()")
        musicManager.start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun destroyMusic(){
        Log.d(LOG_TAG, "onDestroy()")
        musicManager.stop()
    }



}