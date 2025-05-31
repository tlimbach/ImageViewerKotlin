plugins {
    kotlin("jvm") version "1.9.0"
    id("org.openjfx.javafxplugin") version "0.0.14"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.openjfx:javafx-controls:21")
    implementation("org.openjfx:javafx-fxml:21")
}

javafx {
    version = "21"
    modules("javafx.controls", "javafx.fxml")
}

application {
    mainClass.set("viewer.MainAppKt") // passe an, falls dein Paket anders heißt
}