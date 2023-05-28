dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation(project(":dg-pay-domain"))
    implementation(project(":dg-pay-infrastructure"))
    testImplementation(testFixtures(project(":dg-pay-domain")))

    runtimeOnly("com.h2database:h2")
    testRuntimeOnly("com.h2database:h2")
}