package com.example.country.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.country.model.CountryModel;
import com.example.country.R;

import java.util.ArrayList;

/**
 * Created by lingez on 9/16/17.
 */

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder> {

    private ArrayList mData;

    public CountriesAdapter() {
        mData = new ArrayList();
    }

    @Override
    public CountriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vh_country, parent, false);
        return new CountriesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CountriesViewHolder holder, int position) {
        CountryModel model = (CountryModel) mData.get(position);
        holder.countryName.setText(model.getCountryName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    /***
     * Add new country to list
     * @param country
     */
    public void addItem(CountryModel country) {
        mData.add(country);
    }

    /***
     * Remove object from list
     * @param country
     */
    public void removeItem(CountryModel country) {
        mData.remove(country);
    }

    /***
     * Inner class for View Holder
     */
    class CountriesViewHolder extends RecyclerView.ViewHolder {

        TextView countryName;

        public CountriesViewHolder(View itemView) {
            super(itemView);

            countryName = itemView.findViewById(R.id.tv_country_name);
        }
    }
}
