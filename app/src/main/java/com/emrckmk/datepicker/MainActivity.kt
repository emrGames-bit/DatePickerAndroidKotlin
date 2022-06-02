package com.emrckmk.datepicker

import android.app.DatePickerDialog
import android.content.DialogInterface
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextTextPersonName.setOnClickListener {

            val calendar = Calendar.getInstance()
            val yil = calendar.get(Calendar.YEAR)
            val ay = calendar.get(Calendar.MONTH)
            val gün = calendar.get(Calendar.DAY_OF_MONTH)


            val datePicker : DatePickerDialog

            datePicker = DatePickerDialog(this@MainActivity,DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                editTextTextPersonName.setText("$year/$month/$dayOfMonth")

            },yil,ay,gün)

            datePicker.setTitle("Tarih Giriniz")
            datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",datePicker)
            datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"Iptal",datePicker)

            datePicker.show()
        }




    }
}