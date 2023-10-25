package com.example.horoscopoapp.domain

import com.example.horoscopoapp.data.network.response.PredictionResponse
import com.example.horoscopoapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}