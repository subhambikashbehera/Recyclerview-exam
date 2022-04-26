package com.subhambikash.recyclerview_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val empList = arrayListOf<EmpModel>()
        for (i in 0..50){
            empList.add(EmpModel("subham bikash behera", "id:SHHSH145SSSD", "MALE", "7749867465"))
            empList.add(EmpModel("IASAC bikash behera", "id:SHHSH145SSSD", "MALE", "7749867465"))
            empList.add(EmpModel("SUBHRANSHU bikash behera", "id:SHHSH145SSSD", "MALE", "7749867465"))
            empList.add(EmpModel("RAM bikash behera", "id:SHHSH145SSSD", "MALE", "7749867465"))
            empList.add(EmpModel("XYZ bikash behera", "id:SHHSH145SSSD", "MALE", "7749867465"))
        }

        val adapter = RecyclerviewAdapter(this, empList)
        recyclerView.adapter = adapter


    }


}