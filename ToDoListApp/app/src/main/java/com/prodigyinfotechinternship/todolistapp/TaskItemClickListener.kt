package com.prodigyinfotechinternship.todolistapp

interface TaskItemClickListener {

    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
    fun deleteTask(taskItem: TaskItem)

}