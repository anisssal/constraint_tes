package id.anis.testptpitjarus.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.anis.testptpitjarus.BuildConfig
import id.anis.testptpitjarus.R
import id.anis.testptpitjarus.databinding.ActivityLoginBinding
import id.anis.testptpitjarus.ui.BaseActivity

class LoginActivity : BaseActivity() {

    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvVersionApp.text = String.format("App Ver %s", BuildConfig.VERSION_NAME)

    }
}