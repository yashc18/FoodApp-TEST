package com.example.foodex.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.example.foodex.Adapter.PopularAdapter
import com.example.foodex.R
import com.example.foodex.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize ImageSlider and add images to it
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner2, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner3, ScaleTypes.FIT))

        // Set images to the image slider
        val imageSlider = view.findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        // Set click listener for the ImageSlider
        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position: Int) {
                val itemMessage = "Selected Image $position"
                Toast.makeText(requireContext(), itemMessage, Toast.LENGTH_SHORT).show()
            }

            override fun doubleClick(position: Int) {
                val doubleClickMessage = "Double-clicked Image $position"
                Toast.makeText(requireContext(), doubleClickMessage, Toast.LENGTH_SHORT).show()
            }
        })

        // Setup RecyclerView
        val foodName = listOf("Burger", "Sandwich", "Momo")
        val price = listOf("₹249", "₹149", "₹199")
        // Use resource IDs directly, not strings
        val popularFoodImages = listOf(
            R.drawable.foodcarti1,
            R.drawable.foodcarti2,
            R.drawable.foodcarti3
        )

        val adapter = PopularAdapter(foodName, price, popularFoodImages)
        binding.ItemReCycler.apply {
            layoutManager = LinearLayoutManager(requireContext())
            this.adapter = adapter
        }
    }
}