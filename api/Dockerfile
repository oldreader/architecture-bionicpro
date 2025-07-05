FROM gradle:jdk17-graal AS BUILD
WORKDIR /usr/app/
COPY . .
RUN gradle clean build

# Package stage

FROM openjdk:latest
ENV JAR_NAME=api-0.0.1-SNAPSHOT.jar
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --from=BUILD $APP_HOME .
EXPOSE 8000
ENTRYPOINT exec java -Dlogging.level.org.springframework=debug -jar $APP_HOME/build/libs/$JAR_NAME