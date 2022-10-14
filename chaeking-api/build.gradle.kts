dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")

    kapt("org.springframework.boot:spring-boot-configuration-processor")

    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
    runtimeOnly("org.mariadb:r2dbc-mariadb:1.1.2")

    implementation("io.springfox:springfox-boot-starter:3.0.0")

    implementation("io.netty:netty-resolver-dns-native-macos:4.1.82.Final:osx-aarch_64")
}

tasks.bootJar {
    archiveFileName.set("chaeking-api.jar")
}