Current Version: [![](https://jitpack.io/v/CraptiCraft-Development/ClansLite-API.svg)](https://jitpack.io/#CraptiCraft-Development/ClansLite-API)

# ClansLite-API
The API for ClansLite.

# IMPORTANT
**When adding this jar to your project, remember to exclude from your plugin at build and just depend on it as the API itself is provided by the main ClansLite jar!**

# Adding using Maven
* Repository:
```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
* Dependency
```
	<dependency>
	    <groupId>com.github.CraptiCraft-Development</groupId>
	    <artifactId>ClansLite-API</artifactId>
	    <version>[CURRENT-VERSION]</version>
	</dependency>
```

# Adding using Gradle
* build.gradle
```
	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```
* Dependency
```
	dependencies {
	        implementation 'com.github.CraptiCraft-Development:ClansLite-API:[CURRENT-VERSION]'
	}
```
