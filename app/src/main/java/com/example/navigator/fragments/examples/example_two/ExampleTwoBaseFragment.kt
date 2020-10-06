package com.example.navigator.fragments.examples.example_two

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigator.R
import kotlinx.android.synthetic.main.fragment_base.*
import kotlinx.android.synthetic.main.fragment_example_two.*


class ExampleTwoBaseFragment : Fragment() {
    var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_example_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_tittle.setText(arguments!!.get("title").toString())

        navController = Navigation.findNavController(view)
        bt_sc1_p1.setOnClickListener {
            navController?.let {
                it.navigate(R.id.action_exampleTwoFragment_to_sceneOnePartOneFragment, bundleOf("title" to bt_sc1_p1.text))
            }
        }
        bt_sc1_p2.setOnClickListener {
            navController?.let {
                it.navigate(R.id.action_exampleTwoFragment_to_sceneOnePartTwoFragment, bundleOf("title" to bt_sc1_p2.text))
            }
        }
        bt_sc1_p3.setOnClickListener {
            navController?.let {
                it.navigate(R.id.action_exampleTwoFragment_to_sceneOnePartThreeFragment, bundleOf("title" to bt_sc1_p3.text))
            }
        }
    }
}