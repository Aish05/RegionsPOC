import com.example.latesttechstackpoc.flavor.getFlavorProperties
import com.example.latesttechstackpoc.flavor.Flavor

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.latesttechstackpoc"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.latesttechstackpoc"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
        debug {
            isMinifyEnabled = false
        }
    }
    flavorDimensions += "default"
    productFlavors {
        register(Flavor.US.country) {
            applicationIdSuffix = ".us"

        }
        register(Flavor.EU.country) {
            applicationIdSuffix = ".eu"
        }
    }
    sourceSets {
        map { it.java.srcDir("src/${it.name}/java") }
    }

    applicationVariants.all {

        // Use flavorName to get the flavor-specific properties
        val flavorProperties = getFlavorProperties(flavorName)

        // Set the flavor-specific implementation in BuildConfig
        buildConfigField( "String", "BASE_URL", "\"${flavorProperties.commonConfig.baseUrl}\"")
        mergedFlavor.manifestPlaceholders["googleMapsApiKey"] = flavorProperties.commonConfig.mapsKey
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    implementation("com.google.dagger:hilt-android:2.47")
    kapt("com.google.dagger:hilt-android-compiler:2.47")

    implementation("androidx.navigation:navigation-compose:2.7.4")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
    implementation("androidx.compose.material:material:1.5.4")
    implementation("androidx.compose.ui:ui:1.5.4")

    implementation("com.squareup.moshi:moshi:1.13.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.13.0")

}
