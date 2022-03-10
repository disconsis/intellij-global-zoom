package com.github.disconsis.intellijglobalzoom.services

import com.intellij.openapi.project.Project
import com.github.disconsis.intellijglobalzoom.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
