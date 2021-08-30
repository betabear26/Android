package dev.sandeepsuman.diffutils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(initialList: List<ListItem>): RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    private var list = initialList.toMutableList()


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var titleTextView: TextView = view.findViewById(R.id.title)
        var subtitleTextView: TextView = view.findViewById(R.id.subtitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_recyclerview, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.titleTextView.text = list[position].title
        holder.subtitleTextView.text = list[position].subTitle
    }

    override fun getItemCount(): Int {
        return list.size
    }


    fun update(newList: List<ListItem>){
        val diffResult = DiffUtil.calculateDiff(RVDiffUtil(list, newList))
        list.clear()
        list = newList.toMutableList()
        diffResult.dispatchUpdatesTo(this)
    }
}