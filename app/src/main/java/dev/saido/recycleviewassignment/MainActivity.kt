package dev.saido.recycleviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.saido.recycleviewassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fibonacciNumbers()
    }


    fun fibonacciNumbers(){
        var num1 = 0
        var num2 = 1

        var listOfNumbers = mutableListOf<Int>()
        for (numb in 1..100 ){
            listOfNumbers.add(num1)
            var sum = num1+num2
            num1=num2
            num2=sum

            var numberAdapter = FibonacciNumbers(listOfNumbers)
            binding.rvNumbers.layoutManager=LinearLayoutManager(this)
            binding.rvNumbers.adapter=numberAdapter
        }
    }
}