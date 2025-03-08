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
        maven("https://api.xposed.info/repo/") // Add the Xposed repository here (for plugins)
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url= uri ("https://api.xposed.info/") }
    }
rootProject.name = "AuraFrameFXmain"
include(":app") }
// settings.gradle.kts
include(":Lsposed")
