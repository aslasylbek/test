package com.example.uib_cit.kolesatest;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Date;

public class AnalyticsModel {

    @NonNull
    private String mSection;
    @Nullable
    private String mSubsection;
    @Nullable
    private String mCategory;
    @NonNull
    private String mRegionAlias;
    @Nullable
    private String mAddress;
    private float mLatitude;
    private float mLongitude;
    @NonNull
    private String mTitle;
    @Nullable
    private String mSubTitle;
    @Nullable
    private String mText;
    @NonNull
    private String mPhone;
    @Nullable
    private String mEmail;
    @NonNull
    private Date mCreateDate;

    public AnalyticsModel(
            @NonNull String section,
            @Nullable String subsection,
            @Nullable String category,
            @NonNull String regionAlias,
            @Nullable String address,
            float latitude,
            float longitude,
            @NonNull String title,
            @Nullable String subTitle,
            @Nullable String text,
            @NonNull String phone,
            @Nullable String email,
            @NonNull Date createDate
    ) {
        mSection = section;
        mSubsection = subsection;
        mCategory = category;
        mRegionAlias = regionAlias;
        mAddress = address;
        mLatitude = latitude;
        mLongitude = longitude;
        mTitle = title;
        mSubTitle = subTitle;
        mText = text;
        mPhone = phone;
        mEmail = email;
        mCreateDate = createDate;
    }

    public AnalyticsModel(
            @NonNull String section,
            @Nullable String subsection,
            @Nullable String category
    ) {
        mSection = section;
        mSubsection = subsection;
        mCategory = category;
    }

    public AnalyticsModel(@NonNull String section) {
        this(section, null, null);
    }

    public AnalyticsModel(
            @Nullable String address,
            float latitude,
            float longitude
    ) {
        mAddress = address;
        mLatitude = latitude;
        mLongitude = longitude;
    }

    @NonNull
    public String getSection() {
        return mSection;
    }

    public void setSection(@NonNull String section) {
        mSection = section;
    }

    @Nullable
    public String getSubsection() {
        return mSubsection;
    }

    public void setSubsection(@Nullable String subsection) {
        mSubsection = subsection;
    }

    @Nullable
    public String getCategory() {
        return mCategory;
    }

    public void setCategory(@Nullable String category) {
        mCategory = category;
    }

    @NonNull
    public String getRegionAlias() {
        return mRegionAlias;
    }

    public void setRegionAlias(@NonNull String regionAlias) {
        mRegionAlias = regionAlias;
    }

    @Nullable
    public String getAddress() {
        return mAddress;
    }

    public void setAddress(@Nullable String address) {
        mAddress = address;
    }

    public float getLatitude() {
        return mLatitude;
    }

    public void setLatitude(float latitude) {
        mLatitude = latitude;
    }

    public float getLongitude() {
        return mLongitude;
    }

    public void setLongitude(float longitude) {
        mLongitude = longitude;
    }

    @NonNull
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(@NonNull String title) {
        mTitle = title;
    }

    @Nullable
    public String getSubTitle() {
        return mSubTitle;
    }

    public void setSubTitle(@Nullable String subTitle) {
        mSubTitle = subTitle;
    }

    @Nullable
    public String getText() {
        return mText;
    }

    public void setText(@Nullable String text) {
        mText = text;
    }

    @NonNull
    public String getPhone() {
        return mPhone;
    }

    public void setPhone(@NonNull String phone) {
        mPhone = phone;
    }

    @Nullable
    public String getEmail() {
        return mEmail;
    }

    public void setEmail(@Nullable String email) {
        mEmail = email;
    }

    @NonNull
    public Date getCreateDate() {
        return mCreateDate;
    }

    public void setCreateDate(@NonNull Date createDate) {
        mCreateDate = createDate;
    }
}