
package com.example.android.starbridges.model.EditReimbursement;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

import com.example.android.starbridges.model.CustomField;
import com.example.android.starbridges.model.ReturnValue;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EditReimbursement implements Serializable, Parcelable
{

    @SerializedName("CustomField")
    @Expose
    private com.example.android.starbridges.model.CustomField customField;
    @SerializedName("ReturnValue")
    @Expose
    private ReturnValue returnValue;
    @SerializedName("isSucceed")
    @Expose
    private boolean isSucceed;
    @SerializedName("message")
    @Expose
    private String message;
    public final static Creator<EditReimbursement> CREATOR = new Creator<EditReimbursement>() {


        @SuppressWarnings({
            "unchecked"
        })
        public EditReimbursement createFromParcel(Parcel in) {
            return new EditReimbursement(in);
        }

        public EditReimbursement[] newArray(int size) {
            return (new EditReimbursement[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7589364499994741052L;

    protected EditReimbursement(Parcel in) {
        this.customField = ((com.example.android.starbridges.model.CustomField) in.readValue((com.example.android.starbridges.model.CustomField.class.getClassLoader())));
        this.returnValue = ((ReturnValue) in.readValue((ReturnValue.class.getClassLoader())));
        this.isSucceed = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public EditReimbursement() {
    }

    /**
     * 
     * @param message
     * @param isSucceed
     * @param customField
     * @param returnValue
     */
    public EditReimbursement(com.example.android.starbridges.model.CustomField customField, ReturnValue returnValue, boolean isSucceed, String message) {
        super();
        this.customField = customField;
        this.returnValue = returnValue;
        this.isSucceed = isSucceed;
        this.message = message;
    }

    public com.example.android.starbridges.model.CustomField getCustomField() {
        return customField;
    }

    public void setCustomField(com.example.android.starbridges.model.CustomField customField) {
        this.customField = customField;
    }

    public EditReimbursement withCustomField(CustomField customField) {
        this.customField = customField;
        return this;
    }

    public ReturnValue getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(ReturnValue returnValue) {
        this.returnValue = returnValue;
    }

    public EditReimbursement withReturnValue(ReturnValue returnValue) {
        this.returnValue = returnValue;
        return this;
    }

    public boolean isIsSucceed() {
        return isSucceed;
    }

    public void setIsSucceed(boolean isSucceed) {
        this.isSucceed = isSucceed;
    }

    public EditReimbursement withIsSucceed(boolean isSucceed) {
        this.isSucceed = isSucceed;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EditReimbursement withMessage(String message) {
        this.message = message;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(customField);
        dest.writeValue(returnValue);
        dest.writeValue(isSucceed);
        dest.writeValue(message);
    }

    public int describeContents() {
        return  0;
    }

}
