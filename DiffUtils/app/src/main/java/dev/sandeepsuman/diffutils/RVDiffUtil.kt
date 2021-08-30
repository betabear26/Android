package dev.sandeepsuman.diffutils

import androidx.recyclerview.widget.DiffUtil

class RVDiffUtil(
    private val oldList: List<ListItem>,
    private val newList: List<ListItem>
): DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return when{
            oldList[oldItemPosition].title != newList[newItemPosition].title -> false
            oldList[oldItemPosition].subTitle != newList[newItemPosition].subTitle -> false
            else -> true
        }
    }
}