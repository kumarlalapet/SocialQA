package com.theguyz.studio5.socialqa.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by g2ishan on 7/26/15.
 */
public class QuestionsModel implements Parcelable {

    public QuestionsModel() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    public static final Creator<QuestionsModel> CREATOR = new Creator<QuestionsModel>() {

        @Override
        public QuestionsModel createFromParcel(Parcel source) {
            return new QuestionsModel();
        }

        @Override
        public QuestionsModel[] newArray(int size) {
            return new QuestionsModel[size];
        }
    };
}
