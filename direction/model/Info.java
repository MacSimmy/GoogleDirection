package horseman.four.com.unite.screens.map.direction.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Mahendra Chhimwal on 17/1/17.
 */

@SuppressWarnings("WeakerAccess")
public class Info implements Parcelable {
    private String text;
    private String value;

    public Info() {
    }

    protected Info(Parcel in) {
        text = in.readString();
        value = in.readString();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(text);
        dest.writeString(value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Info> CREATOR = new Creator<Info>() {
        @Override
        public Info createFromParcel(Parcel in) {
            return new Info(in);
        }

        @Override
        public Info[] newArray(int size) {
            return new Info[size];
        }
    };
}
