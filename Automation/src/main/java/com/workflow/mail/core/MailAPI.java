/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workflow.mail.core;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 *
 * @author USER
 */
public interface MailAPI {

    @POST("ProcessEmailFunction")
    Call<Void> sendMail(@Body MailItem pMailItem, @Query("code") String requestType);

}
