import org.zaproxy.gradle.addon.AddOnStatus

plugins {
    id("java")
    id("org.zaproxy.add-on") version "0.11.0"
}

version = "0.0.1"
description = "Security testing tool"

zapAddOn {
    addOnName.set("MIG-T")
    zapVersion.set("2.16.0")
    addOnStatus.set(AddOnStatus.BETA)

    manifest {
        author.set("Security&Trust FBK")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.eclipse.jetty:jetty-server:11.0.15")
    implementation("org.eclipse.jetty:jetty-servlet:11.0.15")
    implementation("jakarta.servlet:jakarta.servlet-api:5.0.0")
    implementation("org.json:json:20240303")
    implementation("com.nimbusds:nimbus-jose-jwt:9.31")
    implementation("org.bouncycastle:bcpkix-jdk15on:1.70")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("org.seleniumhq.selenium:selenium-java:4.13.0")
    implementation("org.apache.santuario:xmlsec:3.0.0")
    implementation("com.sun.xml.security:xml-security-impl:1.0")
    implementation("com.jayway.jsonpath:json-path:2.9.0")
    implementation("net.minidev:json-smart:2.4.10")
    implementation("org.apache.httpcomponents:httpclient:4.5.14")
    implementation("org.apache.httpcomponents:httpcore:4.4.16")
    implementation("com.networknt:json-schema-validator:1.0.78")
    implementation("org.apache.commons:commons-text:1.10.0")
    implementation("commons-codec:commons-codec:1.17.1")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.apache.httpcomponents.core5:httpcore5:5.2")
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src/main/java", "common"))
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
