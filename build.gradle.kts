// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.spotless)
}

allprojects {
    apply(plugin = "com.diffplug.spotless")

    spotless {
        java {
            target("**/*.java")
            googleJavaFormat().aosp()
            removeUnusedImports()
            trimTrailingWhitespace()
            indentWithSpaces()
            endWithNewline()
        }

        kotlin {
            target("**/*.kt")
            ktlint()
            trimTrailingWhitespace()
            indentWithSpaces()
            endWithNewline()
        }

        kotlinGradle {
            target("**/*.gradle.kts", "*.gradle.kts")
            trimTrailingWhitespace()
            indentWithSpaces(4)
            endWithNewline()
        }

        format("misc") {
            target("**/*.gradle", "**/.gitattributes", "**/.gitignore")
            indentWithSpaces()
            trimTrailingWhitespace()
            endWithNewline()
        }

        format("xml") {
            target("**/*.xml")
            targetExclude(".idea/**")
            indentWithSpaces()
            trimTrailingWhitespace()
            endWithNewline()
        }
    }
}
