package com.theguyz.studio5.socialqa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.theguyz.studio5.socialqa.adapters.QuestionsAdapter;
import com.theguyz.studio5.socialqa.models.QuestionsModel;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class HomeActivityFragment extends Fragment {

    RecyclerView recyclerView;
    QuestionsAdapter questionsAdapter;
    List<QuestionsModel> mResultList;

    public HomeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.scrollable_questions_card_view);

        //recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        mResultList = new ArrayList<QuestionsModel>();
        questionsAdapter = new QuestionsAdapter(mResultList);
        recyclerView.setAdapter(questionsAdapter);

        return v;
    }
}
