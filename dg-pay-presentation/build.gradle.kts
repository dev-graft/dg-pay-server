dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation(project(":dg-pay-domain"))
    testImplementation(testFixtures(project(":dg-pay-domain")))
    implementation(project(":dg-pay-infrastructure"))
}