package id.anis.testptpitjarus.ui.dashboard

import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import id.anis.testptpitjarus.R
import id.anis.testptpitjarus.ui.BaseActivity


class DashboardActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu2, menu)
        return super.onCreateOptionsMenu(menu)
    }
}