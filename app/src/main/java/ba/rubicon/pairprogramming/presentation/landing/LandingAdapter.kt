package ba.rubicon.pairprogramming.presentation.landing

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ba.rubicon.pairprogramming.R
import ba.rubicon.pairprogramming.domain.entity.Repository

class LandingAdapter : RecyclerView.Adapter<LandingAdapter.ViewHolder>() {
    private val mList = mutableListOf<Repository>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandingAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_landing, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: LandingAdapter.ViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount(): Int = mList.size

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(list: List<Repository>) {
        mList.clear()
        mList.addAll(list)
        notifyDataSetChanged()
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val title: TextView = view.findViewById(R.id.title)
        private val subtitle: TextView = view.findViewById(R.id.subtitle)

        fun bind(item: Repository) {
            title.text = item.title
            subtitle.text = item.subtitle
        }
    }
}