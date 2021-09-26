package com.github.sergeykuz1001.utbotgoplugin.services

import com.intellij.openapi.project.Project
import com.github.sergeykuz1001.utbotgoplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
