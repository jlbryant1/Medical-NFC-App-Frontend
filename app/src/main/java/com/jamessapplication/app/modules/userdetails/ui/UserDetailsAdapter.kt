package com.jamessapplication.app.modules.userdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jamessapplication.app.R
import com.jamessapplication.app.databinding.RowUserDetailsBinding
import com.jamessapplication.app.modules.userdetails.`data`.model.UserDetailsRowModel
import kotlin.Int
import kotlin.collections.List

class UserDetailsAdapter(
  var list: List<UserDetailsRowModel>
) : RecyclerView.Adapter<UserDetailsAdapter.RowUserDetailsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUserDetailsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_user_details,parent,false)
    return RowUserDetailsVH(view)
  }

  override fun onBindViewHolder(holder: RowUserDetailsVH, position: Int) {
    val userDetailsRowModel = UserDetailsRowModel()
    // TODO uncomment following line after integration with data source
    // val userDetailsRowModel = list[position]
    holder.binding.userDetailsRowModel = userDetailsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<UserDetailsRowModel>) {
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
      item: UserDetailsRowModel
    ) {
    }
  }

  inner class RowUserDetailsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowUserDetailsBinding = RowUserDetailsBinding.bind(itemView)
  }
}
