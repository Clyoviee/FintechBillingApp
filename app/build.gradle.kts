plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.fintechbillingapp"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.fintechbillingapp"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.constraintlayout)
// Parser Engine Gson & Retrofit Converter
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
// RecyclerView untuk menyajikan data list item
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}