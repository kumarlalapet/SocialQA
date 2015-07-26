package com.theguyz.studio5.socialqa.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by g2ishan on 7/26/15.
 */
public class QuestionsModel implements Parcelable {

    private QuestionType mQuestionType;

    public QuestionsModel(QuestionType pQuestionType) {
        this.mQuestionType = pQuestionType;
    }

    public QuestionType getmQuestionType() {
        return mQuestionType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mQuestionType.name());
    }

    public enum QuestionType {
        TWOIMAGEQUESTION, ONEIMAGEQUESTION, TWOCHOICENOIMAGEQUESTION,MORETHANTWOCHOICENOIMAGEQUESTION
    }

    public static final Creator<QuestionsModel> CREATOR = new Creator<QuestionsModel>() {

        @Override
        public QuestionsModel createFromParcel(Parcel source) {
            String enumName = source.readString();
            QuestionType qt;
            if(QuestionType.TWOIMAGEQUESTION.name().equals(enumName))
                qt = QuestionType.TWOIMAGEQUESTION;
            else if(QuestionType.ONEIMAGEQUESTION.name().equals(enumName))
                qt = QuestionType.ONEIMAGEQUESTION;
            else if(QuestionType.TWOCHOICENOIMAGEQUESTION.name().equals(enumName))
                qt = QuestionType.TWOCHOICENOIMAGEQUESTION;
            else
                qt = QuestionType.MORETHANTWOCHOICENOIMAGEQUESTION;
            return new QuestionsModel(qt);
        }

        @Override
        public QuestionsModel[] newArray(int size) {
            return new QuestionsModel[size];
        }
    };
}
