package com.dozkan.todoapp.data

object Database {
    private val toDoList = mutableListOf<toDo>()
    private val completedList = mutableListOf<toDo>()

    fun getToDo()= toDoList
    fun getCompleted()= completedList

    fun moveToCompleted(toDo: toDo) {
        toDoList.remove(toDo)
        toDo.completedOrNot = true
        completedList.add(toDo)
    }

    fun addList(title: String, desc: String, date: String, completedOrNot: Boolean, completed: Boolean) {
        toDoList.add(
            toDo(
                id = (toDoList.lastOrNull()?.id ?: 0) + 1,
                title = title,
                desc = desc,
                date = date,
                completedOrNot = completedOrNot,
                completed = completed
            )
        )
    }

    fun addCompletedList(title: String, desc: String, date: String, completedOrNot: Boolean, completed: Boolean) {
        completedList.add(
            toDo(
                id = (toDoList.lastOrNull()?.id ?: 0) + 1,
                title = title,
                desc = desc,
                date = date,
                completedOrNot = completedOrNot,
                completed = completed
            )
        )
    }
}