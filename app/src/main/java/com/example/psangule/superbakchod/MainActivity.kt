package com.example.psangule.superbakchod

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.database.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private var TAG: String = "MainActivity"

    //Initialize views
    lateinit var textViewResult: TextView
    lateinit var EditedName: EditText
    lateinit var SearchButton: Button

    //Database Variables
    private var mDatabase: DatabaseReference? = null
    private var mNameReference : DatabaseReference? = null
    //Variables
    var textState: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Edited Name
        EditedName = findViewById(R.id.edit_name)


        //Result Text Label Result
        textViewResult = findViewById(R.id.result)
        textViewResult.text="--Name displayed here--"

        //Search
        SearchButton = findViewById(R.id.button)


        //Database
        mDatabase = FirebaseDatabase.getInstance().reference

//        //NameReference
//        mNameReference = FirebaseDatabase.getInstance().getReference("name")
//
//        //Setting data
//        mDatabase!!.child("title").setValue("this is against title")

    }

    //Change function to be called by button on click
    fun change(){
        textViewResult.text= EditedName.text
    }

    //Login Button : Main View -> Nav view
    fun login(view: View){
        val loginIntent = Intent(this@MainActivity, Nav::class.java)
        startActivity(loginIntent)
    }
}
