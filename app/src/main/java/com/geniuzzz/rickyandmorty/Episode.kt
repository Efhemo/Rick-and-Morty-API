package com.geniuzzz.rickyandmorty

class Episode(
    val info: Info,
    val results: List<Result>

)
class Result(
    val air_date: String,
    val characters: List<String>,
    val created: String,
    val episode: String,
    val id: Int,
    val name: String,
    val url: String
)
class Info(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: String
)

