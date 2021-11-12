package com.example.ca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast

class ans2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ans2)

        val radiogrp=findViewById<RadioGroup>(R.id.radiogrp)

        radiogrp.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener{ group, checkedId ->
                when(checkedId){
                    R.id.phouse->{
                        Toast.makeText(this, "Private house is selected", Toast.LENGTH_LONG).show()
                    }
                    R.id.rhouse ->{
                        Toast.makeText(this, "Rented house is selected", Toast.LENGTH_LONG).show()
                    }
                    R.id.apt->{
                        Toast.makeText(this, "Apartment is selected", Toast.LENGTH_LONG).show()
                    }
                }
            }
        )

        val first=findViewById<CheckBox>(R.id.first)
        val second=findViewById<CheckBox>(R.id.second)
        val third=findViewById<CheckBox>(R.id.third)

        first.setOnCheckedChangeListener{ buttonView, isChecked->
            var domain = "First lane checked";
            if(!isChecked)
                domain = "First lane unchecked"
            run {
                Toast.makeText(this, domain, Toast.LENGTH_LONG).show()
            }
        }
        second.setOnCheckedChangeListener{ buttonView, isChecked->
            var domain = "Second lane checked";
            if(!isChecked)
                domain = "Second lane unchecked"
            run {
                Toast.makeText(this, domain, Toast.LENGTH_LONG).show()
            }
        }
        third.setOnCheckedChangeListener{ buttonView, isChecked->
            var domain = "Third lane checked";
            if(!isChecked)
                domain = "Third lane unchecked"
            run {
                Toast.makeText(this, domain, Toast.LENGTH_LONG).show()
            }
        }

    }
}