package com.ps.agrostand.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.ps.agrostand.R;
import com.ps.agrostand.activity.BuySearchResultActivity;
import com.ps.agrostand.common.AgrostandBaseActivity;
import com.ps.agrostand.databinding.FragmentBuyBinding;
import com.ps.agrostand.databinding.FragmentExampleBinding;
import com.ps.agrostand.dto.CategoryDTO;
import com.ps.agrostand.dto.CityDTO;
import com.ps.agrostand.dto.CommodityDTO;
import com.ps.agrostand.dto.DistrictDTO;
import com.ps.agrostand.dto.ProductSuggestionDTO;
import com.ps.agrostand.dto.StatesDTO;
import com.ps.agrostand.dto.SubCategoryDTO;
import com.ps.agrostand.dto.UnitDTO;
import com.ps.agrostand.session.SessionManager;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.app.Activity.RESULT_OK;

public class ExampleFragment extends Fragment {
    private String LOG_TAG = "ExampleFragment";
    View view;
    Context mContext;
    public FragmentExampleBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_example, container, false);
        initValues();
        binding.tvText.setText("example");
        return view;

    }

    private void initValues() {
        view = binding.getRoot();
        mContext = getContext();
    }

}
