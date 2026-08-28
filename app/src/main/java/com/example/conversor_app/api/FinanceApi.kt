package com.example.conversor_app.api

import com.example.conversor_app.model.FinanceResponse
import retrofit2.Call
import retrofit2.http.GET

interface FinanceApi {
    @GET ("finance?key=d18b57f7")
    fun getCotacoes() : Call<FinanceResponse>

}