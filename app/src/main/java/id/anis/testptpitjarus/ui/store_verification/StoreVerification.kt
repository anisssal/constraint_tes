package id.anis.testptpitjarus.ui.store_verification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import id.anis.testptpitjarus.R
import id.anis.testptpitjarus.databinding.ActivityStoreVerificationBinding
import id.anis.testptpitjarus.ui.BaseActivity

class StoreVerification : BaseActivity() {

    private  lateinit var binding : ActivityStoreVerificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStoreVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}