plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

buildscript{
    dependencies {
        // Add the Android Gradle plugin configuration, where {version} needs to be replaced with the actual Gradle plugin version, for example, 7.3.1.
        classpath (libs.android.plugin)
        // Add the AppGallery Connect plugin configuration. Please refer to AppGallery Connect Plugin Dependency to select a proper plugin version.
        classpath (libs.agconnect.agcp)
    }
}
