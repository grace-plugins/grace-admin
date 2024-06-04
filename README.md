[![Main branch build status](https://github.com/grace-plugins/grace-admin/workflows/Grace%20CI/badge.svg?style=flat)](https://github.com/grace-plugins/grace-admin/actions?query=workflow%3A%Grace+CI%22)
[![Apache 2.0 license](https://img.shields.io/badge/License-APACHE%202.0-green.svg?logo=APACHE&style=flat)](https://opensource.org/licenses/Apache-2.0)
[![Latest version on Maven Central](https://img.shields.io/maven-central/v/org.graceframework.plugins/admin.svg?label=Maven%20Central&logo=apache-maven&style=flat)](https://search.maven.org/search?q=g:org.graceframework.plugins)
[![Grace on X](https://img.shields.io/twitter/follow/graceframework?style=social)](https://twitter.com/graceframework)

# Grace Admin Plugin

A powerful and flexible, extensible administration framework and management console for Grace.

## Grace Version

- Grace **2022.1.0**

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
    implementation "org.graceframework:grace-plugin-dynamic-modules"
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

## What's New

### 0.1.0

* Refactor app and plugin directories
* Upgrade to Grace 2022.2.4
* Upgrade to Groovy 3.0.17

### 0.0.1

* Support Grace 2022.1.0+


## Links

- [Grace Framework](https://github.com/graceframework/grace-framework)
- [Grace Plugins](https://github.com/grace-plugins)
- [Grace Admin Console Guide](https://github.com/grace-guides/gs-admin-console)
