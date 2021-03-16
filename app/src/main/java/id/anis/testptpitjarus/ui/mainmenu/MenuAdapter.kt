package id.anis.testptpitjarus.ui.mainmenu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.anis.testptpitjarus.R
import id.anis.testptpitjarus.databinding.ItemGridMenuBinding
import java.util.ArrayList

class MenuAdapter (private val listener : OnMenuClickListener? = null,
                   private val items: List<Menu> = arrayListOf()): RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    inner class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding =ItemGridMenuBinding.bind(itemView)

        fun bind(menu: Menu) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(menu.icon)
                    .into(imageView)
                tvItemName.text =menu.title
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=
        MenuViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_grid_menu, parent,false))


    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(items[position])
    }


    interface OnMenuClickListener{
        fun onClickMenu(idmenu: IDMENU)
    }

}