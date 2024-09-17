Retrofit
Retrofit is a type-safe HTTP client for Android and Java.

It will provide the classes and methods to allow our Android application to make HTTP calls to an API to GET, POST, PUT, and DELETE data.

Retrofit is a HTTP client, similar to the java.net.http HTTP client API library which is built-in to the Java language API, or the Spring WebFlux dependency. These libraries allow us to use their methods to make HTTP requests in our applications, abstracting away much of the code to implement this.

Find the Retrofit Gradle dependency on their website and paste it into the Gradle.build file under dependencies. It should be implementation 'com.squareup.retrofit2:retrofit:2.9.0'.
