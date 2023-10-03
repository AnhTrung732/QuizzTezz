package com.example.quizztezz.util

import androidx.room.TypeConverter
import com.example.quizztezz.model.TagName
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TagListConverter {
    @TypeConverter
    fun fromTagList(tagList: List<TagName>): String {
        val gson = Gson()
        return gson.toJson(tagList)
    }

    @TypeConverter
    fun toTagList(tagListString: String): List<TagName> {
        val gson = Gson()
        val type = object : TypeToken<List<TagName>>() {}.type
        return gson.fromJson(tagListString, type)
    }
}