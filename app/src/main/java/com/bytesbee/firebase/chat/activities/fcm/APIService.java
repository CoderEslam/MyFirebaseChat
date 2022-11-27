package com.bytesbee.firebase.chat.activities.fcm;

import com.bytesbee.firebase.chat.activities.fcmmodels.MyResponse;
import com.bytesbee.firebase.chat.activities.fcmmodels.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization: key=AAAAQDJOXkk:APA91bFADhLGDO7-K7mY4XQKMSwb6TAOWluyvO6jZHke5GPajmQ1hcxiE6XzJdHq-st-4MRuSrhuuhgw2y24vmpJ2pV0Eo1ByYSkbZ0bLZGm7EBFUNhRN3-3E6S_-yJDZd1EoVTlYVXD"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
