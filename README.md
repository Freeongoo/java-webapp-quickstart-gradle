# Quick start java web with gradle

An example of a quick launch of a web application to Java using the gradle with testing (unit and integration)

## Getting Started

Use gradle 4.6 or higher

`cp config.properties.dist config.properties`  
Change the parameters "port" and "context" if needed

## Gradle tasks

`./gradlew appRun` - run web server and deploy  
`./gradlew build` - build with run test  
`./gradlew test` - run selenium test  

## Built With

* [Gradle](https://gradle.org/)
* [gretty](https://github.com/akhikhl/gretty)
* [jUnit](https://junit.org/junit4/)
* [Selenium](https://www.seleniumhq.org/)
