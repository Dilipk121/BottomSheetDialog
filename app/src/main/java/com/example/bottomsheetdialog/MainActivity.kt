package com.example.bottomsheetdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomsheetdialog.databinding.ActivityMainBinding
import com.example.bottomsheetdialog.databinding.SheetLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var sheetbinding: SheetLayoutBinding // automatically its bind now
    lateinit var dialog : BottomSheetDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        sheetbinding = SheetLayoutBinding.inflate(layoutInflater)

        dialog = BottomSheetDialog(this,R.style.BottomSheetTheme)
        dialog.setContentView(sheetbinding.root)

        dialog.window?.attributes?.windowAnimations = R.style.DialogAnimation

        binding.btnSubmit.setOnClickListener(){

            dialog.show()
        }

    }
}