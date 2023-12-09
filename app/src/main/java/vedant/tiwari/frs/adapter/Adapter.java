package vedant.tiwari.frs.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import vedant.tiwari.frs.databinding.MainViewholderBinding;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(MainViewholderBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent,
                false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        MainViewholderBinding binding;

        public ViewHolder(@NonNull MainViewholderBinding mainViewholderBinding) {
            super(mainViewholderBinding.getRoot());
            binding = mainViewholderBinding;
        }
    }
}
