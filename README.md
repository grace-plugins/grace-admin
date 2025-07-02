[![Main branch build status](https://github.com/grace-plugins/grace-admin/workflows/Grace%20CI/badge.svg?style=flat)](https://github.com/grace-plugins/grace-admin/actions?query=workflow%3A%Grace+CI%22)
[![Apache 2.0 license](https://img.shields.io/badge/License-APACHE%202.0-green.svg?logo=APACHE&style=flat)](https://opensource.org/licenses/Apache-2.0)
[![Latest version on Maven Central](https://img.shields.io/maven-central/v/org.graceframework.plugins/admin.svg?label=Maven%20Central&logo=apache-maven&style=flat)](https://search.maven.org/search?q=g:org.graceframework.plugins)
[![Grace Document](https://img.shields.io/badge/Grace_Document-latest-blue?style=flat&logo=asciidoctor&logoColor=E40046&labelColor=ffffff&color=f49b06)](https://plugins.graceframework.org/grace-admin/latest/)
[![Grace on X](https://img.shields.io/twitter/follow/graceframework?style=social)](https://x.com/graceframework)

[![Groovy Version](https://img.shields.io/badge/Groovy-4.0.22-blue?style=flat&color=4298b8)](https://groovy-lang.org/releasenotes/groovy-4.0.html)
[![Grace Version](https://img.shields.io/badge/Grace-2023.0.0-blue?style=flat&color=f49b06)](https://github.com/graceframework/grace-framework/releases/tag/v2023.0.0)
[![Spring Boot Version](https://img.shields.io/badge/Spring_Boot-3.0.13-blue?style=flat&color=6db33f)](https://github.com/spring-projects/spring-boot/releases)

# Grace Admin Plugin

A powerful and flexible, extensible administration framework and management console for Grace.

## Grace Version

- Grace **2023.0.0**

## Usage

### Add `admin` plugin

Add `admin` plugin to your `build.gradle`,

```gradle

apply plugin: "org.graceframework.grace-gsp"

repositories {
    mavenCentral()
    maven {
        url "https://s01.oss.sonatype.org/content/repositories/snapshots/"
        mavenContent {
            snapshotsOnly()
        }
    }
}

dependencies {
    implementation "org.graceframework.plugins:dynamic-modules:1.0.0-SNAPSHOT"
    implementation "org.graceframework.plugins:admin:$adminVersion"
}

```

## Development

### Build from source

```
git clone https://github.com/grace-plugins/grace-admin.git
cd grace-admin
./gradlew publishToMavenLocal
```

## Ducumentation

* [1.0.x](https://plugins.graceframework.org/grace-admin/1.0.x/)

## Links

- [Grace Framework](https://github.com/graceframework/grace-framework)
- [Grace Plugins](https://github.com/grace-plugins)
- [Grace Dynamic Modules Plugin](https://github.com/grace-plugins/grace-dynamic-modules)
- [Grace Admin Console Guide](https://github.com/grace-guides/gs-admin-console)
