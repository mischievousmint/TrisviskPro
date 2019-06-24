package com.example.examen2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class VersionAdapter extends RecyclerView.Adapter<VersionAdapter.ViewHolder> {

    private List<VersionModel> versionModelList;

    public  VersionAdapter(List<VersionModel> userModelList) { this.versionModelList = userModelList; }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String name = versionModelList.get(position).getName();
        String number = versionModelList.get(position).getNumber();
        holder.tvName.setText(name);
        holder.tvNumber.setText(number);
    }

    @Override
    public int getItemCount() {
        return versionModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName, tvNumber;

        public ViewHolder(View v) {
            super(v);
            tvName = v.findViewById(R.id.tvName);
            tvNumber = v.findViewById(R.id.tvNumber);
        }
    }
}
