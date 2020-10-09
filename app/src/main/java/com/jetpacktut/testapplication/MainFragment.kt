package com.jetpacktut.testapplication


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*
import java.lang.NumberFormatException


private const val SENDED_VALUE = "VALUE"


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        continueButton.setOnClickListener {
            if (editText.text.isNotEmpty() && editText.text !=null){
                try {
                    val editValue = editText.text.toString().toInt()

                    val secondFragment = SecondFragment.newInstance(editValue)

                    activity?.let { it1 -> replaceFragment(secondFragment, it1, true) }
                }catch (exception : NumberFormatException){

                }
            }

        }
    }




    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }


}
