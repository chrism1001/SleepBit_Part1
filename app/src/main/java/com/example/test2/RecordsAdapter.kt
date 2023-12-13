package com.example.test2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codepath.articlesearch.RecordEntity

class RecordsAdapter(private val mRecords: List<RecordEntity>) : RecyclerView.Adapter<RecordsAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dateText = itemView.findViewById<TextView>(R.id.date)
        val hoursText = itemView.findViewById<TextView>(R.id.sleep)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.sleep_record, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int {
        return mRecords.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val record = mRecords[position]
        val dateTextView = holder.dateText
        val hoursTextView = holder.hoursText
        dateTextView.text = record.date
        hoursTextView.text = "${record.hours.toString()}" + " hours"
    }
}