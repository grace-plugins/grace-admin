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

### 0.0.1-SNAPSHOT

* Support Grace 2022.1.0+


## Links

- [Grace Framework](https://github.com/graceframework/grace-framework)
- [Grace Plugins](https://github.com/grace-plugins)
- [Grace Admin Console Guide](https://github.com/grace-guides/gs-admin-console)
