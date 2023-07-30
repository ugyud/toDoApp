package com.dozkan.todoapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

    @Parcelize
    data class toDo(
        val id: Int,
        val title: String,
        val desc: String?,
        val date: String,
        var completedOrNot: Boolean,
        var completed: Boolean
    ): Parcelable
