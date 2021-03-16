package id.anis.testptpitjarus.ui.mainmenu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import id.anis.testptpitjarus.R
import id.anis.testptpitjarus.databinding.ActivityMainMenuBinding
import id.anis.testptpitjarus.ui.BaseActivity

class MainMenuActivity : BaseActivity(), MenuAdapter.OnMenuClickListener {

    private lateinit var binding: ActivityMainMenuBinding
    private val listItem = listOf(
        Menu(
            R.drawable.ic_store,
            "Kunjungan",
            IDMENU.KUNJUNGAN
        ),
        Menu(
            R.drawable.ic_target,
            "Target Install CDFDPC",
        ),
        Menu(
            R.drawable.ic_dashboard,
            "Dashboard",
        ),
        Menu(
            R.drawable.ic_note_book,
            "Transmission History",
        ),
        Menu(
            R.drawable.ic_logout,
            "Logout",
            IDMENU.LOGOUT
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val recAdapter = MenuAdapter(this, listItem)
        val layoutManager = GridLayoutManager(this, 4, GridLayoutManager.VERTICAL, false)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = recAdapter
    }

    override fun onCreateOptionsMenu(menu: android.view.Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu , menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onClickMenu(idmenu: IDMENU) {

    }
}