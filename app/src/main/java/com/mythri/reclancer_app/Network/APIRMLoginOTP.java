package com.mythri.reclancer_app.Network;

import com.mythri.reclancer_app.Model.FM_otpLogin;
import com.mythri.reclancer_app.Model.RM_otpLogin;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIRMLoginOTP {
    @POST("app_rmlogin")
    @FormUrlEncoded
    Call<RM_otpLogin> m_otplogin(@Field("mobile") String mobile,
                                 @Field("otp") String otp
    );
}
