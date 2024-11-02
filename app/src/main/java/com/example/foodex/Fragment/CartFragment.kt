package com.example.foodex.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodex.Adapter.CartAdapter
import com.example.foodex.R
import com.example.foodex.databinding.FragmentCartBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater, container, false)

        val cartFoodName = listOf("Burger", "Pizza", "Pasta","Salad","Sandwich","Chicken Tandoor")
        val cartItemPrice = listOf("$5", "$10", "$15")
        val cartImage = listOf(R.drawable.foodcarti1, R.drawable.foodcarti2, R.drawable.foodcarti3, R.drawable.foodcarti1, R.drawable.foodcarti1, R.drawable.foodcarti1)

        // Pass ArrayLists to the adapter
        val adapter = CartAdapter(
            ArrayList(cartFoodName),
            ArrayList(cartItemPrice),
            ArrayList(cartImage)
        )

        binding.cartRecycler.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecycler.adapter = adapter

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CartFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
