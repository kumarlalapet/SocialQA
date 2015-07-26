package com.theguyz.studio5.socialqa.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.theguyz.studio5.socialqa.R;
import com.theguyz.studio5.socialqa.models.QuestionsModel;

import java.util.List;

/**
 * Created by g2ishan on 7/26/15.
 */
public class QuestionsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final String TAG = QuestionsAdapter.class.getName();
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
        Log.i(TAG,"Nothing yet");
        //TODO alter the indicators, visible not visible, alphas for views in viewHolder based on the Model at the given position
        final QuestionsViewHolder viewHolder = (QuestionsViewHolder) holder;
        viewHolder.rightImageView.setAlpha(1.0f);
        viewHolder.leftImageView.setAlpha(1.0f);
        viewHolder.rightButton.setAlpha(1.0f);
        viewHolder.leftButton.setAlpha(1.0f);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class QuestionsViewHolder extends RecyclerView.ViewHolder {

        public ImageView rightImageView;
        public Button rightButton;
        public ImageView leftImageView;
        public Button leftButton;
        public Context context;

        public QuestionsViewHolder(View itemView) {
            super(itemView);

            this.context = itemView.getContext();
            rightImageView = (ImageView) itemView.findViewById(R.id.imageright_view);
            rightButton = (Button) itemView.findViewById(R.id.buttonright_view);
            leftImageView = (ImageView) itemView.findViewById(R.id.imageleft_view);
            leftButton = (Button) itemView.findViewById(R.id.buttonleft_view);

        }
    }
}
