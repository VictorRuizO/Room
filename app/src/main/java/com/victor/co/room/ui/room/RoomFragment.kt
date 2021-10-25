package com.victor.co.room.ui.room

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.victor.co.room.R
import com.victor.co.room.databinding.FragmentRoomBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Room.newInstance] factory method to
 * create an instance of this fragment.
 */
class RoomFragment : Fragment() {

    private val roomViewModel : RoomViewModel by viewModels<RoomViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRoomBinding.inflate(inflater,container,false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = roomViewModel

        roomViewModel.onOff.observe(viewLifecycleOwner, Observer {
            if (it){
                binding.onOff.setImageResource(R.drawable.ic_on)
            }else{
                binding.onOff.setImageResource(R.drawable.ic_off)
            }
        })


        return binding.root
    }

}