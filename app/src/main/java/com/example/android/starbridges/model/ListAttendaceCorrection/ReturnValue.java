
package com.example.android.starbridges.model.ListAttendaceCorrection;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReturnValue implements Serializable, Parcelable
{

    @SerializedName("UID")
    @Expose
    private String uID;
    @SerializedName("LogDate")
    @Expose
    private String logDate;
    @SerializedName("Day")
    @Expose
    private String day;
    @SerializedName("DayType")
    @Expose
    private String dayType;
    @SerializedName("ProcessStep")
    @Expose
    private String processStep;
    @SerializedName("StatusCode")
    @Expose
    private String statusCode;
    @SerializedName("LogIn")
    @Expose
    private Object logIn;
    @SerializedName("LateLogIn")
    @Expose
    private int lateLogIn;
    @SerializedName("BreakStart")
    @Expose
    private Object breakStart;
    @SerializedName("EarlyBreakStart")
    @Expose
    private int earlyBreakStart;
    @SerializedName("BreakEnd")
    @Expose
    private Object breakEnd;
    @SerializedName("LateBreakEnd")
    @Expose
    private int lateBreakEnd;
    @SerializedName("LogOut")
    @Expose
    private Object logOut;
    @SerializedName("EarlyLogOut")
    @Expose
    private int earlyLogOut;
    @SerializedName("TotalWorkingHours")
    @Expose
    private int totalWorkingHours;
    @SerializedName("MinPayableDuration")
    @Expose
    private Object minPayableDuration;
    @SerializedName("RequestedOvertime")
    @Expose
    private String requestedOvertime;
    @SerializedName("Overtime")
    @Expose
    private String overtime;
    @SerializedName("OvertimeDuration")
    @Expose
    private int overtimeDuration;
    @SerializedName("Leave")
    @Expose
    private String leave;
    @SerializedName("LeaveAt")
    @Expose
    private Object leaveAt;
    @SerializedName("ReturnAt")
    @Expose
    private Object returnAt;
    @SerializedName("IsPaidLeave")
    @Expose
    private boolean isPaidLeave;
    @SerializedName("IsHoliday")
    @Expose
    private boolean isHoliday;
    @SerializedName("IsLeaveHalfDay")
    @Expose
    private boolean isLeaveHalfDay;
    @SerializedName("FullAccess")
    @Expose
    private boolean fullAccess;
    @SerializedName("ExclusionFields")
    @Expose
    private List<Object> exclusionFields = null;
    @SerializedName("AccessibilityAttribute")
    @Expose
    private String accessibilityAttribute;
    public final static Parcelable.Creator<ReturnValue> CREATOR = new Creator<ReturnValue>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ReturnValue createFromParcel(Parcel in) {
            return new ReturnValue(in);
        }

        public ReturnValue[] newArray(int size) {
            return (new ReturnValue[size]);
        }

    }
    ;
    private final static long serialVersionUID = 507509051464624693L;

    protected ReturnValue(Parcel in) {
        this.uID = ((String) in.readValue((String.class.getClassLoader())));
        this.logDate = ((String) in.readValue((String.class.getClassLoader())));
        this.day = ((String) in.readValue((String.class.getClassLoader())));
        this.dayType = ((String) in.readValue((String.class.getClassLoader())));
        this.processStep = ((String) in.readValue((String.class.getClassLoader())));
        this.statusCode = ((String) in.readValue((String.class.getClassLoader())));
        this.logIn = ((Object) in.readValue((Object.class.getClassLoader())));
        this.lateLogIn = ((int) in.readValue((int.class.getClassLoader())));
        this.breakStart = ((Object) in.readValue((Object.class.getClassLoader())));
        this.earlyBreakStart = ((int) in.readValue((int.class.getClassLoader())));
        this.breakEnd = ((Object) in.readValue((Object.class.getClassLoader())));
        this.lateBreakEnd = ((int) in.readValue((int.class.getClassLoader())));
        this.logOut = ((Object) in.readValue((Object.class.getClassLoader())));
        this.earlyLogOut = ((int) in.readValue((int.class.getClassLoader())));
        this.totalWorkingHours = ((int) in.readValue((int.class.getClassLoader())));
        this.minPayableDuration = ((Object) in.readValue((Object.class.getClassLoader())));
        this.requestedOvertime = ((String) in.readValue((String.class.getClassLoader())));
        this.overtime = ((String) in.readValue((String.class.getClassLoader())));
        this.overtimeDuration = ((int) in.readValue((int.class.getClassLoader())));
        this.leave = ((String) in.readValue((String.class.getClassLoader())));
        this.leaveAt = ((Object) in.readValue((Object.class.getClassLoader())));
        this.returnAt = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isPaidLeave = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isHoliday = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isLeaveHalfDay = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.fullAccess = ((boolean) in.readValue((boolean.class.getClassLoader())));
        in.readList(this.exclusionFields, (java.lang.Object.class.getClassLoader()));
        this.accessibilityAttribute = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReturnValue() {
    }

    /**
     * 
     * @param accessibilityAttribute
     * @param leaveAt
     * @param uID
     * @param breakEnd
     * @param earlyBreakStart
     * @param statusCode
     * @param isPaidLeave
     * @param leave
     * @param processStep
     * @param dayType
     * @param minPayableDuration
     * @param overtimeDuration
     * @param lateLogIn
     * @param totalWorkingHours
     * @param fullAccess
     * @param lateBreakEnd
     * @param isHoliday
     * @param isLeaveHalfDay
     * @param logDate
     * @param requestedOvertime
     * @param exclusionFields
     * @param breakStart
     * @param logOut
     * @param earlyLogOut
     * @param day
     * @param logIn
     * @param returnAt
     * @param overtime
     */
    public ReturnValue(String uID, String logDate, String day, String dayType, String processStep, String statusCode, Object logIn, int lateLogIn, Object breakStart, int earlyBreakStart, Object breakEnd, int lateBreakEnd, Object logOut, int earlyLogOut, int totalWorkingHours, Object minPayableDuration, String requestedOvertime, String overtime, int overtimeDuration, String leave, Object leaveAt, Object returnAt, boolean isPaidLeave, boolean isHoliday, boolean isLeaveHalfDay, boolean fullAccess, List<Object> exclusionFields, String accessibilityAttribute) {
        super();
        this.uID = uID;
        this.logDate = logDate;
        this.day = day;
        this.dayType = dayType;
        this.processStep = processStep;
        this.statusCode = statusCode;
        this.logIn = logIn;
        this.lateLogIn = lateLogIn;
        this.breakStart = breakStart;
        this.earlyBreakStart = earlyBreakStart;
        this.breakEnd = breakEnd;
        this.lateBreakEnd = lateBreakEnd;
        this.logOut = logOut;
        this.earlyLogOut = earlyLogOut;
        this.totalWorkingHours = totalWorkingHours;
        this.minPayableDuration = minPayableDuration;
        this.requestedOvertime = requestedOvertime;
        this.overtime = overtime;
        this.overtimeDuration = overtimeDuration;
        this.leave = leave;
        this.leaveAt = leaveAt;
        this.returnAt = returnAt;
        this.isPaidLeave = isPaidLeave;
        this.isHoliday = isHoliday;
        this.isLeaveHalfDay = isLeaveHalfDay;
        this.fullAccess = fullAccess;
        this.exclusionFields = exclusionFields;
        this.accessibilityAttribute = accessibilityAttribute;
    }

    public String getUID() {
        return uID;
    }

    public void setUID(String uID) {
        this.uID = uID;
    }

    public ReturnValue withUID(String uID) {
        this.uID = uID;
        return this;
    }

    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    public ReturnValue withLogDate(String logDate) {
        this.logDate = logDate;
        return this;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public ReturnValue withDay(String day) {
        this.day = day;
        return this;
    }

    public String getDayType() {
        return dayType;
    }

    public void setDayType(String dayType) {
        this.dayType = dayType;
    }

    public ReturnValue withDayType(String dayType) {
        this.dayType = dayType;
        return this;
    }

    public String getProcessStep() {
        return processStep;
    }

    public void setProcessStep(String processStep) {
        this.processStep = processStep;
    }

    public ReturnValue withProcessStep(String processStep) {
        this.processStep = processStep;
        return this;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public ReturnValue withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public Object getLogIn() {
        return logIn;
    }

    public void setLogIn(Object logIn) {
        this.logIn = logIn;
    }

    public ReturnValue withLogIn(Object logIn) {
        this.logIn = logIn;
        return this;
    }

    public int getLateLogIn() {
        return lateLogIn;
    }

    public void setLateLogIn(int lateLogIn) {
        this.lateLogIn = lateLogIn;
    }

    public ReturnValue withLateLogIn(int lateLogIn) {
        this.lateLogIn = lateLogIn;
        return this;
    }

    public Object getBreakStart() {
        return breakStart;
    }

    public void setBreakStart(Object breakStart) {
        this.breakStart = breakStart;
    }

    public ReturnValue withBreakStart(Object breakStart) {
        this.breakStart = breakStart;
        return this;
    }

    public int getEarlyBreakStart() {
        return earlyBreakStart;
    }

    public void setEarlyBreakStart(int earlyBreakStart) {
        this.earlyBreakStart = earlyBreakStart;
    }

    public ReturnValue withEarlyBreakStart(int earlyBreakStart) {
        this.earlyBreakStart = earlyBreakStart;
        return this;
    }

    public Object getBreakEnd() {
        return breakEnd;
    }

    public void setBreakEnd(Object breakEnd) {
        this.breakEnd = breakEnd;
    }

    public ReturnValue withBreakEnd(Object breakEnd) {
        this.breakEnd = breakEnd;
        return this;
    }

    public int getLateBreakEnd() {
        return lateBreakEnd;
    }

    public void setLateBreakEnd(int lateBreakEnd) {
        this.lateBreakEnd = lateBreakEnd;
    }

    public ReturnValue withLateBreakEnd(int lateBreakEnd) {
        this.lateBreakEnd = lateBreakEnd;
        return this;
    }

    public Object getLogOut() {
        return logOut;
    }

    public void setLogOut(Object logOut) {
        this.logOut = logOut;
    }

    public ReturnValue withLogOut(Object logOut) {
        this.logOut = logOut;
        return this;
    }

    public int getEarlyLogOut() {
        return earlyLogOut;
    }

    public void setEarlyLogOut(int earlyLogOut) {
        this.earlyLogOut = earlyLogOut;
    }

    public ReturnValue withEarlyLogOut(int earlyLogOut) {
        this.earlyLogOut = earlyLogOut;
        return this;
    }

    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

    public void setTotalWorkingHours(int totalWorkingHours) {
        this.totalWorkingHours = totalWorkingHours;
    }

    public ReturnValue withTotalWorkingHours(int totalWorkingHours) {
        this.totalWorkingHours = totalWorkingHours;
        return this;
    }

    public Object getMinPayableDuration() {
        return minPayableDuration;
    }

    public void setMinPayableDuration(Object minPayableDuration) {
        this.minPayableDuration = minPayableDuration;
    }

    public ReturnValue withMinPayableDuration(Object minPayableDuration) {
        this.minPayableDuration = minPayableDuration;
        return this;
    }

    public String getRequestedOvertime() {
        return requestedOvertime;
    }

    public void setRequestedOvertime(String requestedOvertime) {
        this.requestedOvertime = requestedOvertime;
    }

    public ReturnValue withRequestedOvertime(String requestedOvertime) {
        this.requestedOvertime = requestedOvertime;
        return this;
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }

    public ReturnValue withOvertime(String overtime) {
        this.overtime = overtime;
        return this;
    }

    public int getOvertimeDuration() {
        return overtimeDuration;
    }

    public void setOvertimeDuration(int overtimeDuration) {
        this.overtimeDuration = overtimeDuration;
    }

    public ReturnValue withOvertimeDuration(int overtimeDuration) {
        this.overtimeDuration = overtimeDuration;
        return this;
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave;
    }

    public ReturnValue withLeave(String leave) {
        this.leave = leave;
        return this;
    }

    public Object getLeaveAt() {
        return leaveAt;
    }

    public void setLeaveAt(Object leaveAt) {
        this.leaveAt = leaveAt;
    }

    public ReturnValue withLeaveAt(Object leaveAt) {
        this.leaveAt = leaveAt;
        return this;
    }

    public Object getReturnAt() {
        return returnAt;
    }

    public void setReturnAt(Object returnAt) {
        this.returnAt = returnAt;
    }

    public ReturnValue withReturnAt(Object returnAt) {
        this.returnAt = returnAt;
        return this;
    }

    public boolean isIsPaidLeave() {
        return isPaidLeave;
    }

    public void setIsPaidLeave(boolean isPaidLeave) {
        this.isPaidLeave = isPaidLeave;
    }

    public ReturnValue withIsPaidLeave(boolean isPaidLeave) {
        this.isPaidLeave = isPaidLeave;
        return this;
    }

    public boolean isIsHoliday() {
        return isHoliday;
    }

    public void setIsHoliday(boolean isHoliday) {
        this.isHoliday = isHoliday;
    }

    public ReturnValue withIsHoliday(boolean isHoliday) {
        this.isHoliday = isHoliday;
        return this;
    }

    public boolean isIsLeaveHalfDay() {
        return isLeaveHalfDay;
    }

    public void setIsLeaveHalfDay(boolean isLeaveHalfDay) {
        this.isLeaveHalfDay = isLeaveHalfDay;
    }

    public ReturnValue withIsLeaveHalfDay(boolean isLeaveHalfDay) {
        this.isLeaveHalfDay = isLeaveHalfDay;
        return this;
    }

    public boolean isFullAccess() {
        return fullAccess;
    }

    public void setFullAccess(boolean fullAccess) {
        this.fullAccess = fullAccess;
    }

    public ReturnValue withFullAccess(boolean fullAccess) {
        this.fullAccess = fullAccess;
        return this;
    }

    public List<Object> getExclusionFields() {
        return exclusionFields;
    }

    public void setExclusionFields(List<Object> exclusionFields) {
        this.exclusionFields = exclusionFields;
    }

    public ReturnValue withExclusionFields(List<Object> exclusionFields) {
        this.exclusionFields = exclusionFields;
        return this;
    }

    public String getAccessibilityAttribute() {
        return accessibilityAttribute;
    }

    public void setAccessibilityAttribute(String accessibilityAttribute) {
        this.accessibilityAttribute = accessibilityAttribute;
    }

    public ReturnValue withAccessibilityAttribute(String accessibilityAttribute) {
        this.accessibilityAttribute = accessibilityAttribute;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(uID);
        dest.writeValue(logDate);
        dest.writeValue(day);
        dest.writeValue(dayType);
        dest.writeValue(processStep);
        dest.writeValue(statusCode);
        dest.writeValue(logIn);
        dest.writeValue(lateLogIn);
        dest.writeValue(breakStart);
        dest.writeValue(earlyBreakStart);
        dest.writeValue(breakEnd);
        dest.writeValue(lateBreakEnd);
        dest.writeValue(logOut);
        dest.writeValue(earlyLogOut);
        dest.writeValue(totalWorkingHours);
        dest.writeValue(minPayableDuration);
        dest.writeValue(requestedOvertime);
        dest.writeValue(overtime);
        dest.writeValue(overtimeDuration);
        dest.writeValue(leave);
        dest.writeValue(leaveAt);
        dest.writeValue(returnAt);
        dest.writeValue(isPaidLeave);
        dest.writeValue(isHoliday);
        dest.writeValue(isLeaveHalfDay);
        dest.writeValue(fullAccess);
        dest.writeList(exclusionFields);
        dest.writeValue(accessibilityAttribute);
    }

    public int describeContents() {
        return  0;
    }

}
