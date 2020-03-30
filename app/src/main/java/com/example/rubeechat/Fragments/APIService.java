package com.example.rubeechat.Fragments;

import com.example.rubeechat.Notifications.MyResponse;
import com.example.rubeechat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAHwpaxpI:APA91bH3mDi9hnT_QXO-Qn0GpXXgaqyVb8wO57R5MJ97p_PD5xIzhsHdTWuklG5u2BjerB6LwBwEz4SQMra_c3vRaWBbdvZoIX7_VxYEMVzQqeK0Y52_HqrBfEXnrSmQNRFjGQMxB0Sv"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
