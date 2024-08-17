pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven{setUrl("https://jitpack.io")}
        maven {
            setUrl("https://api.mapbox.com/downloads/v2/releases/maven")
            authentication {
                create<BasicAuthentication>("basic")
            }
            credentials {
                // Do not change the username below.
                // This should always be `mapbox` (not your username).
                username = "mapbox"
                // Use the secret token you stored in gradle.properties as the password
                password = "sk.eyJ1IjoiYXJpdHJhOTc4OCIsImEiOiJjbG16MmRyM2YwNHFpMm9tdmVhczB3N3lxIn0.M6EB7L_JPbxuM9T_i0ExFA"
            }
        }
    }

}

rootProject.name = "WasteMangement"
include(":app")
 