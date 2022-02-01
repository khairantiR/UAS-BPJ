package com.informatika.khairantirahmawati_19100021_kalkulator.model

import com.google.gson.annotations.SerializedName

data class ResponseActionBarang(

	@field:SerializedName("pesan")
	val pesan: String? = null,

	@field:SerializedName("data")
	val data: List<Boolean?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)
