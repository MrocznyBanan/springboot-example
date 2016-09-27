FROM airhacks/java
MAINTAINER Mroczny Banan, mrocznybanan.eu
EXPOSE 9000
ADD ./target/springboot-0.0.1-SNAPSHOT.jar springboot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","springboot-0.0.1-SNAPSHOT.jar"]