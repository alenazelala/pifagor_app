  package com.example.gg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gg.databinding.ActivityMainBinding
import kotlin.math.pow
import kotlin.math.sqrt

  class MainActivity : AppCompatActivity() {

      lateinit var binding:ActivityMainBinding


    override fun onCreate(s: Bundle?) {
      super.onCreate(s)
        binding = ActivityMainBinding.inflate(layoutInflater)
      setContentView(binding.root)




        }
        fun onClickResult(view: View){
            if(!isFieldEmpty()) {
                val result = getString(R.string.result_info) + getResult()
                binding.tvResult.text = result
            }
}
      private fun isFieldEmpty():Boolean{
          binding.apply {
              if(edA.text.isNullOrEmpty()) edA.error = "Значение не заполнено"
              if(edB.text.isNullOrEmpty()) edB.error = "Значение не заполнено"
              return edA.text.isNullOrEmpty() || edB.text.isNullOrEmpty()
          }



      }
      private fun getResult():String{
          val a: Double
          val b : Double
          binding.apply {
              a = edA.text.toString().toDouble()
              b = edB.text.toString().toDouble()

          }
          return sqrt((a.pow(2)+(b.pow(2)))).toString()
      }

      }







