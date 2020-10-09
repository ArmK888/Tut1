package com.jetpacktut.testapplication


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second.*

private const val SENDED_VALUE = "VALUE"

class SecondFragment : Fragment() {
    private var param1: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getInt(SENDED_VALUE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editValueText.text = param1?.times(3).toString()
    }


    companion object {
        @JvmStatic
        fun newInstance(param : Int) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putInt(SENDED_VALUE, param)
                }
            }

    }
}
