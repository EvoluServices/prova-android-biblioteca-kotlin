plugins {
    kotlin("jvm") version "2.0.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("biblioteca.MainKt")
}

tasks.named<JavaExec>("run") {
    // Sem isto, o app não consegue ler o que você digita no terminal.
    standardInput = System.`in`
}

tasks.test {
    useJUnitPlatform()
}
