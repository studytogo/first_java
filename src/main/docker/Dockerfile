FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD docker-study.jar app.jar
EXPOSE 8900
ENTRYPOINT ["java","-jar","/app.jar"]
