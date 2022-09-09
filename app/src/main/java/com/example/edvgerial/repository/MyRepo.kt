package com.example.edvgerial.repository

import com.example.edvgerial.R
import com.example.edvgerial.model.ActionItems
import com.example.edvgerial.model.HistoryItems

object MyRepo {

    fun getTabs():List<String>{
        return listOf(
            "Actions",
            "History"
        )
    }

    fun getActionItems():List<ActionItems>{
        return listOf(
            ActionItems("Scan QR", R.drawable.ic_qr),
            ActionItems("Enter fiscal ID", R.drawable.ic_fiskal),
            ActionItems("Pay", R.drawable.ic_pay),
            ActionItems("Transfer", R.drawable.ic_transfer),
            ActionItems("ƏDV geri al information", R.drawable.ic_information),
            ActionItems("Log out from ƏDV geri al", R.drawable.ic_log_out),
        )
    }

    fun getHistoryItems():List<HistoryItems>{
        return listOf(
            HistoryItems(R.drawable.ic_book,"Book","20.12.2020","20 AZN"),
            HistoryItems(R.drawable.ic_flight,"Flight","03.05.2022","500 AZN"),
            HistoryItems(R.drawable.ic_mask,"Mask","13.03.2020","1 AZN"),
            HistoryItems(R.drawable.ic_travel,"Travel","19.01.2021","5.7 AZN"),
            HistoryItems(R.drawable.ic_wifi,"Wifi","07.10.2019","18 AZN"),
        )
    }

}
