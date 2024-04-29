package com.example.menu.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.menu.activity_accesorio
import com.example.menu.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val detalle: String = ""
        var costo: String = "$175.00"
        var intent = Intent(activity, activity_accesorio::class.java)

        binding.imgAccesorio1.setOnClickListener {
            Toast.makeText(activity, "accesorio1 $600.00", Toast.LENGTH_SHORT).show()
            costo = "$600.00"
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 1)
            startActivity(intent)
        }
        binding.imgAccesorio2.setOnClickListener {
            Toast.makeText(activity, "accesorio2 $400.00", Toast.LENGTH_SHORT).show()
            costo = "400.00"
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 2)
            startActivity(intent)
        }
        binding.imgAccesorio3.setOnClickListener {
            Toast.makeText(activity, "accesorio3 $500.00", Toast.LENGTH_SHORT).show()
            costo = "500.00"
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 3)
            startActivity(intent)
        }
        binding.imgAccesorio4.setOnClickListener {
            Toast.makeText(activity, "accesorio4 $10000.00", Toast.LENGTH_SHORT).show()
            costo = "10000.00"
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 4)
            startActivity(intent)
        }
        binding.imgAccesorio5.setOnClickListener {
            Toast.makeText(activity, "accesorio5 $1500.00", Toast.LENGTH_SHORT).show()
            costo = "1500.00"
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 5)
            startActivity(intent)
        }
        binding.imgAccesorio6.setOnClickListener {
            Toast.makeText(activity, "accesorio6 $1800.00", Toast.LENGTH_SHORT).show()
            costo = "1800.00"
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 6)
            startActivity(intent)
        }
        binding.imgAccesorio7.setOnClickListener {
            Toast.makeText(activity, "accesorio7 $1600.00", Toast.LENGTH_SHORT).show()
            costo = "1600.00"
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 7)
            startActivity(intent)
        }
        binding.imgAccesorio8.setOnClickListener {
            Toast.makeText(activity, "accesorio8 $1900.00", Toast.LENGTH_SHORT).show()
            costo = "1900.00"
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 8)
            startActivity(intent)
        }
        binding.imgAccesorio9.setOnClickListener {
            Toast.makeText(activity, "accesorio9 $2100.00", Toast.LENGTH_SHORT).show()
            costo = "2100.00"
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("numAccesorio", 9)
            startActivity(intent)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}