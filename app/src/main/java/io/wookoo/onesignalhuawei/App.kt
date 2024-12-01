package io.wookoo.onesignalhuawei

import android.app.Application
import com.onesignal.OneSignal
import com.onesignal.debug.LogLevel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val oneSignalKey = BuildConfig.ONE_SIGNAL_KEY

        OneSignal.Debug.logLevel = LogLevel.VERBOSE
        OneSignal.initWithContext(this@App, oneSignalKey)
        CoroutineScope(Dispatchers.IO).launch {
            OneSignal.Notifications.requestPermission(true)
        }
    }
}