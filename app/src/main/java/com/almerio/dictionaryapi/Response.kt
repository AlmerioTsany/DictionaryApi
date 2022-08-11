package com.almerio.dictionaryapi

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("Response")
	val response: List<ResponseItem?>? = null
)

data class License(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class DefinitionsItem(

	@field:SerializedName("synonyms")
	val synonyms: List<Any?>? = null,

	@field:SerializedName("antonyms")
	val antonyms: List<Any?>? = null,

	@field:SerializedName("definition")
	val definition: String? = null,

	@field:SerializedName("example")
	val example: String? = null
)

data class ResponseItem(

	@field:SerializedName("license")
	val license: License? = null,

	@field:SerializedName("phonetic")
	val phonetic: String? = null,

	@field:SerializedName("phonetics")
	val phonetics: List<PhoneticsItem?>? = null,

	@field:SerializedName("word")
	val word: String? = null,

	@field:SerializedName("meanings")
	val meanings: List<MeaningsItem?>? = null,

	@field:SerializedName("sourceUrls")
	val sourceUrls: List<String?>? = null
)

data class MeaningsItem(

	@field:SerializedName("synonyms")
	val synonyms: List<String?>? = null,

	@field:SerializedName("partOfSpeech")
	val partOfSpeech: String? = null,

	@field:SerializedName("antonyms")
	val antonyms: List<Any?>? = null,

	@field:SerializedName("definitions")
	val definitions: List<DefinitionsItem?>? = null
)

data class PhoneticsItem(

	@field:SerializedName("sourceUrl")
	val sourceUrl: String? = null,

	@field:SerializedName("license")
	val license: License? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("audio")
	val audio: String? = null
)
