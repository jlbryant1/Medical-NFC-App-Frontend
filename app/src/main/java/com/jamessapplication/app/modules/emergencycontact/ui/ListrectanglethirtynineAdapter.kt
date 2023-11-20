package com.jamessapplication.app.modules.emergencycontact.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jamessapplication.app.R
import com.jamessapplication.app.databinding.RowListrectanglethirtynineBinding
import com.jamessapplication.app.modules.emergencycontact.`data`.model.ListrectanglethirtynineRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglethirtynineAdapter(
  var list: List<ListrectanglethirtynineRowModel>
) : RecyclerView.Adapter<ListrectanglethirtynineAdapter.RowListrectanglethirtynineVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglethirtynineVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglethirtynine,parent,false)
    return RowListrectanglethirtynineVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglethirtynineVH, position: Int) {
    val listrectanglethirtynineRowModel = ListrectanglethirtynineRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglethirtynineRowModel = list[position]
    holder.binding.listrectanglethirtynineRowModel = listrectanglethirtynineRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglethirtynineRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListrectanglethirtynineRowModel
    ) {
    }
  }

  inner class RowListrectanglethirtynineVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglethirtynineBinding =
        RowListrectanglethirtynineBinding.bind(itemView)
  }
}
