pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PassSecure"
include(":app")
include(":core:data")
include(":core:database")
include(":core:ui")
include(":core:common")
include(":core:domain")
include(":feature:login")
include(":feature:passwordstore")
include(":feature:passwordgenerator")
