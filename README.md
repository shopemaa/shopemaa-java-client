<img src="https://shopemaa.com/assets/homev2/images/shopemaa/shopemaa.png" alt="" height="150" /> 

# Shopemaa Java Client

![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/shopemaa/shopemaa-java-client?display_name=tag&label=current%20version)

Java library to use shopemaa features in your jvm based projects.

### Installation

##### Maven

* Add source

```text
<distributionManagement>
   <repository>
     <id>github</id>
     <name>GitHub OWNER Apache Maven Packages</name>
     <url>https://maven.pkg.github.com/shopemaa/shopemaa-java-client</url>
   </repository>
</distributionManagement>
```

* Add dependency

```text
<dependency>
  <groupId>com.shopemaa.client</groupId>
  <artifactId>shopemaa-java-client</artifactId>
  <version>{version}</version>
</dependency>
```

#### Gradle

* Add source

```groovy
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/shopemaa/shopemaa-java-client")
    }
}
```

* Add dependency

```groovy
dependencies {
    implementation 'com.shopemaa.client:shopemaa-java-client:{version}'
}
```

# Contact

Shopemaa Support: support@shopemaa.com

# License

Licensed under the [MIT License](./LICENSE)