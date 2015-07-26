package com.theguyz.studio5.socialqa.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.theguyz.studio5.socialqa.R;
import com.theguyz.studio5.socialqa.models.QuestionsModel;

import java.util.List;

/**
 * Created by g2ishan on 7/26/15.
 */
public class QuestionsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<QuestionsModel> dataSet;

    public QuestionsAdapter (List<QuestionsModel> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.questions_card_item_view, parent, false);

        QuestionsViewHolder holder = new QuestionsViewHolder(view);
        view.setTag(holder);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.i("ss","ss");
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class QuestionsViewHolder extends RecyclerView.ViewHolder {

        public QuestionsViewHolder(View itemView) {
            super(itemView);
        }
    }
}
