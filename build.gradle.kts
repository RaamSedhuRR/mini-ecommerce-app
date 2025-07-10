// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false  // Android application plugin (apply false to avoid auto-apply)
    alias(libs.plugins.kotlin.android) apply false       // Kotlin plugin for Android (apply false to avoid auto-apply)
    alias(libs.plugins.kotlin.compose) apply false      // Kotlin plugin for Jetpack Compose (apply false to avoid auto-apply)
}
