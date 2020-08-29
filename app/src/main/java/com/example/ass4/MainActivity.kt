package com.example.ass4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDatePickerDialog(view: View) {
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")
    }
    fun showregister(view: View) {
        var radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        var selectedId : Int = radioGroup.checkedRadioButtonId;
        var radioButton : RadioButton = findViewById(selectedId);
        txt_show.text = "Name: ${edit_name.text}\nPassword: ${edit_password.text}\nGender: ${radioButton.text}\nEmail: ${edit_email.text}\nBirthday: ${text_date.text}"

    }
    fun reset(view: View) {
        edit_name.text.clear()
        edit_password.text.clear()
        radioGroup.clearCheck()
        edit_email.text.clear()
        text_date.text="mm/dd/yy"
        txt_show.text = "Show Information"

    }

}