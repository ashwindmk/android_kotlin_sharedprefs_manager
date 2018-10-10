package ashwin.examples.com.kotlinsharedprefs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import ashwin.examples.com.kotlinsharedprefs.SharedPrefsManager.set
import ashwin.examples.com.kotlinsharedprefs.SharedPrefsManager.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prefs = SharedPrefsManager.defaultPrefs(this)

        val name: String? = prefs["name", "default"]
        Log.d("debug-log", "name: $name")

        prefs["name"] = "ashwin"
    }
}
