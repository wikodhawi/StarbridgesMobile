
package id.co.indocyber.android.starbridges.model.LoanTransactionType;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoanTransactionType implements Serializable, Parcelable
{

    @SerializedName("CustomField")
    @Expose
    private CustomField customField;
    @SerializedName("ReturnValue")
    @Expose
    private List<ReturnValue> returnValue = null;
    @SerializedName("isSucceed")
    @Expose
    private Boolean isSucceed;
    @SerializedName("message")
    @Expose
    private String message;
    public final static Creator<LoanTransactionType> CREATOR = new Creator<LoanTransactionType>() {


        @SuppressWarnings({
            "unchecked"
        })
        public LoanTransactionType createFromParcel(Parcel in) {
            return new LoanTransactionType(in);
        }

        public LoanTransactionType[] newArray(int size) {
            return (new LoanTransactionType[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7675273226695781101L;

    protected LoanTransactionType(Parcel in) {
        this.customField = ((CustomField) in.readValue((CustomField.class.getClassLoader())));
        in.readList(this.returnValue, (ReturnValue.class.getClassLoader()));
        this.isSucceed = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public LoanTransactionType() {
    }

    /**
     * 
     * @param message
     * @param isSucceed
     * @param customField
     * @param returnValue
     */
    public LoanTransactionType(CustomField customField, List<ReturnValue> returnValue, Boolean isSucceed, String message) {
        super();
        this.customField = customField;
        this.returnValue = returnValue;
        this.isSucceed = isSucceed;
        this.message = message;
    }

    public CustomField getCustomField() {
        return customField;
    }

    public void setCustomField(CustomField customField) {
        this.customField = customField;
    }

    public LoanTransactionType withCustomField(CustomField customField) {
        this.customField = customField;
        return this;
    }

    public List<ReturnValue> getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(List<ReturnValue> returnValue) {
        this.returnValue = returnValue;
    }

    public LoanTransactionType withReturnValue(List<ReturnValue> returnValue) {
        this.returnValue = returnValue;
        return this;
    }

    public Boolean getIsSucceed() {
        return isSucceed;
    }

    public void setIsSucceed(Boolean isSucceed) {
        this.isSucceed = isSucceed;
    }

    public LoanTransactionType withIsSucceed(Boolean isSucceed) {
        this.isSucceed = isSucceed;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LoanTransactionType withMessage(String message) {
        this.message = message;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(customField);
        dest.writeList(returnValue);
        dest.writeValue(isSucceed);
        dest.writeValue(message);
    }

    public int describeContents() {
        return  0;
    }

}
