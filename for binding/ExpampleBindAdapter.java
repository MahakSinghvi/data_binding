package com.ps.agrostand.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.ps.agrostand.R;
import com.ps.agrostand.databinding.AdapterCreatePostViewBinding;
import com.ps.agrostand.databinding.AdapterExampleBindingBinding;
import com.ps.agrostand.dto.CreatePostFileDTO;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ExpampleBindAdapter extends RecyclerView.Adapter<ExpampleBindAdapter.ViewHolder> {
    private String LOG_TAG = "ExpampleBindAdapter";
    Context mContext;
    //yaha paar xml ke name se binding bnegi
    private AdapterExampleBindingBinding binding;
    private LayoutInflater inflater;

    public ExpampleBindAdapter(Context context) {

        mContext = context;
        inflater = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(inflater, R.layout.adapter_example_binding, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.tvText.setText("ABCDEFG");

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //yaha paar xml ke name se binding initialization
        AdapterExampleBindingBinding binding;

        public ViewHolder(@NonNull AdapterExampleBindingBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
