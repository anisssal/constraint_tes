package id.anis.testptpitjarus.ui.mainmenu

data class Menu(
    val icon: Int = 0,
    val title: String = "",
    val idItem: IDMENU? = null
)

enum class IDMENU {
    KUNJUNGAN, LOGOUT
}