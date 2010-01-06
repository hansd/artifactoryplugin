package org.gradle.artifactoryplugin

import org.gradle.api.*

class ArtifactoryPlugin implements Plugin<Project> {
  def void use(Project project) {
    project.repositories {
      mavenRepo urls: project.someUrl
    }
  }
}
